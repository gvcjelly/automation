
package org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LookUpBySportsBookUserIdLookupData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LookUpBySportsBookUserIdLookupData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Bwin.Sportsbook.CustomerConnector.Service.DataContracts.Requests}LookUpData">
 *       &lt;sequence>
 *         &lt;element name="SportsBookUserId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LookUpBySportsBookUserIdLookupData", propOrder = {
    "sportsBookUserId"
})
public class LookUpBySportsBookUserIdLookupData
    extends LookUpData
{

    @XmlElement(name = "SportsBookUserId")
    protected int sportsBookUserId;

    /**
     * Gets the value of the sportsBookUserId property.
     * 
     */
    public int getSportsBookUserId() {
        return sportsBookUserId;
    }

    /**
     * Sets the value of the sportsBookUserId property.
     * 
     */
    public void setSportsBookUserId(int value) {
        this.sportsBookUserId = value;
    }

}
