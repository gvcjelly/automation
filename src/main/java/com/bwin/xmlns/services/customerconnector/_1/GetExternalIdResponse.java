
package com.bwin.xmlns.services.customerconnector._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="GetExternalIdResult" type="{http://schemas.datacontract.org/2004/07/Bwin.Sportsbook.CustomerConnector.Service.DataContracts.Responses}GetExternalIdResponse" minOccurs="0"/>
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
    "getExternalIdResult"
})
@XmlRootElement(name = "GetExternalIdResponse")
public class GetExternalIdResponse {

    @XmlElementRef(name = "GetExternalIdResult", namespace = "http://xmlns.bwin.com/services/CustomerConnector/1.2", type = JAXBElement.class, required = false)
    protected JAXBElement<org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts.GetExternalIdResponse> getExternalIdResult;

    /**
     * Gets the value of the getExternalIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts.GetExternalIdResponse }{@code >}
     *     
     */
    public JAXBElement<org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts.GetExternalIdResponse> getGetExternalIdResult() {
        return getExternalIdResult;
    }

    /**
     * Sets the value of the getExternalIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts.GetExternalIdResponse }{@code >}
     *     
     */
    public void setGetExternalIdResult(JAXBElement<org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts.GetExternalIdResponse> value) {
        this.getExternalIdResult = value;
    }

}
