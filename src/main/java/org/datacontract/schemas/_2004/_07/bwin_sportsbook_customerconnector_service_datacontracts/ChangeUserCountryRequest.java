
package org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeUserCountryRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeUserCountryRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountryId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "ChangeUserCountryRequest", propOrder = {
    "countryId",
    "sportsBookCustomerId"
})
public class ChangeUserCountryRequest {

    @XmlElement(name = "CountryId")
    protected int countryId;
    @XmlElement(name = "SportsBookCustomerId")
    protected long sportsBookCustomerId;

    /**
     * Gets the value of the countryId property.
     * 
     */
    public int getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     * 
     */
    public void setCountryId(int value) {
        this.countryId = value;
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
