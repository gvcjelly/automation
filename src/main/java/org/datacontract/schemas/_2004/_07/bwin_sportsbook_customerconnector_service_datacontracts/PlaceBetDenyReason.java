
package org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlaceBetDenyReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PlaceBetDenyReason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="CustomerBlocked"/>
 *     &lt;enumeration value="CustomerClosed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PlaceBetDenyReason", namespace = "http://schemas.datacontract.org/2004/07/Bwin.Sportsbook.CustomerConnector.Service.DataContracts.Responses")
@XmlEnum
public enum PlaceBetDenyReason {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("CustomerBlocked")
    CUSTOMER_BLOCKED("CustomerBlocked"),
    @XmlEnumValue("CustomerClosed")
    CUSTOMER_CLOSED("CustomerClosed");
    private final String value;

    PlaceBetDenyReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlaceBetDenyReason fromValue(String v) {
        for (PlaceBetDenyReason c: PlaceBetDenyReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
