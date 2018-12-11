
package com.services.bwin.xmlns.types.earlypayoutservice._3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutoCashoutBet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutoCashoutBet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="RequestType" type="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}AutoCashoutType"/>
 *         &lt;element name="Threshold" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoCashoutBet", propOrder = {
    "betNumber",
    "requestId",
    "requestType",
    "threshold"
})
public class AutoCashoutBet {

    @XmlElement(name = "BetNumber", required = true, nillable = true)
    protected String betNumber;
    @XmlElement(name = "RequestId")
    protected long requestId;
    @XmlElement(name = "RequestType", required = true)
    @XmlSchemaType(name = "string")
    protected AutoCashoutType requestType;
    @XmlElement(name = "Threshold", required = true)
    protected BigDecimal threshold;

    /**
     * Gets the value of the betNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBetNumber() {
        return betNumber;
    }

    /**
     * Sets the value of the betNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBetNumber(String value) {
        this.betNumber = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     */
    public long getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     */
    public void setRequestId(long value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link AutoCashoutType }
     *     
     */
    public AutoCashoutType getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoCashoutType }
     *     
     */
    public void setRequestType(AutoCashoutType value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the threshold property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getThreshold() {
        return threshold;
    }

    /**
     * Sets the value of the threshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setThreshold(BigDecimal value) {
        this.threshold = value;
    }

}
