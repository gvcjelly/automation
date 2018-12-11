
package com.bwin.xmlns.services.earlypayoutservice._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bwin.xmlns.types.earlypayoutservice._3.AutoCashoutResponse;


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
 *         &lt;element name="RemoveAutoCashoutResult" type="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}AutoCashoutResponse" minOccurs="0"/>
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
    "removeAutoCashoutResult"
})
@XmlRootElement(name = "RemoveAutoCashoutResponse")
public class RemoveAutoCashoutResponse {

    @XmlElementRef(name = "RemoveAutoCashoutResult", namespace = "http://xmlns.bwin.com/services/EarlyPayoutService/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<AutoCashoutResponse> removeAutoCashoutResult;

    /**
     * Gets the value of the removeAutoCashoutResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AutoCashoutResponse }{@code >}
     *     
     */
    public JAXBElement<AutoCashoutResponse> getRemoveAutoCashoutResult() {
        return removeAutoCashoutResult;
    }

    /**
     * Sets the value of the removeAutoCashoutResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AutoCashoutResponse }{@code >}
     *     
     */
    public void setRemoveAutoCashoutResult(JAXBElement<AutoCashoutResponse> value) {
        this.removeAutoCashoutResult = value;
    }

}
