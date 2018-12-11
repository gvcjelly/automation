
package org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAssociatedAccountsReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAssociatedAccountsReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LookUpData" type="{http://schemas.datacontract.org/2004/07/Bwin.Sportsbook.CustomerConnector.Service.DataContracts.Requests}LookUpData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAssociatedAccountsReq", propOrder = {
    "lookUpData"
})
public class GetAssociatedAccountsReq {

    @XmlElement(name = "LookUpData", required = true, nillable = true)
    protected LookUpData lookUpData;

    /**
     * Gets the value of the lookUpData property.
     * 
     * @return
     *     possible object is
     *     {@link LookUpData }
     *     
     */
    public LookUpData getLookUpData() {
        return lookUpData;
    }

    /**
     * Sets the value of the lookUpData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LookUpData }
     *     
     */
    public void setLookUpData(LookUpData value) {
        this.lookUpData = value;
    }

}
