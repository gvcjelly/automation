
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bwin.xmlns.types.earlypayoutservice._3.Bet;


/**
 * <p>Java class for ArrayOfKeyValueOfintBetNNSPdE8A complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfintBetNNSPdE8A">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyValueOfintBetNNSPdE8A" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Value" type="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}Bet"/>
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
@XmlType(name = "ArrayOfKeyValueOfintBetNNSPdE8A", propOrder = {
    "keyValueOfintBetNNSPdE8A"
})
public class ArrayOfKeyValueOfintBetNNSPdE8A {

    @XmlElement(name = "KeyValueOfintBetNNSPdE8A")
    protected List<ArrayOfKeyValueOfintBetNNSPdE8A.KeyValueOfintBetNNSPdE8A> keyValueOfintBetNNSPdE8A;

    /**
     * Gets the value of the keyValueOfintBetNNSPdE8A property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfintBetNNSPdE8A property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfintBetNNSPdE8A().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfintBetNNSPdE8A.KeyValueOfintBetNNSPdE8A }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfintBetNNSPdE8A.KeyValueOfintBetNNSPdE8A> getKeyValueOfintBetNNSPdE8A() {
        if (keyValueOfintBetNNSPdE8A == null) {
            keyValueOfintBetNNSPdE8A = new ArrayList<ArrayOfKeyValueOfintBetNNSPdE8A.KeyValueOfintBetNNSPdE8A>();
        }
        return this.keyValueOfintBetNNSPdE8A;
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
     *         &lt;element name="Value" type="{http://xmlns.bwin.com/types/EarlyPayoutService/3.0}Bet"/>
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
    public static class KeyValueOfintBetNNSPdE8A {

        @XmlElement(name = "Key")
        protected int key;
        @XmlElement(name = "Value", required = true, nillable = true)
        protected Bet value;

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
         *     {@link Bet }
         *     
         */
        public Bet getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link Bet }
         *     
         */
        public void setValue(Bet value) {
            this.value = value;
        }

    }

}
