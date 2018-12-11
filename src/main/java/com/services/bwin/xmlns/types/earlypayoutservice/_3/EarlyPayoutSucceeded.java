
package com.services.bwin.xmlns.types.earlypayoutservice._3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EarlyPayoutSucceeded complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EarlyPayoutSucceeded">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}EarlyPayoutStatus">
 *       &lt;sequence>
 *         &lt;element name="ActualPayout" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EvalInfoPacketId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UserExpectedPayout" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EarlyPayoutSucceeded", propOrder = {
    "actualPayout",
    "evalInfoPacketId",
    "userExpectedPayout"
})
public class EarlyPayoutSucceeded
    extends EarlyPayoutStatus
{

    @XmlElement(name = "ActualPayout")
    protected BigDecimal actualPayout;
    @XmlElement(name = "EvalInfoPacketId")
    protected Long evalInfoPacketId;
    @XmlElement(name = "UserExpectedPayout")
    protected BigDecimal userExpectedPayout;

    /**
     * Gets the value of the actualPayout property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualPayout() {
        return actualPayout;
    }

    /**
     * Sets the value of the actualPayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualPayout(BigDecimal value) {
        this.actualPayout = value;
    }

    /**
     * Gets the value of the evalInfoPacketId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEvalInfoPacketId() {
        return evalInfoPacketId;
    }

    /**
     * Sets the value of the evalInfoPacketId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEvalInfoPacketId(Long value) {
        this.evalInfoPacketId = value;
    }

    /**
     * Gets the value of the userExpectedPayout property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUserExpectedPayout() {
        return userExpectedPayout;
    }

    /**
     * Sets the value of the userExpectedPayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUserExpectedPayout(BigDecimal value) {
        this.userExpectedPayout = value;
    }

}
