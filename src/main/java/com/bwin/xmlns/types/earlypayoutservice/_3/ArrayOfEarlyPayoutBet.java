
package com.bwin.xmlns.types.earlypayoutservice._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEarlyPayoutBet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEarlyPayoutBet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EarlyPayoutBet" type="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}EarlyPayoutBet" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEarlyPayoutBet", propOrder = {
    "earlyPayoutBet"
})
public class ArrayOfEarlyPayoutBet {

    @XmlElement(name = "EarlyPayoutBet", nillable = true)
    protected List<EarlyPayoutBet> earlyPayoutBet;

    /**
     * Gets the value of the earlyPayoutBet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the earlyPayoutBet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEarlyPayoutBet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EarlyPayoutBet }
     * 
     * 
     */
    public List<EarlyPayoutBet> getEarlyPayoutBet() {
        if (earlyPayoutBet == null) {
            earlyPayoutBet = new ArrayList<EarlyPayoutBet>();
        }
        return this.earlyPayoutBet;
    }

}
