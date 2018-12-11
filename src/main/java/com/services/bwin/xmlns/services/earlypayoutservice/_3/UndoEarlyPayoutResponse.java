
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
 *         &lt;element name="UndoEarlyPayoutResult" type="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}UndoEarlyPayoutResponse" minOccurs="0"/>
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
    "undoEarlyPayoutResult"
})
@XmlRootElement(name = "UndoEarlyPayoutResponse")
public class UndoEarlyPayoutResponse {

    @XmlElementRef(name = "UndoEarlyPayoutResult", namespace = "http://xmlns.bwin.com/services/EarlyPayoutService/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<com.services.bwin.xmlns.types.earlypayoutservice._3.UndoEarlyPayoutResponse> undoEarlyPayoutResult;

    /**
     * Gets the value of the undoEarlyPayoutResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.services.bwin.xmlns.types.earlypayoutservice._3.UndoEarlyPayoutResponse }{@code >}
     *     
     */
    public JAXBElement<com.services.bwin.xmlns.types.earlypayoutservice._3.UndoEarlyPayoutResponse> getUndoEarlyPayoutResult() {
        return undoEarlyPayoutResult;
    }

    /**
     * Sets the value of the undoEarlyPayoutResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.services.bwin.xmlns.types.earlypayoutservice._3.UndoEarlyPayoutResponse }{@code >}
     *     
     */
    public void setUndoEarlyPayoutResult(JAXBElement<com.services.bwin.xmlns.types.earlypayoutservice._3.UndoEarlyPayoutResponse> value) {
        this.undoEarlyPayoutResult = value;
    }

}
