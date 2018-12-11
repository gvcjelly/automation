
package org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JurisdictionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JurisdictionRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Jurisdiction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SportsBookUserId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JurisdictionRequest", propOrder = {
    "applicationId",
    "jurisdiction",
    "sportsBookUserId"
})
public class JurisdictionRequest {

    @XmlElement(name = "ApplicationId")
    protected int applicationId;
    @XmlElement(name = "Jurisdiction", required = true, nillable = true)
    protected String jurisdiction;
    @XmlElement(name = "SportsBookUserId")
    protected long sportsBookUserId;

    /**
     * Gets the value of the applicationId property.
     * 
     */
    public int getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     * 
     */
    public void setApplicationId(int value) {
        this.applicationId = value;
    }

    /**
     * Gets the value of the jurisdiction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJurisdiction() {
        return jurisdiction;
    }

    /**
     * Sets the value of the jurisdiction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJurisdiction(String value) {
        this.jurisdiction = value;
    }

    /**
     * Gets the value of the sportsBookUserId property.
     * 
     */
    public long getSportsBookUserId() {
        return sportsBookUserId;
    }

    /**
     * Sets the value of the sportsBookUserId property.
     * 
     */
    public void setSportsBookUserId(long value) {
        this.sportsBookUserId = value;
    }

}
