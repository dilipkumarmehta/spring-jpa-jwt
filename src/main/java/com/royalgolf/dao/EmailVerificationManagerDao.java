package com.royalgolf.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.royalgolf.entities.UserLogin;

/**
 * @author DilipMehta 1. Login 2. Logout 3. changePassword 4. resePassword 5.
 *         validateUserId
 */
@Repository
public interface EmailVerificationManagerDao extends JpaRepository<UserLogin, Long> {
	@Query(value = "{call API_VerifyEmail(:userId)}", nativeQuery = true)
	public UserLogin verifyEmail(
		//	@Param("transactionId") String transactionId,
		//	@Param("transactiontTyp") String transactiontTyp,
			@Param("userId") String userId);
}