
package com.services.bwin.xmlns.types.earlypayoutservice._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BetEarlyPayoutNotAllowedReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BetEarlyPayoutNotAllowedReason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PaidWithFreeBet"/>
 *     &lt;enumeration value="TaxApplied"/>
 *     &lt;enumeration value="BetProtected"/>
 *     &lt;enumeration value="MarketTemplateNotAllowed"/>
 *     &lt;enumeration value="System"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="NotBasicModel"/>
 *     &lt;enumeration value="BetBlockedForEarlyPayout"/>
 *     &lt;enumeration value="OddsKeySafetyCheck"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BetEarlyPayoutNotAllowedReason")
@XmlEnum
public enum BetEarlyPayoutNotAllowedReason {

    @XmlEnumValue("PaidWithFreeBet")
    PAID_WITH_FREE_BET("PaidWithFreeBet"),
    @XmlEnumValue("TaxApplied")
    TAX_APPLIED("TaxApplied"),
    @XmlEnumValue("BetProtected")
    BET_PROTECTED("BetProtected"),
    @XmlEnumValue("MarketTemplateNotAllowed")
    MARKET_TEMPLATE_NOT_ALLOWED("MarketTemplateNotAllowed"),
    @XmlEnumValue("System")
    SYSTEM("System"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("NotBasicModel")
    NOT_BASIC_MODEL("NotBasicModel"),
    @XmlEnumValue("BetBlockedForEarlyPayout")
    BET_BLOCKED_FOR_EARLY_PAYOUT("BetBlockedForEarlyPayout"),
    @XmlEnumValue("OddsKeySafetyCheck")
    ODDS_KEY_SAFETY_CHECK("OddsKeySafetyCheck");
    private final String value;

    BetEarlyPayoutNotAllowedReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BetEarlyPayoutNotAllowedReason fromValue(String v) {
        for (BetEarlyPayoutNotAllowedReason c: BetEarlyPayoutNotAllowedReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
