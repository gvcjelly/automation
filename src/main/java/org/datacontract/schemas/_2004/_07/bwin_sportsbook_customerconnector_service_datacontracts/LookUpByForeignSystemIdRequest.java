
package org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LookUpByForeignSystemIdRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LookUpByForeignSystemIdRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ForeignUserId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SourceSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LookUpByForeignSystemIdRequest", propOrder = {
    "foreignUserId",
    "sourceSystem"
})
public class LookUpByForeignSystemIdRequest {

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
