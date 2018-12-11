
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
 *         &lt;element name="GetStatusResult" type="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}GetStatusResponse" minOccurs="0"/>
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
    "getStatusResult"
})
@XmlRootElement(name = "GetStatusResponse")
public class GetStatusResponse {

    @XmlElementRef(name = "GetStatusResult", namespace = "http://xmlns.bwin.com/services/EarlyPayoutService/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<com.bwin.xmlns.types.earlypayoutservice._3.GetStatusResponse> getStatusResult;

    /**
     * Gets the value of the getStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.bwin.xmlns.types.earlypayoutservice._3.GetStatusResponse }{@code >}
     *     
     */
    public JAXBElement<com.bwin.xmlns.types.earlypayoutservice._3.GetStatusResponse> getGetStatusResult() {
        return getStatusResult;
    }

    /**
     * Sets the value of the getStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.bwin.xmlns.types.earlypayoutservice._3.GetStatusResponse }{@code >}
     *     
     */
    public void setGetStatusResult(JAXBElement<com.bwin.xmlns.types.earlypayoutservice._3.GetStatusResponse> value) {
        this.getStatusResult = value;
    }

}
