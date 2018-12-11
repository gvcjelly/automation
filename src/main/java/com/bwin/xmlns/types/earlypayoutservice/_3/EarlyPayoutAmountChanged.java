
package com.bwin.xmlns.types.earlypayoutservice._3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EarlyPayoutAmountChanged complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EarlyPayoutAmountChanged">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}EarlyPayoutError">
 *       &lt;sequence>
 *         &lt;element name="Expected" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Possible" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EarlyPayoutAmountChanged", propOrder = {
    "expected",
    "possible"
})
public class EarlyPayoutAmountChanged
    extends EarlyPayoutError
{

    @XmlElement(name = "Expected")
    protected BigDecimal expected;
    @XmlElement(name = "Possible")
    protected BigDecimal possible;

    /**
     * Gets the value of the expected property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExpected() {
        return expected;
    }

    /**
     * Sets the value of the expected property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExpected(BigDecimal value) {
        this.expected = value;
    }

    /**
     * Gets the value of the possible property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPossible() {
        return possible;
    }

    /**
     * Sets the value of the possible property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPossible(BigDecimal value) {
        this.possible = value;
    }

}
