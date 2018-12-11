
package com.bwin.xmlns.types.earlypayoutservice._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EarlyPayoutBet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EarlyPayoutBet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EditBetData" type="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}EditBetData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EarlyPayoutBet", propOrder = {
    "betNumber",
    "editBetData"
})
public class EarlyPayoutBet {

    @XmlElement(name = "BetNumber", required = true, nillable = true)
    protected String betNumber;
    @XmlElementRef(name = "EditBetData", namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<EditBetData> editBetData;

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

}
