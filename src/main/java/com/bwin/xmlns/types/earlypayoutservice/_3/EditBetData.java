
package com.bwin.xmlns.types.earlypayoutservice._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditBetData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditBetData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EditBetToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditBetData", propOrder = {
    "editBetToken"
})
public class EditBetData {

    @XmlElement(name = "EditBetToken", required = true, nillable = true)
    protected String editBetToken;

    /**
     * Gets the value of the editBetToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditBetToken() {
        return editBetToken;
    }

    /**
     * Sets the value of the editBetToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditBetToken(String value) {
        this.editBetToken = value;
    }

}
