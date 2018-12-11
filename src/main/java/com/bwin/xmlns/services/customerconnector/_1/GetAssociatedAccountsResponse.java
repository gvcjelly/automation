
package com.bwin.xmlns.services.customerconnector._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts.GetAssociatedAccountsResp;


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
 *         &lt;element name="GetAssociatedAccountsResult" type="{http://schemas.datacontract.org/2004/07/Bwin.Sportsbook.CustomerConnector.Service.DataContracts.Responses}GetAssociatedAccountsResp" minOccurs="0"/>
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
    "getAssociatedAccountsResult"
})
@XmlRootElement(name = "GetAssociatedAccountsResponse")
public class GetAssociatedAccountsResponse {

    @XmlElementRef(name = "GetAssociatedAccountsResult", namespace = "http://xmlns.bwin.com/services/CustomerConnector/1.2", type = JAXBElement.class, required = false)
    protected JAXBElement<GetAssociatedAccountsResp> getAssociatedAccountsResult;

    /**
     * Gets the value of the getAssociatedAccountsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetAssociatedAccountsResp }{@code >}
     *     
     */
    public JAXBElement<GetAssociatedAccountsResp> getGetAssociatedAccountsResult() {
        return getAssociatedAccountsResult;
    }

    /**
     * Sets the value of the getAssociatedAccountsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetAssociatedAccountsResp }{@code >}
     *     
     */
    public void setGetAssociatedAccountsResult(JAXBElement<GetAssociatedAccountsResp> value) {
        this.getAssociatedAccountsResult = value;
    }

}
