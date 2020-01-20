package com.royalgolf.serviceimpl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.royalgolf.beans.RegistrationBean;
import com.royalgolf.beans.Status;
import com.royalgolf.entity.UserLoginBean;
import com.royalgolf.repository.AccountManagerRepository;
import com.royalgolf.service.AccountManagerService;
import com.royalgolf.service.EmailService;

@Service
public class AccountManagerServiceImpl implements AccountManagerService {
	private static Logger logger = LoggerFactory.getLogger(AccountManagerServiceImpl.class);

	@Autowired(required = true)
	private AccountManagerRepository userServiceRepository;

	@Autowired(required = true)
	private EmailService emailService;

	@Autowired
	RegistrationService registrationService;

	@Override
	public Status logIn(UserLoginBean userLoginBean) {
		Status status = new Status();
		Optional<UserLoginBean> loginUser = userServiceRepository.logIn(userLoginBean.getUserpwd(),
				userLoginBean.getEmailusername(), userLoginBean.getUserCode());

		System.out.println(userLoginBean.getUserpwd() + "\t" + userLoginBean.getEmailusername() + "\t"
				+ userLoginBean.getUserCode());
		if (loginUser.isPresent() && userLoginBean.getUserCode().equals(loginUser.get().getUserCode())) {
			status.setSuccess_message("Login success");
			status.setSuccess_code("200");
			return status;
		}
		status.setError_message("Invalid user name or password");
		status.setError_code("401");
		return status;
	}

	@Override
	public UserLoginBean verifyEmailusername(String emailusername) {
		UserLoginBean findByemailId = userServiceRepository.findByemailusername(emailusername);
		return findByemailId;
	}

	@Override
	public Status registerUser(RegistrationBean registrationBean) {
		Status registration = registrationService.registration(registrationBean);
		if (registration!=null &&registration.getSuccess_code().equals("200")) {
			emailService.sendEmail("dilip.kmd1@gmail.com", "succesfully register", "http://localhost:8089/account/verify-account?email=dilip%40gmail.com");
		}
		return registration;
	}

	@Override
	public Status sendEmail(String email, String subject, String text) {
		emailService.sendEmail(email, subject, text);
		return null;
	}

}