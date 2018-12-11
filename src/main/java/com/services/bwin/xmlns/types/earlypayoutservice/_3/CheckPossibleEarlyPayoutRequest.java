
package com.services.bwin.xmlns.types.earlypayoutservice._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckPossibleEarlyPayoutRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckPossibleEarlyPayoutRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EarlyPayouts" type="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}ArrayOfEarlyPayoutBet" minOccurs="0"/>
 *         &lt;element name="SubChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckPossibleEarlyPayoutRequest", propOrder = {
    "earlyPayouts",
    "subChannel"
})
public class CheckPossibleEarlyPayoutRequest {

    @XmlElementRef(name = "EarlyPayouts", namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEarlyPayoutBet> earlyPayouts;
    @XmlElementRef(name = "SubChannel", namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subChannel;

    /**
     * Gets the value of the earlyPayouts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEarlyPayoutBet }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEarlyPayoutBet> getEarlyPayouts() {
        return earlyPayouts;
    }

    /**
     * Sets the value of the earlyPayouts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEarlyPayoutBet }{@code >}
     *     
     */
    public void setEarlyPayouts(JAXBElement<ArrayOfEarlyPayoutBet> value) {
        this.earlyPayouts = value;
    }

    /**
     * Gets the value of the subChannel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubChannel() {
        return subChannel;
    }

    /**
     * Sets the value of the subChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubChannel(JAXBElement<String> value) {
        this.subChannel = value;
    }

}
