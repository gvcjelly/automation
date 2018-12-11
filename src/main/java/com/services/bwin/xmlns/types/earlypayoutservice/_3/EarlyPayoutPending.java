
package com.services.bwin.xmlns.types.earlypayoutservice._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EarlyPayoutPending complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EarlyPayoutPending">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}EarlyPayoutStatus">
 *       &lt;sequence>
 *         &lt;element name="OverdueRetryDelay" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/>
 *         &lt;element name="PendingStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="QueryStatusRetryDelay" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EarlyPayoutPending", propOrder = {
    "overdueRetryDelay",
    "pendingStart",
    "queryStatusRetryDelay"
})
public class EarlyPayoutPending
    extends EarlyPayoutStatus
{

    @XmlElement(name = "OverdueRetryDelay")
    protected Duration overdueRetryDelay;
    @XmlElement(name = "PendingStart")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pendingStart;
    @XmlElement(name = "QueryStatusRetryDelay")
    protected Duration queryStatusRetryDelay;

    /**
     * Gets the value of the overdueRetryDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getOverdueRetryDelay() {
        return overdueRetryDelay;
    }

    /**
     * Sets the value of the overdueRetryDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setOverdueRetryDelay(Duration value) {
        this.overdueRetryDelay = value;
    }

    /**
     * Gets the value of the pendingStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPendingStart() {
        return pendingStart;
    }

    /**
     * Sets the value of the pendingStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPendingStart(XMLGregorianCalendar value) {
        this.pendingStart = value;
    }

    /**
     * Gets the value of the queryStatusRetryDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getQueryStatusRetryDelay() {
        return queryStatusRetryDelay;
    }

    /**
     * Sets the value of the queryStatusRetryDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setQueryStatusRetryDelay(Duration value) {
        this.queryStatusRetryDelay = value;
    }

}
