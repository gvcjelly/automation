
package com.services.bwin.xmlns.types.earlypayoutservice._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayoutAcceptanceMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PayoutAcceptanceMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AcceptAnyChanges"/>
 *     &lt;enumeration value="AcceptHigherPayoutAmount"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PayoutAcceptanceMode")
@XmlEnum
public enum PayoutAcceptanceMode {

    @XmlEnumValue("AcceptAnyChanges")
    ACCEPT_ANY_CHANGES("AcceptAnyChanges"),
    @XmlEnumValue("AcceptHigherPayoutAmount")
    ACCEPT_HIGHER_PAYOUT_AMOUNT("AcceptHigherPayoutAmount");
    private final String value;

    PayoutAcceptanceMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PayoutAcceptanceMode fromValue(String v) {
        for (PayoutAcceptanceMode c: PayoutAcceptanceMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
