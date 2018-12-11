
package com.bwin.xmlns.services.earlypayoutservice._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EarlyPayoutResult" type="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}EarlyPayoutResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "earlyPayoutResult"
})
@XmlRootElement(name = "EarlyPayoutResponse")
public class EarlyPayoutResponse {

    @XmlElementRef(name = "EarlyPayoutResult", namespace = "http://xmlns.bwin.com/services/EarlyPayoutService/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<com.bwin.xmlns.types.earlypayoutservice._3.EarlyPayoutResponse> earlyPayoutResult;

    /**
     * Gets the value of the earlyPayoutResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.bwin.xmlns.types.earlypayoutservice._3.EarlyPayoutResponse }{@code >}
     *     
     */
    public JAXBElement<com.bwin.xmlns.types.earlypayoutservice._3.EarlyPayoutResponse> getEarlyPayoutResult() {
        return earlyPayoutResult;
    }

    /**
     * Sets the value of the earlyPayoutResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.bwin.xmlns.types.earlypayoutservice._3.EarlyPayoutResponse }{@code >}
     *     
     */
    public void setEarlyPayoutResult(JAXBElement<com.bwin.xmlns.types.earlypayoutservice._3.EarlyPayoutResponse> value) {
        this.earlyPayoutResult = value;
    }

}
