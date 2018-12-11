
package com.services.bwin.xmlns.types.earlypayoutservice._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutoCashoutType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AutoCashoutType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AutoCashout"/>
 *     &lt;enumeration value="Notification"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AutoCashoutType")
@XmlEnum
public enum AutoCashoutType {

    @XmlEnumValue("AutoCashout")
    AUTO_CASHOUT("AutoCashout"),
    @XmlEnumValue("Notification")
    NOTIFICATION("Notification");
    private final String value;

    AutoCashoutType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AutoCashoutType fromValue(String v) {
        for (AutoCashoutType c: AutoCashoutType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
