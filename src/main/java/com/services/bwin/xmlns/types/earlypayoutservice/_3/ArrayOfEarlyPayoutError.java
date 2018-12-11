
package com.services.bwin.xmlns.types.earlypayoutservice._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEarlyPayoutError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEarlyPayoutError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EarlyPayoutError" type="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}EarlyPayoutError" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEarlyPayoutError", propOrder = {
    "earlyPayoutError"
})
public class ArrayOfEarlyPayoutError {

    @XmlElement(name = "EarlyPayoutError", nillable = true)
    protected List<EarlyPayoutError> earlyPayoutError;

    /**
     * Gets the value of the earlyPayoutError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the earlyPayoutError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEarlyPayoutError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EarlyPayoutError }
     * 
     * 
     */
    public List<EarlyPayoutError> getEarlyPayoutError() {
        if (earlyPayoutError == null) {
            earlyPayoutError = new ArrayList<EarlyPayoutError>();
        }
        return this.earlyPayoutError;
    }

}
