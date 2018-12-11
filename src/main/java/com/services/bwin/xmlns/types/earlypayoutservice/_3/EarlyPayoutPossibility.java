
package com.services.bwin.xmlns.types.earlypayoutservice._3;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EarlyPayoutPossibility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EarlyPayoutPossibility">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EarlyPayoutPossible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EarlyPayoutValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Errors" type="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}ArrayOfEarlyPayoutError" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EarlyPayoutPossibility", propOrder = {
    "betNumber",
    "earlyPayoutPossible",
    "earlyPayoutValue",
    "errors"
})
public class EarlyPayoutPossibility {

    @XmlElementRef(name = "BetNumber", namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> betNumber;
    @XmlElement(name = "EarlyPayoutPossible")
    protected Boolean earlyPayoutPossible;
    @XmlElement(name = "EarlyPayoutValue")
    protected BigDecimal earlyPayoutValue;
    @XmlElementRef(name = "Errors", namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEarlyPayoutError> errors;

    /**
     * Gets the value of the betNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBetNumber() {
        return betNumber;
    }

    /**
     * Sets the value of the betNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBetNumber(JAXBElement<String> value) {
        this.betNumber = value;
    }

    /**
     * Gets the value of the earlyPayoutPossible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEarlyPayoutPossible() {
        return earlyPayoutPossible;
    }

    /**
     * Sets the value of the earlyPayoutPossible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEarlyPayoutPossible(Boolean value) {
        this.earlyPayoutPossible = value;
    }

    /**
     * Gets the value of the earlyPayoutValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEarlyPayoutValue() {
        return earlyPayoutValue;
    }

    /**
     * Sets the value of the earlyPayoutValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEarlyPayoutValue(BigDecimal value) {
        this.earlyPayoutValue = value;
    }

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
