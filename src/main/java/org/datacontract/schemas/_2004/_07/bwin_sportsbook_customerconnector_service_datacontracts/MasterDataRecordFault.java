
package org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MasterDataRecordFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MasterDataRecordFault">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Bwin.Sportsbook.CustomerConnector.Service.DataContracts.Faults}GeneralTechnicalFault">
 *       &lt;sequence>
 *         &lt;element name="ExternalUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MdrRemoteMedthodName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MdrSystemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MasterDataRecordFault", namespace = "http://schemas.datacontract.org/2004/07/Bwin.Sportsbook.CustomerConnector.Service.DataContracts.Faults", propOrder = {
    "externalUserId",
    "mdrRemoteMedthodName",
    "mdrSystemName"
})
public class MasterDataRecordFault
    extends GeneralTechnicalFault
{

    @XmlElementRef(name = "ExternalUserId", namespace = "http://schemas.datacontract.org/2004/07/Bwin.Sportsbook.CustomerConnector.Service.DataContracts.Faults", type = JAXBElement.class, required = false)
    protected JAXBElement<String> externalUserId;
    @XmlElementRef(name = "MdrRemoteMedthodName", namespace = "http://schemas.datacontract.org/2004/07/Bwin.Sportsbook.CustomerConnector.Service.DataContracts.Faults", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mdrRemoteMedthodName;
    @XmlElementRef(name = "MdrSystemName", namespace = "http://schemas.datacontract.org/2004/07/Bwin.Sportsbook.CustomerConnector.Service.DataContracts.Faults", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mdrSystemName;

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
     * Gets the value of the mdrRemoteMedthodName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMdrRemoteMedthodName() {
        return mdrRemoteMedthodName;
    }

    /**
     * Sets the value of the mdrRemoteMedthodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMdrRemoteMedthodName(JAXBElement<String> value) {
        this.mdrRemoteMedthodName = value;
    }

    /**
     * Gets the value of the mdrSystemName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMdrSystemName() {
        return mdrSystemName;
    }

    /**
     * Sets the value of the mdrSystemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMdrSystemName(JAXBElement<String> value) {
        this.mdrSystemName = value;
    }

}
