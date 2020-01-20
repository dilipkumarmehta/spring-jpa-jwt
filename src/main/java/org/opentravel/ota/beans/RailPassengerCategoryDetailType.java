//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.14 at 08:08:31 PM GST 
//


package org.opentravel.ota.beans;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Category of Passengers with detail information (including name, contact info, travel profile) for passengers make up of a category.
 * 
 * <p>Java class for RailPassengerCategoryDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RailPassengerCategoryDetailType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RailPassengerCategoryType">
 *       &lt;sequence>
 *         &lt;element name="PassengerDetail" type="{http://www.opentravel.org/OTA/2003/05}RailPassengerDetailType" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailPassengerCategoryDetailType", propOrder = {
    "passengerDetail"
})
public class RailPassengerCategoryDetailType
    extends RailPassengerCategoryType
{

    @XmlElement(name = "PassengerDetail")
    protected List<RailPassengerDetailType> passengerDetail;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "Quantity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger quantity;

    /**
     * Gets the value of the passengerDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailPassengerDetailType }
     * 
     * 
     */
    public List<RailPassengerDetailType> getPassengerDetail() {
        if (passengerDetail == null) {
            passengerDetail = new ArrayList<RailPassengerDetailType>();
        }
        return this.passengerDetail;
    }

    /**
     * Gets the value of the rph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * Sets the value of the rph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

}