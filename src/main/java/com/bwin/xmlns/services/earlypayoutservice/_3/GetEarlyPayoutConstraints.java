
package com.bwin.xmlns.services.earlypayoutservice._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bwin.xmlns.types.earlypayoutservice._3.GetEarlyPayoutConstraintsRequest;


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
 *         &lt;element name="request" type="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}GetEarlyPayoutConstraintsRequest" minOccurs="0"/>
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
    "request"
})
@XmlRootElement(name = "GetEarlyPayoutConstraints")
public class GetEarlyPayoutConstraints {

    @XmlElementRef(name = "request", namespace = "http://xmlns.bwin.com/services/EarlyPayoutService/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<GetEarlyPayoutConstraintsRequest> request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetEarlyPayoutConstraintsRequest }{@code >}
     *     
     */
    public JAXBElement<GetEarlyPayoutConstraintsRequest> getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetEarlyPayoutConstraintsRequest }{@code >}
     *     
     */
    public void setRequest(JAXBElement<GetEarlyPayoutConstraintsRequest> value) {
        this.request = value;
    }

}
