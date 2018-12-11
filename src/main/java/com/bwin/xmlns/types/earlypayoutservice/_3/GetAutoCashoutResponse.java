
package com.bwin.xmlns.types.earlypayoutservice._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAutoCashoutResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAutoCashoutResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AutoCashoutBets" type="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}ArrayOfAutoCashoutBet"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAutoCashoutResponse", propOrder = {
    "autoCashoutBets"
})
public class GetAutoCashoutResponse {

    @XmlElement(name = "AutoCashoutBets", required = true, nillable = true)
    protected ArrayOfAutoCashoutBet autoCashoutBets;

    /**
     * Gets the value of the autoCashoutBets property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAutoCashoutBet }
     *     
     */
    public ArrayOfAutoCashoutBet getAutoCashoutBets() {
        return autoCashoutBets;
    }

    /**
     * Sets the value of the autoCashoutBets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAutoCashoutBet }
     *     
     */
    public void setAutoCashoutBets(ArrayOfAutoCashoutBet value) {
        this.autoCashoutBets = value;
    }

}
