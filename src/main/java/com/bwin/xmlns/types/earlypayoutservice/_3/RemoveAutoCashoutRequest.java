
package com.bwin.xmlns.types.earlypayoutservice._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemoveAutoCashoutRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoveAutoCashoutRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AutoCashoutType" type="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}AutoCashoutType"/>
 *         &lt;element name="BetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Customer" type="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}Customer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveAutoCashoutRequest", propOrder = {
    "autoCashoutType",
    "betNumber",
    "customer"
})
public class RemoveAutoCashoutRequest {

    @XmlElement(name = "AutoCashoutType", required = true)
    @XmlSchemaType(name = "string")
    protected AutoCashoutType autoCashoutType;
    @XmlElement(name = "BetNumber", required = true, nillable = true)
    protected String betNumber;
    @XmlElement(name = "Customer", required = true, nillable = true)
    protected Customer customer;

    /**
     * Gets the value of the autoCashoutType property.
     * 
     * @return
     *     possible object is
     *     {@link AutoCashoutType }
     *     
     */
    public AutoCashoutType getAutoCashoutType() {
        return autoCashoutType;
    }

    /**
     * Sets the value of the autoCashoutType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoCashoutType }
     *     
     */
    public void setAutoCashoutType(AutoCashoutType value) {
        this.autoCashoutType = value;
    }

    /**
     * Gets the value of the betNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBetNumber() {
        return betNumber;
    }

    /**
     * Sets the value of the betNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBetNumber(String value) {
        this.betNumber = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setCustomer(Customer value) {
        this.customer = value;
    }

}
