
package org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JurisdictionStatusData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JurisdictionStatusData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChangeIsValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ValidationLogId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JurisdictionStatusData", namespace = "http://schemas.datacontract.org/2004/07/Bwin.Sportsbook.CustomerConnector.Service.DataContracts.Responses", propOrder = {
    "changeIsValid",
    "validationLogId"
})
public class JurisdictionStatusData {

    @XmlElement(name = "ChangeIsValid")
    protected Boolean changeIsValid;
    @XmlElement(name = "ValidationLogId")
    protected Long validationLogId;

    /**
     * Gets the value of the changeIsValid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeIsValid() {
        return changeIsValid;
    }

    /**
     * Sets the value of the changeIsValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeIsValid(Boolean value) {
        this.changeIsValid = value;
    }

    /**
     * Gets the value of the validationLogId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValidationLogId() {
        return validationLogId;
    }

    /**
     * Sets the value of the validationLogId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValidationLogId(Long value) {
        this.validationLogId = value;
    }

}
