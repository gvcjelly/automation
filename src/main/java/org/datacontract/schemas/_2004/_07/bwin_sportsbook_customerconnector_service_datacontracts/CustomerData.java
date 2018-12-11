
package org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CustomerData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CountryId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExternalUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsBetPlacementAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LanguageId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LoginDomainId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PlaceBetDenyReason" type="{http://schemas.datacontract.org/2004/07/Bwin.Sportsbook.CustomerConnector.Service.DataContracts.Responses}PlaceBetDenyReason" minOccurs="0"/>
 *         &lt;element name="ProfileCreationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SogeiCustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SogeiCustomerNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SourceSytem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SportsBookUserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerData", namespace = "http://schemas.datacontract.org/2004/07/Bwin.Sportsbook.CustomerConnector.Service.DataContracts.Responses", propOrder = {
    "applicationId",
    "countryId",
    "currencyCode",
    "currencyId",
    "externalUserId",
    "isBetPlacementAllowed",
    "languageId",
    "loginDomainId",
    "placeBetDenyReason",
    "profileCreationDateTime",
    "sogeiCustomerId",
    "sogeiCustomerNumber",
    "sourceSytem",
    "sportsBookUserId",
    "userName"
})
public class CustomerData {

    @XmlElement(name = "ApplicationId")
    protected Integer applicationId;
    @XmlElementRef(name = "CountryId", namespace = "http://schemas.datacontract.org/2004/07/Bwin.Sportsbook.CustomerConnector.Service.DataContracts.Responses", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> countryId;
    @XmlElementRef(name = "CurrencyCode", namespace = "http://schemas.datacontract.org/2004/07/Bwin.Sportsbook.CustomerConnector.Service.DataContracts.Responses", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyCode;
    @XmlElementRef(name = "CurrencyId", namespace = "http://schemas.datacontract.org/2004/07/Bwin.Sportsbook.CustomerConnector.Service.DataContracts.Responses", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> currencyId;
    @XmlElementRef(name = "ExternalUserId", namespace = "http://schemas.datacontract.org/2004/07/Bwin.Sportsbook.CustomerConnector.Service.DataContracts.Responses", type = JAXBElement.class, required = false)
    protected JAXBElement<String> externalUserId;
    @XmlElement(name = "IsBetPlacementAllowed")
    protected Boolean isBetPlacementAllowed;
    @XmlElement(name = "LanguageId")
    protected Integer languageId;
    @XmlElement(name = "LoginDomainId")
    protected Integer loginDomainId;
    @XmlElement(name = "PlaceBetDenyReason")
    @XmlSchemaType(name = "string")
    protected PlaceBetDenyReason placeBetDenyReason;
    @XmlElement(name = "ProfileCreationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar profileCreationDateTime;
    @XmlElementRef(name = "SogeiCustomerId", namespace = "http://schemas.datacontract.org/2004/07/Bwin.Sportsbook.CustomerConnector.Service.DataContracts.Responses", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sogeiCustomerId;
    @XmlElementRef(name = "SogeiCustomerNumber", namespace = "http://schemas.datacontract.org/2004/07/Bwin.Sportsbook.CustomerConnector.Service.DataContracts.Responses", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sogeiCustomerNumber;
    @XmlElementRef(name = "SourceSytem", namespace = "http://schemas.datacontract.org/2004/07/Bwin.Sportsbook.CustomerConnector.Service.DataContracts.Responses", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceSytem;
    @XmlElement(name = "SportsBookUserId")
    protected Long sportsBookUserId;
    @XmlElementRef(name = "UserName", namespace = "http://schemas.datacontract.org/2004/07/Bwin.Sportsbook.CustomerConnector.Service.DataContracts.Responses", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userName;

    /**
     * Gets the value of the applicationId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApplicationId(Integer value) {
        this.applicationId = value;
    }

    /**
     * Gets the value of the countryId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCountryId(JAXBElement<Integer> value) {
        this.countryId = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrencyCode(JAXBElement<String> value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the currencyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCurrencyId() {
        return currencyId;
    }

    /**
     * Sets the value of the currencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCurrencyId(JAXBElement<Integer> value) {
        this.currencyId = value;
    }

    /**
     * Gets the value of the externalUserId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExternalUserId() {
        return externalUserId;
    }

    /**
     * Sets the value of the externalUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExternalUserId(JAXBElement<String> value) {
        this.externalUserId = value;
    }

    /**
     * Gets the value of the isBetPlacementAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBetPlacementAllowed() {
        return isBetPlacementAllowed;
    }

    /**
     * Sets the value of the isBetPlacementAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBetPlacementAllowed(Boolean value) {
        this.isBetPlacementAllowed = value;
    }

    /**
     * Gets the value of the languageId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLanguageId() {
        return languageId;
    }

    /**
     * Sets the value of the languageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLanguageId(Integer value) {
        this.languageId = value;
    }

    /**
     * Gets the value of the loginDomainId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoginDomainId() {
        return loginDomainId;
    }

    /**
     * Sets the value of the loginDomainId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoginDomainId(Integer value) {
        this.loginDomainId = value;
    }

    /**
     * Gets the value of the placeBetDenyReason property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceBetDenyReason }
     *     
     */
    public PlaceBetDenyReason getPlaceBetDenyReason() {
        return placeBetDenyReason;
    }

    /**
     * Sets the value of the placeBetDenyReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceBetDenyReason }
     *     
     */
    public void setPlaceBetDenyReason(PlaceBetDenyReason value) {
        this.placeBetDenyReason = value;
    }

    /**
     * Gets the value of the profileCreationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProfileCreationDateTime() {
        return profileCreationDateTime;
    }

    /**
     * Sets the value of the profileCreationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProfileCreationDateTime(XMLGregorianCalendar value) {
        this.profileCreationDateTime = value;
    }

    /**
     * Gets the value of the sogeiCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSogeiCustomerId() {
        return sogeiCustomerId;
    }

    /**
     * Sets the value of the sogeiCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSogeiCustomerId(JAXBElement<String> value) {
        this.sogeiCustomerId = value;
    }

    /**
     * Gets the value of the sogeiCustomerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSogeiCustomerNumber() {
        return sogeiCustomerNumber;
    }

    /**
     * Sets the value of the sogeiCustomerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSogeiCustomerNumber(JAXBElement<Integer> value) {
        this.sogeiCustomerNumber = value;
    }

    /**
     * Gets the value of the sourceSytem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceSytem() {
        return sourceSytem;
    }

    /**
     * Sets the value of the sourceSytem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceSytem(JAXBElement<String> value) {
        this.sourceSytem = value;
    }

    /**
     * Gets the value of the sportsBookUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSportsBookUserId() {
        return sportsBookUserId;
    }

    /**
     * Sets the value of the sportsBookUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSportsBookUserId(Long value) {
        this.sportsBookUserId = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserName(JAXBElement<String> value) {
        this.userName = value;
    }

}
