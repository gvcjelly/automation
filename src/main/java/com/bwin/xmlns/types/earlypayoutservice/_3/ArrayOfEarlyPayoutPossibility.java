
package com.bwin.xmlns.types.earlypayoutservice._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEarlyPayoutPossibility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEarlyPayoutPossibility">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EarlyPayoutPossibility" type="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}EarlyPayoutPossibility" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEarlyPayoutPossibility", propOrder = {
    "earlyPayoutPossibility"
})
public class ArrayOfEarlyPayoutPossibility {

    @XmlElement(name = "EarlyPayoutPossibility", nillable = true)
    protected List<EarlyPayoutPossibility> earlyPayoutPossibility;

    /**
     * Gets the value of the earlyPayoutPossibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the earlyPayoutPossibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEarlyPayoutPossibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EarlyPayoutPossibility }
     * 
     * 
     */
    public List<EarlyPayoutPossibility> getEarlyPayoutPossibility() {
        if (earlyPayoutPossibility == null) {
            earlyPayoutPossibility = new ArrayList<EarlyPayoutPossibility>();
        }
        return this.earlyPayoutPossibility;
    }

}
