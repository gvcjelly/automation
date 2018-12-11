
package org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLookUpByForeignSystemIdRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLookUpByForeignSystemIdRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LookUpByForeignSystemIdRequest" type="{http://schemas.datacontract.org/2004/07/Bwin.Sportsbook.CustomerConnector.Service.DataContracts.Requests}LookUpByForeignSystemIdRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLookUpByForeignSystemIdRequest", propOrder = {
    "lookUpByForeignSystemIdRequest"
})
public class ArrayOfLookUpByForeignSystemIdRequest {

    @XmlElement(name = "LookUpByForeignSystemIdRequest", nillable = true)
    protected List<LookUpByForeignSystemIdRequest> lookUpByForeignSystemIdRequest;

    /**
     * Gets the value of the lookUpByForeignSystemIdRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lookUpByForeignSystemIdRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLookUpByForeignSystemIdRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LookUpByForeignSystemIdRequest }
     * 
     * 
     */
    public List<LookUpByForeignSystemIdRequest> getLookUpByForeignSystemIdRequest() {
        if (lookUpByForeignSystemIdRequest == null) {
            lookUpByForeignSystemIdRequest = new ArrayList<LookUpByForeignSystemIdRequest>();
        }
        return this.lookUpByForeignSystemIdRequest;
    }

}
