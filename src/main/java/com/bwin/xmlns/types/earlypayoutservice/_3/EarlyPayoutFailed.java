
package com.bwin.xmlns.types.earlypayoutservice._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EarlyPayoutFailed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EarlyPayoutFailed">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}EarlyPayoutStatus">
 *       &lt;sequence>
 *         &lt;element name="Errors" type="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}ArrayOfEarlyPayoutError" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EarlyPayoutFailed", propOrder = {
    "errors"
})
public class EarlyPayoutFailed
    extends EarlyPayoutStatus
{

    @XmlElementRef(name = "Errors", namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEarlyPayoutError> errors;

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEarlyPayoutError }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEarlyPayoutError> getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEarlyPayoutError }{@code >}
     *     
     */
    public void setErrors(JAXBElement<ArrayOfEarlyPayoutError> value) {
        this.errors = value;
    }

}
