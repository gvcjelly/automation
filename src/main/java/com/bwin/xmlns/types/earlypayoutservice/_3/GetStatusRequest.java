
package com.bwin.xmlns.types.earlypayoutservice._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetStatusRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetStatusRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Customer" type="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}Customer"/>
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
@XmlType(name = "GetStatusRequest", propOrder = {
    "customer",
    "requestId"
})
public class GetStatusRequest {

    @XmlElement(name = "Customer", required = true, nillable = true)
    protected Customer customer;
    @XmlElement(name = "RequestId", required = true, nillable = true)
    protected RequestId requestId;

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
