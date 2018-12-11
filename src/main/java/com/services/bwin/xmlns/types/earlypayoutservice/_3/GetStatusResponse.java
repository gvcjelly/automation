
package com.services.bwin.xmlns.types.earlypayoutservice._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.services.serialization.arrays.ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A;


/**
 * <p>Java class for GetStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetStatusResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EarlyPayoutStatuses" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStatusResponse", propOrder = {
    "earlyPayoutStatuses"
})
public class GetStatusResponse {

    @XmlElementRef(name = "EarlyPayoutStatuses", namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A> earlyPayoutStatuses;

    /**
     * Gets the value of the earlyPayoutStatuses property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A> getEarlyPayoutStatuses() {
        return earlyPayoutStatuses;
    }

    /**
     * Sets the value of the earlyPayoutStatuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A }{@code >}
     *     
     */
    public void setEarlyPayoutStatuses(JAXBElement<ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A> value) {
        this.earlyPayoutStatuses = value;
    }

}
