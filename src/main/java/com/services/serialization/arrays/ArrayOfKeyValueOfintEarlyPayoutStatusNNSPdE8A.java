
package com.services.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.services.bwin.xmlns.types.earlypayoutservice._3.EarlyPayoutStatus;


/**
 * <p>Java class for ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyValueOfintEarlyPayoutStatusNNSPdE8A" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Value" type="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}EarlyPayoutStatus"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A", propOrder = {
    "keyValueOfintEarlyPayoutStatusNNSPdE8A"
})
public class ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A {

    @XmlElement(name = "KeyValueOfintEarlyPayoutStatusNNSPdE8A")
    protected List<ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A.KeyValueOfintEarlyPayoutStatusNNSPdE8A> keyValueOfintEarlyPayoutStatusNNSPdE8A;

    /**
     * Gets the value of the keyValueOfintEarlyPayoutStatusNNSPdE8A property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfintEarlyPayoutStatusNNSPdE8A property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfintEarlyPayoutStatusNNSPdE8A().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A.KeyValueOfintEarlyPayoutStatusNNSPdE8A }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A.KeyValueOfintEarlyPayoutStatusNNSPdE8A> getKeyValueOfintEarlyPayoutStatusNNSPdE8A() {
        if (keyValueOfintEarlyPayoutStatusNNSPdE8A == null) {
            keyValueOfintEarlyPayoutStatusNNSPdE8A = new ArrayList<ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A.KeyValueOfintEarlyPayoutStatusNNSPdE8A>();
        }
        return this.keyValueOfintEarlyPayoutStatusNNSPdE8A;
    }


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
     *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Value" type="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}EarlyPayoutStatus"/>
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
        "key",
        "value"
    })
    public static class KeyValueOfintEarlyPayoutStatusNNSPdE8A {

        @XmlElement(name = "Key")
        protected int key;
        @XmlElement(name = "Value", required = true, nillable = true)
        protected EarlyPayoutStatus value;

        /**
         * Gets the value of the key property.
         * 
         */
        public int getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         */
        public void setKey(int value) {
            this.key = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link EarlyPayoutStatus }
         *     
         */
        public EarlyPayoutStatus getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link EarlyPayoutStatus }
         *     
         */
        public void setValue(EarlyPayoutStatus value) {
            this.value = value;
        }

    }

}
