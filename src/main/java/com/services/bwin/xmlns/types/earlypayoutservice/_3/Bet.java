
package com.services.bwin.xmlns.types.earlypayoutservice._3;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Bet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EditBetData" type="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}EditBetData" minOccurs="0"/>
 *         &lt;element name="PayoutAcceptance" type="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}PayoutAcceptanceMode"/>
 *         &lt;element name="UserExpectedPayout" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bet", propOrder = {
    "betNumber",
    "editBetData",
    "payoutAcceptance",
    "userExpectedPayout"
})
public class Bet {

    @XmlElement(name = "BetNumber", required = true, nillable = true)
    protected String betNumber;
    @XmlElementRef(name = "EditBetData", namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<EditBetData> editBetData;
    @XmlElement(name = "PayoutAcceptance", required = true)
    @XmlSchemaType(name = "string")
    protected PayoutAcceptanceMode payoutAcceptance;
    @XmlElement(name = "UserExpectedPayout", required = true)
    protected BigDecimal userExpectedPayout;

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
     * Gets the value of the editBetData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EditBetData }{@code >}
     *     
     */
    public JAXBElement<EditBetData> getEditBetData() {
        return editBetData;
    }

    /**
     * Sets the value of the editBetData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EditBetData }{@code >}
     *     
     */
    public void setEditBetData(JAXBElement<EditBetData> value) {
        this.editBetData = value;
    }

    /**
     * Gets the value of the payoutAcceptance property.
     * 
     * @return
     *     possible object is
     *     {@link PayoutAcceptanceMode }
     *     
     */
    public PayoutAcceptanceMode getPayoutAcceptance() {
        return payoutAcceptance;
    }

    /**
     * Sets the value of the payoutAcceptance property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayoutAcceptanceMode }
     *     
     */
    public void setPayoutAcceptance(PayoutAcceptanceMode value) {
        this.payoutAcceptance = value;
    }

    /**
     * Gets the value of the userExpectedPayout property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUserExpectedPayout() {
        return userExpectedPayout;
    }

    /**
     * Sets the value of the userExpectedPayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUserExpectedPayout(BigDecimal value) {
        this.userExpectedPayout = value;
    }

}
