
package com.services.bwin.xmlns.services.earlypayoutservice._3;

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
 *         &lt;element name="GetEarlyPayoutConstraintsResult" type="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}GetEarlyPayoutConstraintsResponse" minOccurs="0"/>
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
    "getEarlyPayoutConstraintsResult"
})
@XmlRootElement(name = "GetEarlyPayoutConstraintsResponse")
public class GetEarlyPayoutConstraintsResponse {

    @XmlElementRef(name = "GetEarlyPayoutConstraintsResult", namespace = "http://xmlns.bwin.com/services/EarlyPayoutService/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<com.services.bwin.xmlns.types.earlypayoutservice._3.GetEarlyPayoutConstraintsResponse> getEarlyPayoutConstraintsResult;

    /**
     * Gets the value of the getEarlyPayoutConstraintsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.services.bwin.xmlns.types.earlypayoutservice._3.GetEarlyPayoutConstraintsResponse }{@code >}
     *     
     */
    public JAXBElement<com.services.bwin.xmlns.types.earlypayoutservice._3.GetEarlyPayoutConstraintsResponse> getGetEarlyPayoutConstraintsResult() {
        return getEarlyPayoutConstraintsResult;
    }

    /**
     * Sets the value of the getEarlyPayoutConstraintsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.services.bwin.xmlns.types.earlypayoutservice._3.GetEarlyPayoutConstraintsResponse }{@code >}
     *     
     */
    public void setGetEarlyPayoutConstraintsResult(JAXBElement<com.services.bwin.xmlns.types.earlypayoutservice._3.GetEarlyPayoutConstraintsResponse> value) {
        this.getEarlyPayoutConstraintsResult = value;
    }

}
