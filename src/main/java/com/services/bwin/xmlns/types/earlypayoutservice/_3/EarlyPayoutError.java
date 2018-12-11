
package com.services.bwin.xmlns.types.earlypayoutservice._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EarlyPayoutError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EarlyPayoutError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EarlyPayoutError")
@XmlSeeAlso({
    DuplicatedEarlyPayout.class,
    EarlyPayoutAmountChanged.class,
    BetLost.class,
    EarlyPayoutNotAllowed.class,
    UnderMinEarlyPayoutAmount.class,
    TechnicalError.class,
    AutoCashoutNotAllowed.class,
    OverMaxEarlyPayoutAmount.class,
    BetFromDifferentUser.class,
    UnderMinOddsKey.class,
    BetNotAllowedForEarlyPayout.class,
    BetNotFound.class,
    ResultError.class,
    InconsistentMonetaryValue.class,
    AutoCashoutNotificationNotAllowed.class,
    EarlyPayoutNotFound.class,
    ChangedBetSlipState.class,
    DuplicatedAutoCashout.class
})
public class EarlyPayoutError {


}
