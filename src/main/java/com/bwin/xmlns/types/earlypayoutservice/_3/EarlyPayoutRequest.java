
package com.bwin.xmlns.types.earlypayoutservice._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintBetNNSPdE8A;


/**
 * <p>Java class for EarlyPayoutRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EarlyPayoutRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccessId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Bets" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfintBetNNSPdE8A"/>
 *         &lt;element name="Customer" type="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}Customer"/>
 *         &lt;element name="GlobalSessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestId" type="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}RequestId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EarlyPayoutRequest", propOrder = {
    "accessId",
    "bets",
    "customer",
    "globalSessionId",
    "requestId"
})
public class EarlyPayoutRequest {

    @XmlElementRef(name = "AccessId", namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> accessId;
    @XmlElement(name = "Bets", required = true, nillable = true)
    protected ArrayOfKeyValueOfintBetNNSPdE8A bets;
    @XmlElement(name = "Customer", required = true, nillable = true)
    protected Customer customer;
    @XmlElementRef(name = "GlobalSessionId", namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> globalSessionId;
    @XmlElement(name = "RequestId", required = true, nillable = true)
    protected RequestId requestId;

    /**
     * Gets the value of the accessId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAccessId() {
        return accessId;
    }

    /**
     * Sets the value of the accessId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAccessId(JAXBElement<Integer> value) {
        this.accessId = value;
    }

    /**
     * Gets the value of the bets property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueOfintBetNNSPdE8A }
     *     
     */
    public ArrayOfKeyValueOfintBetNNSPdE8A getBets() {
        return bets;
    }

    /**
     * Sets the value of the bets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueOfintBetNNSPdE8A }
     *     
     */
    public void setBets(ArrayOfKeyValueOfintBetNNSPdE8A value) {
        this.bets = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setCustomer(Customer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the globalSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGlobalSessionId() {
        return globalSessionId;
    }

    /**
     * Sets the value of the globalSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGlobalSessionId(JAXBElement<String> value) {
        this.globalSessionId = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link RequestId }
     *     
     */
    public RequestId getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestId }
     *     
     */
    public void setRequestId(RequestId value) {
        this.requestId = value;
    }

}
