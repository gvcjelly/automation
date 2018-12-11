
package org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LookUpByForeignSystemIdLookupData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LookUpByForeignSystemIdLookupData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Bwin.Sportsbook.CustomerConnector.Service.DataContracts.Requests}LookUpData">
 *       &lt;sequence>
 *         &lt;element name="ForeignUserId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SourceSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LookUpByForeignSystemIdLookupData", propOrder = {
    "foreignUserId",
    "sourceSystem"
})
public class LookUpByForeignSystemIdLookupData
    extends LookUpData
{

    @XmlElement(name = "ForeignUserId", required = true, nillable = true)
    protected String foreignUserId;
    @XmlElement(name = "SourceSystem", required = true, nillable = true)
    protected String sourceSystem;

    /**
     * Gets the value of the foreignUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignUserId() {
        return foreignUserId;
    }

    /**
     * Sets the value of the foreignUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignUserId(String value) {
        this.foreignUserId = value;
    }

    /**
     * Gets the value of the sourceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystem() {
        return sourceSystem;
    }

    /**
     * Sets the value of the sourceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystem(String value) {
        this.sourceSystem = value;
    }

}
