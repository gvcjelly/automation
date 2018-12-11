
package org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAssociatedAccountsResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAssociatedAccountsResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssociatedAccounts" type="{http://schemas.datacontract.org/2004/07/Bwin.Sportsbook.CustomerConnector.Service.DataContracts.Responses}ArrayOfAssociatedAccount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAssociatedAccountsResp", namespace = "http://schemas.datacontract.org/2004/07/Bwin.Sportsbook.CustomerConnector.Service.DataContracts.Responses", propOrder = {
    "associatedAccounts"
})
public class GetAssociatedAccountsResp {

    @XmlElementRef(name = "AssociatedAccounts", namespace = "http://schemas.datacontract.org/2004/07/Bwin.Sportsbook.CustomerConnector.Service.DataContracts.Responses", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAssociatedAccount> associatedAccounts;

    /**
     * Gets the value of the associatedAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAssociatedAccount }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAssociatedAccount> getAssociatedAccounts() {
        return associatedAccounts;
    }

    /**
     * Sets the value of the associatedAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAssociatedAccount }{@code >}
     *     
     */
    public void setAssociatedAccounts(JAXBElement<ArrayOfAssociatedAccount> value) {
        this.associatedAccounts = value;
    }

}
