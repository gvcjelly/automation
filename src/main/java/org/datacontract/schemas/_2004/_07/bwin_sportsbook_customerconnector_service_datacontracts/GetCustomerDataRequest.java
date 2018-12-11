
package org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCustomerDataRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerDataRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "GetCustomerDataRequest", propOrder = {
    "sportsBookCustomerId"
})
public class GetCustomerDataRequest {

    @XmlElement(name = "SportsBookCustomerId")
    protected long sportsBookCustomerId;

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
