
package com.bwin.xmlns.services.customerconnector._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts.CachedProfileData;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChangeUserCountryResult" type="{http://schemas.datacontract.org/2004/07/Bwin.Sportsbook.CustomerConnector.Service.DataContracts.Responses}CachedProfileData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "changeUserCountryResult"
})
@XmlRootElement(name = "ChangeUserCountryResponse")
public class ChangeUserCountryResponse {

    @XmlElementRef(name = "ChangeUserCountryResult", namespace = "http://xmlns.bwin.com/services/CustomerConnector/1.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CachedProfileData> changeUserCountryResult;

    /**
     * Gets the value of the changeUserCountryResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CachedProfileData }{@code >}
     *     
     */
    public JAXBElement<CachedProfileData> getChangeUserCountryResult() {
        return changeUserCountryResult;
    }

    /**
     * Sets the value of the changeUserCountryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CachedProfileData }{@code >}
     *     
     */
    public void setChangeUserCountryResult(JAXBElement<CachedProfileData> value) {
        this.changeUserCountryResult = value;
    }

}
