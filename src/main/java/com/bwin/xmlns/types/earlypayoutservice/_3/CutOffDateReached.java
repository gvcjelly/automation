
package com.bwin.xmlns.types.earlypayoutservice._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CutOffDateReached complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CutOffDateReached">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}ResultError">
 *       &lt;sequence>
 *         &lt;element name="CutOffDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CutOffDateReached", propOrder = {
    "cutOffDate"
})
public class CutOffDateReached
    extends ResultError
{

    @XmlElement(name = "CutOffDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cutOffDate;

    /**
     * Gets the value of the cutOffDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCutOffDate() {
        return cutOffDate;
    }

    /**
     * Sets the value of the cutOffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCutOffDate(XMLGregorianCalendar value) {
        this.cutOffDate = value;
    }

}
