
package com.bwin.xmlns.types.earlypayoutservice._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckPossibleEarlyPayoutResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckPossibleEarlyPayoutResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EarlyPayouts" type="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}ArrayOfEarlyPayoutPossibility" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckPossibleEarlyPayoutResponse", propOrder = {
    "earlyPayouts"
})
public class CheckPossibleEarlyPayoutResponse {

    @XmlElementRef(name = "EarlyPayouts", namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEarlyPayoutPossibility> earlyPayouts;

    /**
     * Gets the value of the earlyPayouts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEarlyPayoutPossibility }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEarlyPayoutPossibility> getEarlyPayouts() {
        return earlyPayouts;
    }

    /**
     * Sets the value of the earlyPayouts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEarlyPayoutPossibility }{@code >}
     *     
     */
    public void setEarlyPayouts(JAXBElement<ArrayOfEarlyPayoutPossibility> value) {
        this.earlyPayouts = value;
    }

}
