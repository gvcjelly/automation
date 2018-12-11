
package com.bwin.xmlns.types.earlypayoutservice._3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnderMinOddsKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnderMinOddsKey">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}EarlyPayoutError">
 *       &lt;sequence>
 *         &lt;element name="OddsKey" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderMinOddsKey", propOrder = {
    "oddsKey"
})
public class UnderMinOddsKey
    extends EarlyPayoutError
{

    @XmlElement(name = "OddsKey")
    protected BigDecimal oddsKey;

    /**
     * Gets the value of the oddsKey property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOddsKey() {
        return oddsKey;
    }

    /**
     * Sets the value of the oddsKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOddsKey(BigDecimal value) {
        this.oddsKey = value;
    }

}
