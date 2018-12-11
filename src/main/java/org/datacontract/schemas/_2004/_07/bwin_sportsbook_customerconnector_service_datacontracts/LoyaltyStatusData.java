
package org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoyaltyStatusData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoyaltyStatusData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentFreeSmsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InitialFreeSmsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SportBookUserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyStatusData", namespace = "http://schemas.datacontract.org/2004/07/Bwin.Sportsbook.CustomerConnector.Service.DataContracts.Responses", propOrder = {
    "currentFreeSmsCount",
    "initialFreeSmsCount",
    "sportBookUserId"
})
public class LoyaltyStatusData {

    @XmlElement(name = "CurrentFreeSmsCount")
    protected Integer currentFreeSmsCount;
    @XmlElement(name = "InitialFreeSmsCount")
    protected Integer initialFreeSmsCount;
    @XmlElement(name = "SportBookUserId")
    protected Long sportBookUserId;

    /**
     * Gets the value of the currentFreeSmsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentFreeSmsCount() {
        return currentFreeSmsCount;
    }

    /**
     * Sets the value of the currentFreeSmsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentFreeSmsCount(Integer value) {
        this.currentFreeSmsCount = value;
    }

    /**
     * Gets the value of the initialFreeSmsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInitialFreeSmsCount() {
        return initialFreeSmsCount;
    }

    /**
     * Sets the value of the initialFreeSmsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInitialFreeSmsCount(Integer value) {
        this.initialFreeSmsCount = value;
    }

    /**
     * Gets the value of the sportBookUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSportBookUserId() {
        return sportBookUserId;
    }

    /**
     * Sets the value of the sportBookUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSportBookUserId(Long value) {
        this.sportBookUserId = value;
    }

}
