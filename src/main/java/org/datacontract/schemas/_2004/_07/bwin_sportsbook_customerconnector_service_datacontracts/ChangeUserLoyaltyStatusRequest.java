
package org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeUserLoyaltyStatusRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeUserLoyaltyStatusRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoyaltyStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SportsBookCustomerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeUserLoyaltyStatusRequest", propOrder = {
    "loyaltyStatus",
    "sportsBookCustomerId"
})
public class ChangeUserLoyaltyStatusRequest {

    @XmlElement(name = "LoyaltyStatus", required = true, nillable = true)
    protected String loyaltyStatus;
    @XmlElement(name = "SportsBookCustomerId")
    protected long sportsBookCustomerId;

    /**
     * Gets the value of the loyaltyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyStatus() {
        return loyaltyStatus;
    }

    /**
     * Sets the value of the loyaltyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyStatus(String value) {
        this.loyaltyStatus = value;
    }

    /**
     * Gets the value of the sportsBookCustomerId property.
     * 
     */
    public long getSportsBookCustomerId() {
        return sportsBookCustomerId;
    }

    /**
     * Sets the value of the sportsBookCustomerId property.
     * 
     */
    public void setSportsBookCustomerId(long value) {
        this.sportsBookCustomerId = value;
    }

}
