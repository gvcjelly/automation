
package com.services.bwin.xmlns.types.earlypayoutservice._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetEarlyPayoutConstraintsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetEarlyPayoutConstraintsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EarlyPayoutIsAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetEarlyPayoutConstraintsResponse", propOrder = {
    "earlyPayoutIsAllowed"
})
public class GetEarlyPayoutConstraintsResponse {

    @XmlElement(name = "EarlyPayoutIsAllowed")
    protected Boolean earlyPayoutIsAllowed;

    /**
     * Gets the value of the earlyPayoutIsAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEarlyPayoutIsAllowed() {
        return earlyPayoutIsAllowed;
    }

    /**
     * Sets the value of the earlyPayoutIsAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEarlyPayoutIsAllowed(Boolean value) {
        this.earlyPayoutIsAllowed = value;
    }

}
