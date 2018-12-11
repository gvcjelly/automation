
package com.bwin.xmlns.types.earlypayoutservice._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BetNotAllowedForEarlyPayout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BetNotAllowedForEarlyPayout">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}EarlyPayoutError">
 *       &lt;sequence>
 *         &lt;element name="Reason" type="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}BetEarlyPayoutNotAllowedReason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BetNotAllowedForEarlyPayout", propOrder = {
    "reason"
})
public class BetNotAllowedForEarlyPayout
    extends EarlyPayoutError
{

    @XmlElement(name = "Reason")
    @XmlSchemaType(name = "string")
    protected BetEarlyPayoutNotAllowedReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link BetEarlyPayoutNotAllowedReason }
     *     
     */
    public BetEarlyPayoutNotAllowedReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link BetEarlyPayoutNotAllowedReason }
     *     
     */
    public void setReason(BetEarlyPayoutNotAllowedReason value) {
        this.reason = value;
    }

}
