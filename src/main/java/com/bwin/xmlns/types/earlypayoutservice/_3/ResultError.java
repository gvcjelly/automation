
package com.bwin.xmlns.types.earlypayoutservice._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultError">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}EarlyPayoutError">
 *       &lt;sequence>
 *         &lt;element name="ResultId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultError", propOrder = {
    "resultId"
})
@XmlSeeAlso({
    CutOffDateReached.class,
    ResultNotFound.class,
    ResultInvisible.class,
    ChangedResultStatus.class
})
public class ResultError
    extends EarlyPayoutError
{

    @XmlElement(name = "ResultId")
    protected Integer resultId;

    /**
     * Gets the value of the resultId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResultId() {
        return resultId;
    }

    /**
     * Sets the value of the resultId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResultId(Integer value) {
        this.resultId = value;
    }

}
