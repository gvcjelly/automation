
package com.bwin.xmlns.types.earlypayoutservice._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UndoEarlyPayoutFailed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UndoEarlyPayoutFailed">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}UndoEarlyPayoutResponse">
 *       &lt;sequence>
 *         &lt;element name="Error" type="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}EarlyPayoutError" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndoEarlyPayoutFailed", propOrder = {
    "error"
})
public class UndoEarlyPayoutFailed
    extends UndoEarlyPayoutResponse
{

    @XmlElementRef(name = "Error", namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<EarlyPayoutError> error;

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EarlyPayoutError }{@code >}
     *     
     */
    public JAXBElement<EarlyPayoutError> getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EarlyPayoutError }{@code >}
     *     
     */
    public void setError(JAXBElement<EarlyPayoutError> value) {
        this.error = value;
    }

}
