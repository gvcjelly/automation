
package com.services.bwin.xmlns.services.customerconnector._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreateSportsUserProfileResult" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "createSportsUserProfileResult"
})
@XmlRootElement(name = "CreateSportsUserProfileResponse")
public class CreateSportsUserProfileResponse {

    @XmlElement(name = "CreateSportsUserProfileResult")
    protected Long createSportsUserProfileResult;

    /**
     * Gets the value of the createSportsUserProfileResult property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreateSportsUserProfileResult() {
        return createSportsUserProfileResult;
    }

    /**
     * Sets the value of the createSportsUserProfileResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreateSportsUserProfileResult(Long value) {
        this.createSportsUserProfileResult = value;
    }

}
