
package com.services.bwin.xmlns.types.earlypayoutservice._3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OverMaxEarlyPayoutAmount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverMaxEarlyPayoutAmount">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}EarlyPayoutError">
 *       &lt;sequence>
 *         &lt;element name="PossibleEarlyPayout" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PossibleWin" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverMaxEarlyPayoutAmount", propOrder = {
    "possibleEarlyPayout",
    "possibleWin"
})
public class OverMaxEarlyPayoutAmount
    extends EarlyPayoutError
{

    @XmlElement(name = "PossibleEarlyPayout")
    protected BigDecimal possibleEarlyPayout;
    @XmlElement(name = "PossibleWin")
    protected BigDecimal possibleWin;

    /**
     * Gets the value of the possibleEarlyPayout property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPossibleEarlyPayout() {
        return possibleEarlyPayout;
    }

    /**
     * Sets the value of the possibleEarlyPayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPossibleEarlyPayout(BigDecimal value) {
        this.possibleEarlyPayout = value;
    }

    /**
     * Gets the value of the possibleWin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPossibleWin() {
        return possibleWin;
    }

    /**
     * Sets the value of the possibleWin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPossibleWin(BigDecimal value) {
        this.possibleWin = value;
    }

}
