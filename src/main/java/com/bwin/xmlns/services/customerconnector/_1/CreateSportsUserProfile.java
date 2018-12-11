
package com.bwin.xmlns.services.customerconnector._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts.CreateUserProfileRequest;


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
 *         &lt;element name="request" type="{http://schemas.datacontract.org/2004/07/Bwin.Sportsbook.CustomerConnector.Service.DataContracts.Requests}CreateUserProfileRequest" minOccurs="0"/>
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
    "request"
})
@XmlRootElement(name = "CreateSportsUserProfile")
public class CreateSportsUserProfile {

    @XmlElementRef(name = "request", namespace = "http://xmlns.bwin.com/services/CustomerConnector/1.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CreateUserProfileRequest> request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreateUserProfileRequest }{@code >}
     *     
     */
    public JAXBElement<CreateUserProfileRequest> getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreateUserProfileRequest }{@code >}
     *     
     */
    public void setRequest(JAXBElement<CreateUserProfileRequest> value) {
        this.request = value;
    }

}
