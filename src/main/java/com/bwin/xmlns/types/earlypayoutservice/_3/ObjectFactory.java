
package com.bwin.xmlns.types.earlypayoutservice._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bwin.xmlns.types.earlypayoutservice._3 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UnderMinEarlyPayoutAmount_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "UnderMinEarlyPayoutAmount");
    private final static QName _TechnicalError_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "TechnicalError");
    private final static QName _EarlyPayoutPending_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "EarlyPayoutPending");
    private final static QName _EarlyPayoutNotAllowed_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "EarlyPayoutNotAllowed");
    private final static QName _CutOffDateReached_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "CutOffDateReached");
    private final static QName _EarlyPayoutRequest_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "EarlyPayoutRequest");
    private final static QName _ArrayOfEarlyPayoutError_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "ArrayOfEarlyPayoutError");
    private final static QName _UndoEarlyPayoutResponse_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "UndoEarlyPayoutResponse");
    private final static QName _BetLost_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "BetLost");
    private final static QName _DuplicatedEarlyPayout_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "DuplicatedEarlyPayout");
    private final static QName _Customer_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "Customer");
    private final static QName _GetStatusResponse_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "GetStatusResponse");
    private final static QName _RemoveAutoCashoutRequest_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "RemoveAutoCashoutRequest");
    private final static QName _EarlyPayoutAmountChanged_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "EarlyPayoutAmountChanged");
    private final static QName _AutoCashoutFailed_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "AutoCashoutFailed");
    private final static QName _ResultError_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "ResultError");
    private final static QName _AutoCashoutResponse_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "AutoCashoutResponse");
    private final static QName _GetEarlyPayoutConstraintsRequest_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "GetEarlyPayoutConstraintsRequest");
    private final static QName _ResultNotFound_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "ResultNotFound");
    private final static QName _OverMaxEarlyPayoutAmount_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "OverMaxEarlyPayoutAmount");
    private final static QName _TechnicalFault_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "TechnicalFault");
    private final static QName _GetEarlyPayoutConstraintsResponse_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "GetEarlyPayoutConstraintsResponse");
    private final static QName _CheckPossibleEarlyPayoutRequest_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "CheckPossibleEarlyPayoutRequest");
    private final static QName _AutoCashoutType_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "AutoCashoutType");
    private final static QName _AutoCashoutNotAllowed_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "AutoCashoutNotAllowed");
    private final static QName _RequestId_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "RequestId");
    private final static QName _EarlyPayoutStatus_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "EarlyPayoutStatus");
    private final static QName _ArrayOfEarlyPayoutPossibility_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "ArrayOfEarlyPayoutPossibility");
    private final static QName _EarlyPayoutBet_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "EarlyPayoutBet");
    private final static QName _AutoCashoutSucceeded_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "AutoCashoutSucceeded");
    private final static QName _BetNotAllowedForEarlyPayout_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "BetNotAllowedForEarlyPayout");
    private final static QName _ResultInvisible_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "ResultInvisible");
    private final static QName _UnderMinOddsKey_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "UnderMinOddsKey");
    private final static QName _CheckPossibleEarlyPayoutResponse_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "CheckPossibleEarlyPayoutResponse");
    private final static QName _EarlyPayoutError_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "EarlyPayoutError");
    private final static QName _RequestIdNotFoundFault_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "RequestIdNotFoundFault");
    private final static QName _UndoEarlyPayoutFailed_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "UndoEarlyPayoutFailed");
    private final static QName _UndoEarlyPayoutSucceeded_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "UndoEarlyPayoutSucceeded");
    private final static QName _GetAutoCashoutRequest_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "GetAutoCashoutRequest");
    private final static QName _UndoEarlyPayoutRequest_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "UndoEarlyPayoutRequest");
    private final static QName _PayoutAcceptanceMode_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "PayoutAcceptanceMode");
    private final static QName _AutoCashoutBet_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "AutoCashoutBet");
    private final static QName _BetFromDifferentUser_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "BetFromDifferentUser");
    private final static QName _GetStatusRequest_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "GetStatusRequest");
    private final static QName _EarlyPayoutResponse_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "EarlyPayoutResponse");
    private final static QName _ChangedBetSlipState_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "ChangedBetSlipState");
    private final static QName _ArrayOfAutoCashoutBet_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "ArrayOfAutoCashoutBet");
    private final static QName _DuplicatedAutoCashout_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "DuplicatedAutoCashout");
    private final static QName _BetEarlyPayoutNotAllowedReason_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "BetEarlyPayoutNotAllowedReason");
    private final static QName _Bet_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "Bet");
    private final static QName _EarlyPayoutPossibility_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "EarlyPayoutPossibility");
    private final static QName _EarlyPayoutSucceeded_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "EarlyPayoutSucceeded");
    private final static QName _RequestIdBlockedFault_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "RequestIdBlockedFault");
    private final static QName _EditBetData_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "EditBetData");
    private final static QName _EarlyPayoutNotFound_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "EarlyPayoutNotFound");
    private final static QName _AutoCashoutNotificationNotAllowed_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "AutoCashoutNotificationNotAllowed");
    private final static QName _EarlyPayoutFailed_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "EarlyPayoutFailed");
    private final static QName _ArrayOfEarlyPayoutBet_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "ArrayOfEarlyPayoutBet");
    private final static QName _GetAutoCashoutResponse_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "GetAutoCashoutResponse");
    private final static QName _BetNotFound_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "BetNotFound");
    private final static QName _ChangedResultStatus_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "ChangedResultStatus");
    private final static QName _InconsistentMonetaryValue_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "InconsistentMonetaryValue");
    private final static QName _SetAutoCashoutRequest_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "SetAutoCashoutRequest");
    private final static QName _TechnicalErrorReason_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "Reason");
    private final static QName _AutoCashoutResponseBetNumber_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "BetNumber");
    private final static QName _CheckPossibleEarlyPayoutRequestEarlyPayouts_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "EarlyPayouts");
    private final static QName _CheckPossibleEarlyPayoutRequestSubChannel_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "SubChannel");
    private final static QName _GetStatusResponseEarlyPayoutStatuses_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "EarlyPayoutStatuses");
    private final static QName _EarlyPayoutRequestGlobalSessionId_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "GlobalSessionId");
    private final static QName _EarlyPayoutRequestAccessId_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "AccessId");
    private final static QName _EarlyPayoutFailedErrors_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "Errors");
    private final static QName _UndoEarlyPayoutFailedError_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "Error");
    private final static QName _GetAutoCashoutRequestBetNumbers_QNAME = new QName("http://xmlns.bwin.com/types/EarlyPayoutService/3.0", "BetNumbers");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bwin.xmlns.types.earlypayoutservice._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEarlyPayoutConstraintsRequest }
     * 
     */
    public GetEarlyPayoutConstraintsRequest createGetEarlyPayoutConstraintsRequest() {
        return new GetEarlyPayoutConstraintsRequest();
    }

    /**
     * Create an instance of {@link GetAutoCashoutResponse }
     * 
     */
    public GetAutoCashoutResponse createGetAutoCashoutResponse() {
        return new GetAutoCashoutResponse();
    }

    /**
     * Create an instance of {@link GetStatusResponse }
     * 
     */
    public GetStatusResponse createGetStatusResponse() {
        return new GetStatusResponse();
    }

    /**
     * Create an instance of {@link SetAutoCashoutRequest }
     * 
     */
    public SetAutoCashoutRequest createSetAutoCashoutRequest() {
        return new SetAutoCashoutRequest();
    }

    /**
     * Create an instance of {@link GetEarlyPayoutConstraintsResponse }
     * 
     */
    public GetEarlyPayoutConstraintsResponse createGetEarlyPayoutConstraintsResponse() {
        return new GetEarlyPayoutConstraintsResponse();
    }

    /**
     * Create an instance of {@link CheckPossibleEarlyPayoutResponse }
     * 
     */
    public CheckPossibleEarlyPayoutResponse createCheckPossibleEarlyPayoutResponse() {
        return new CheckPossibleEarlyPayoutResponse();
    }

    /**
     * Create an instance of {@link UndoEarlyPayoutResponse }
     * 
     */
    public UndoEarlyPayoutResponse createUndoEarlyPayoutResponse() {
        return new UndoEarlyPayoutResponse();
    }

    /**
     * Create an instance of {@link AutoCashoutResponse }
     * 
     */
    public AutoCashoutResponse createAutoCashoutResponse() {
        return new AutoCashoutResponse();
    }

    /**
     * Create an instance of {@link GetAutoCashoutRequest }
     * 
     */
    public GetAutoCashoutRequest createGetAutoCashoutRequest() {
        return new GetAutoCashoutRequest();
    }

    /**
     * Create an instance of {@link RemoveAutoCashoutRequest }
     * 
     */
    public RemoveAutoCashoutRequest createRemoveAutoCashoutRequest() {
        return new RemoveAutoCashoutRequest();
    }

    /**
     * Create an instance of {@link UndoEarlyPayoutRequest }
     * 
     */
    public UndoEarlyPayoutRequest createUndoEarlyPayoutRequest() {
        return new UndoEarlyPayoutRequest();
    }

    /**
     * Create an instance of {@link EarlyPayoutResponse }
     * 
     */
    public EarlyPayoutResponse createEarlyPayoutResponse() {
        return new EarlyPayoutResponse();
    }

    /**
     * Create an instance of {@link CheckPossibleEarlyPayoutRequest }
     * 
     */
    public CheckPossibleEarlyPayoutRequest createCheckPossibleEarlyPayoutRequest() {
        return new CheckPossibleEarlyPayoutRequest();
    }

    /**
     * Create an instance of {@link EarlyPayoutRequest }
     * 
     */
    public EarlyPayoutRequest createEarlyPayoutRequest() {
        return new EarlyPayoutRequest();
    }

    /**
     * Create an instance of {@link GetStatusRequest }
     * 
     */
    public GetStatusRequest createGetStatusRequest() {
        return new GetStatusRequest();
    }

    /**
     * Create an instance of {@link DuplicatedEarlyPayout }
     * 
     */
    public DuplicatedEarlyPayout createDuplicatedEarlyPayout() {
        return new DuplicatedEarlyPayout();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link EarlyPayoutAmountChanged }
     * 
     */
    public EarlyPayoutAmountChanged createEarlyPayoutAmountChanged() {
        return new EarlyPayoutAmountChanged();
    }

    /**
     * Create an instance of {@link BetLost }
     * 
     */
    public BetLost createBetLost() {
        return new BetLost();
    }

    /**
     * Create an instance of {@link CutOffDateReached }
     * 
     */
    public CutOffDateReached createCutOffDateReached() {
        return new CutOffDateReached();
    }

    /**
     * Create an instance of {@link EarlyPayoutNotAllowed }
     * 
     */
    public EarlyPayoutNotAllowed createEarlyPayoutNotAllowed() {
        return new EarlyPayoutNotAllowed();
    }

    /**
     * Create an instance of {@link ArrayOfEarlyPayoutError }
     * 
     */
    public ArrayOfEarlyPayoutError createArrayOfEarlyPayoutError() {
        return new ArrayOfEarlyPayoutError();
    }

    /**
     * Create an instance of {@link UnderMinEarlyPayoutAmount }
     * 
     */
    public UnderMinEarlyPayoutAmount createUnderMinEarlyPayoutAmount() {
        return new UnderMinEarlyPayoutAmount();
    }

    /**
     * Create an instance of {@link TechnicalError }
     * 
     */
    public TechnicalError createTechnicalError() {
        return new TechnicalError();
    }

    /**
     * Create an instance of {@link EarlyPayoutPending }
     * 
     */
    public EarlyPayoutPending createEarlyPayoutPending() {
        return new EarlyPayoutPending();
    }

    /**
     * Create an instance of {@link RequestId }
     * 
     */
    public RequestId createRequestId() {
        return new RequestId();
    }

    /**
     * Create an instance of {@link EarlyPayoutStatus }
     * 
     */
    public EarlyPayoutStatus createEarlyPayoutStatus() {
        return new EarlyPayoutStatus();
    }

    /**
     * Create an instance of {@link AutoCashoutNotAllowed }
     * 
     */
    public AutoCashoutNotAllowed createAutoCashoutNotAllowed() {
        return new AutoCashoutNotAllowed();
    }

    /**
     * Create an instance of {@link ArrayOfEarlyPayoutPossibility }
     * 
     */
    public ArrayOfEarlyPayoutPossibility createArrayOfEarlyPayoutPossibility() {
        return new ArrayOfEarlyPayoutPossibility();
    }

    /**
     * Create an instance of {@link ResultNotFound }
     * 
     */
    public ResultNotFound createResultNotFound() {
        return new ResultNotFound();
    }

    /**
     * Create an instance of {@link TechnicalFault }
     * 
     */
    public TechnicalFault createTechnicalFault() {
        return new TechnicalFault();
    }

    /**
     * Create an instance of {@link OverMaxEarlyPayoutAmount }
     * 
     */
    public OverMaxEarlyPayoutAmount createOverMaxEarlyPayoutAmount() {
        return new OverMaxEarlyPayoutAmount();
    }

    /**
     * Create an instance of {@link AutoCashoutFailed }
     * 
     */
    public AutoCashoutFailed createAutoCashoutFailed() {
        return new AutoCashoutFailed();
    }

    /**
     * Create an instance of {@link ResultError }
     * 
     */
    public ResultError createResultError() {
        return new ResultError();
    }

    /**
     * Create an instance of {@link BetFromDifferentUser }
     * 
     */
    public BetFromDifferentUser createBetFromDifferentUser() {
        return new BetFromDifferentUser();
    }

    /**
     * Create an instance of {@link AutoCashoutBet }
     * 
     */
    public AutoCashoutBet createAutoCashoutBet() {
        return new AutoCashoutBet();
    }

    /**
     * Create an instance of {@link UndoEarlyPayoutFailed }
     * 
     */
    public UndoEarlyPayoutFailed createUndoEarlyPayoutFailed() {
        return new UndoEarlyPayoutFailed();
    }

    /**
     * Create an instance of {@link UndoEarlyPayoutSucceeded }
     * 
     */
    public UndoEarlyPayoutSucceeded createUndoEarlyPayoutSucceeded() {
        return new UndoEarlyPayoutSucceeded();
    }

    /**
     * Create an instance of {@link UnderMinOddsKey }
     * 
     */
    public UnderMinOddsKey createUnderMinOddsKey() {
        return new UnderMinOddsKey();
    }

    /**
     * Create an instance of {@link EarlyPayoutError }
     * 
     */
    public EarlyPayoutError createEarlyPayoutError() {
        return new EarlyPayoutError();
    }

    /**
     * Create an instance of {@link RequestIdNotFoundFault }
     * 
     */
    public RequestIdNotFoundFault createRequestIdNotFoundFault() {
        return new RequestIdNotFoundFault();
    }

    /**
     * Create an instance of {@link EarlyPayoutBet }
     * 
     */
    public EarlyPayoutBet createEarlyPayoutBet() {
        return new EarlyPayoutBet();
    }

    /**
     * Create an instance of {@link AutoCashoutSucceeded }
     * 
     */
    public AutoCashoutSucceeded createAutoCashoutSucceeded() {
        return new AutoCashoutSucceeded();
    }

    /**
     * Create an instance of {@link BetNotAllowedForEarlyPayout }
     * 
     */
    public BetNotAllowedForEarlyPayout createBetNotAllowedForEarlyPayout() {
        return new BetNotAllowedForEarlyPayout();
    }

    /**
     * Create an instance of {@link ResultInvisible }
     * 
     */
    public ResultInvisible createResultInvisible() {
        return new ResultInvisible();
    }

    /**
     * Create an instance of {@link ArrayOfEarlyPayoutBet }
     * 
     */
    public ArrayOfEarlyPayoutBet createArrayOfEarlyPayoutBet() {
        return new ArrayOfEarlyPayoutBet();
    }

    /**
     * Create an instance of {@link BetNotFound }
     * 
     */
    public BetNotFound createBetNotFound() {
        return new BetNotFound();
    }

    /**
     * Create an instance of {@link ChangedResultStatus }
     * 
     */
    public ChangedResultStatus createChangedResultStatus() {
        return new ChangedResultStatus();
    }

    /**
     * Create an instance of {@link InconsistentMonetaryValue }
     * 
     */
    public InconsistentMonetaryValue createInconsistentMonetaryValue() {
        return new InconsistentMonetaryValue();
    }

    /**
     * Create an instance of {@link EarlyPayoutFailed }
     * 
     */
    public EarlyPayoutFailed createEarlyPayoutFailed() {
        return new EarlyPayoutFailed();
    }

    /**
     * Create an instance of {@link AutoCashoutNotificationNotAllowed }
     * 
     */
    public AutoCashoutNotificationNotAllowed createAutoCashoutNotificationNotAllowed() {
        return new AutoCashoutNotificationNotAllowed();
    }

    /**
     * Create an instance of {@link Bet }
     * 
     */
    public Bet createBet() {
        return new Bet();
    }

    /**
     * Create an instance of {@link EarlyPayoutPossibility }
     * 
     */
    public EarlyPayoutPossibility createEarlyPayoutPossibility() {
        return new EarlyPayoutPossibility();
    }

    /**
     * Create an instance of {@link EarlyPayoutSucceeded }
     * 
     */
    public EarlyPayoutSucceeded createEarlyPayoutSucceeded() {
        return new EarlyPayoutSucceeded();
    }

    /**
     * Create an instance of {@link RequestIdBlockedFault }
     * 
     */
    public RequestIdBlockedFault createRequestIdBlockedFault() {
        return new RequestIdBlockedFault();
    }

    /**
     * Create an instance of {@link EditBetData }
     * 
     */
    public EditBetData createEditBetData() {
        return new EditBetData();
    }

    /**
     * Create an instance of {@link EarlyPayoutNotFound }
     * 
     */
    public EarlyPayoutNotFound createEarlyPayoutNotFound() {
        return new EarlyPayoutNotFound();
    }

    /**
     * Create an instance of {@link ChangedBetSlipState }
     * 
     */
    public ChangedBetSlipState createChangedBetSlipState() {
        return new ChangedBetSlipState();
    }

    /**
     * Create an instance of {@link DuplicatedAutoCashout }
     * 
     */
    public DuplicatedAutoCashout createDuplicatedAutoCashout() {
        return new DuplicatedAutoCashout();
    }

    /**
     * Create an instance of {@link ArrayOfAutoCashoutBet }
     * 
     */
    public ArrayOfAutoCashoutBet createArrayOfAutoCashoutBet() {
        return new ArrayOfAutoCashoutBet();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnderMinEarlyPayoutAmount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "UnderMinEarlyPayoutAmount")
    public JAXBElement<UnderMinEarlyPayoutAmount> createUnderMinEarlyPayoutAmount(UnderMinEarlyPayoutAmount value) {
        return new JAXBElement<UnderMinEarlyPayoutAmount>(_UnderMinEarlyPayoutAmount_QNAME, UnderMinEarlyPayoutAmount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TechnicalError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "TechnicalError")
    public JAXBElement<TechnicalError> createTechnicalError(TechnicalError value) {
        return new JAXBElement<TechnicalError>(_TechnicalError_QNAME, TechnicalError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EarlyPayoutPending }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "EarlyPayoutPending")
    public JAXBElement<EarlyPayoutPending> createEarlyPayoutPending(EarlyPayoutPending value) {
        return new JAXBElement<EarlyPayoutPending>(_EarlyPayoutPending_QNAME, EarlyPayoutPending.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EarlyPayoutNotAllowed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "EarlyPayoutNotAllowed")
    public JAXBElement<EarlyPayoutNotAllowed> createEarlyPayoutNotAllowed(EarlyPayoutNotAllowed value) {
        return new JAXBElement<EarlyPayoutNotAllowed>(_EarlyPayoutNotAllowed_QNAME, EarlyPayoutNotAllowed.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CutOffDateReached }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "CutOffDateReached")
    public JAXBElement<CutOffDateReached> createCutOffDateReached(CutOffDateReached value) {
        return new JAXBElement<CutOffDateReached>(_CutOffDateReached_QNAME, CutOffDateReached.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EarlyPayoutRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "EarlyPayoutRequest")
    public JAXBElement<EarlyPayoutRequest> createEarlyPayoutRequest(EarlyPayoutRequest value) {
        return new JAXBElement<EarlyPayoutRequest>(_EarlyPayoutRequest_QNAME, EarlyPayoutRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEarlyPayoutError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "ArrayOfEarlyPayoutError")
    public JAXBElement<ArrayOfEarlyPayoutError> createArrayOfEarlyPayoutError(ArrayOfEarlyPayoutError value) {
        return new JAXBElement<ArrayOfEarlyPayoutError>(_ArrayOfEarlyPayoutError_QNAME, ArrayOfEarlyPayoutError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UndoEarlyPayoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "UndoEarlyPayoutResponse")
    public JAXBElement<UndoEarlyPayoutResponse> createUndoEarlyPayoutResponse(UndoEarlyPayoutResponse value) {
        return new JAXBElement<UndoEarlyPayoutResponse>(_UndoEarlyPayoutResponse_QNAME, UndoEarlyPayoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BetLost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "BetLost")
    public JAXBElement<BetLost> createBetLost(BetLost value) {
        return new JAXBElement<BetLost>(_BetLost_QNAME, BetLost.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DuplicatedEarlyPayout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "DuplicatedEarlyPayout")
    public JAXBElement<DuplicatedEarlyPayout> createDuplicatedEarlyPayout(DuplicatedEarlyPayout value) {
        return new JAXBElement<DuplicatedEarlyPayout>(_DuplicatedEarlyPayout_QNAME, DuplicatedEarlyPayout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "Customer")
    public JAXBElement<Customer> createCustomer(Customer value) {
        return new JAXBElement<Customer>(_Customer_QNAME, Customer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "GetStatusResponse")
    public JAXBElement<GetStatusResponse> createGetStatusResponse(GetStatusResponse value) {
        return new JAXBElement<GetStatusResponse>(_GetStatusResponse_QNAME, GetStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAutoCashoutRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "RemoveAutoCashoutRequest")
    public JAXBElement<RemoveAutoCashoutRequest> createRemoveAutoCashoutRequest(RemoveAutoCashoutRequest value) {
        return new JAXBElement<RemoveAutoCashoutRequest>(_RemoveAutoCashoutRequest_QNAME, RemoveAutoCashoutRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EarlyPayoutAmountChanged }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "EarlyPayoutAmountChanged")
    public JAXBElement<EarlyPayoutAmountChanged> createEarlyPayoutAmountChanged(EarlyPayoutAmountChanged value) {
        return new JAXBElement<EarlyPayoutAmountChanged>(_EarlyPayoutAmountChanged_QNAME, EarlyPayoutAmountChanged.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoCashoutFailed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "AutoCashoutFailed")
    public JAXBElement<AutoCashoutFailed> createAutoCashoutFailed(AutoCashoutFailed value) {
        return new JAXBElement<AutoCashoutFailed>(_AutoCashoutFailed_QNAME, AutoCashoutFailed.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "ResultError")
    public JAXBElement<ResultError> createResultError(ResultError value) {
        return new JAXBElement<ResultError>(_ResultError_QNAME, ResultError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoCashoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "AutoCashoutResponse")
    public JAXBElement<AutoCashoutResponse> createAutoCashoutResponse(AutoCashoutResponse value) {
        return new JAXBElement<AutoCashoutResponse>(_AutoCashoutResponse_QNAME, AutoCashoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEarlyPayoutConstraintsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "GetEarlyPayoutConstraintsRequest")
    public JAXBElement<GetEarlyPayoutConstraintsRequest> createGetEarlyPayoutConstraintsRequest(GetEarlyPayoutConstraintsRequest value) {
        return new JAXBElement<GetEarlyPayoutConstraintsRequest>(_GetEarlyPayoutConstraintsRequest_QNAME, GetEarlyPayoutConstraintsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultNotFound }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "ResultNotFound")
    public JAXBElement<ResultNotFound> createResultNotFound(ResultNotFound value) {
        return new JAXBElement<ResultNotFound>(_ResultNotFound_QNAME, ResultNotFound.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OverMaxEarlyPayoutAmount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "OverMaxEarlyPayoutAmount")
    public JAXBElement<OverMaxEarlyPayoutAmount> createOverMaxEarlyPayoutAmount(OverMaxEarlyPayoutAmount value) {
        return new JAXBElement<OverMaxEarlyPayoutAmount>(_OverMaxEarlyPayoutAmount_QNAME, OverMaxEarlyPayoutAmount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TechnicalFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "TechnicalFault")
    public JAXBElement<TechnicalFault> createTechnicalFault(TechnicalFault value) {
        return new JAXBElement<TechnicalFault>(_TechnicalFault_QNAME, TechnicalFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEarlyPayoutConstraintsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "GetEarlyPayoutConstraintsResponse")
    public JAXBElement<GetEarlyPayoutConstraintsResponse> createGetEarlyPayoutConstraintsResponse(GetEarlyPayoutConstraintsResponse value) {
        return new JAXBElement<GetEarlyPayoutConstraintsResponse>(_GetEarlyPayoutConstraintsResponse_QNAME, GetEarlyPayoutConstraintsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPossibleEarlyPayoutRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "CheckPossibleEarlyPayoutRequest")
    public JAXBElement<CheckPossibleEarlyPayoutRequest> createCheckPossibleEarlyPayoutRequest(CheckPossibleEarlyPayoutRequest value) {
        return new JAXBElement<CheckPossibleEarlyPayoutRequest>(_CheckPossibleEarlyPayoutRequest_QNAME, CheckPossibleEarlyPayoutRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoCashoutType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "AutoCashoutType")
    public JAXBElement<AutoCashoutType> createAutoCashoutType(AutoCashoutType value) {
        return new JAXBElement<AutoCashoutType>(_AutoCashoutType_QNAME, AutoCashoutType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoCashoutNotAllowed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "AutoCashoutNotAllowed")
    public JAXBElement<AutoCashoutNotAllowed> createAutoCashoutNotAllowed(AutoCashoutNotAllowed value) {
        return new JAXBElement<AutoCashoutNotAllowed>(_AutoCashoutNotAllowed_QNAME, AutoCashoutNotAllowed.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "RequestId")
    public JAXBElement<RequestId> createRequestId(RequestId value) {
        return new JAXBElement<RequestId>(_RequestId_QNAME, RequestId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EarlyPayoutStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "EarlyPayoutStatus")
    public JAXBElement<EarlyPayoutStatus> createEarlyPayoutStatus(EarlyPayoutStatus value) {
        return new JAXBElement<EarlyPayoutStatus>(_EarlyPayoutStatus_QNAME, EarlyPayoutStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEarlyPayoutPossibility }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "ArrayOfEarlyPayoutPossibility")
    public JAXBElement<ArrayOfEarlyPayoutPossibility> createArrayOfEarlyPayoutPossibility(ArrayOfEarlyPayoutPossibility value) {
        return new JAXBElement<ArrayOfEarlyPayoutPossibility>(_ArrayOfEarlyPayoutPossibility_QNAME, ArrayOfEarlyPayoutPossibility.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EarlyPayoutBet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "EarlyPayoutBet")
    public JAXBElement<EarlyPayoutBet> createEarlyPayoutBet(EarlyPayoutBet value) {
        return new JAXBElement<EarlyPayoutBet>(_EarlyPayoutBet_QNAME, EarlyPayoutBet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoCashoutSucceeded }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "AutoCashoutSucceeded")
    public JAXBElement<AutoCashoutSucceeded> createAutoCashoutSucceeded(AutoCashoutSucceeded value) {
        return new JAXBElement<AutoCashoutSucceeded>(_AutoCashoutSucceeded_QNAME, AutoCashoutSucceeded.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BetNotAllowedForEarlyPayout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "BetNotAllowedForEarlyPayout")
    public JAXBElement<BetNotAllowedForEarlyPayout> createBetNotAllowedForEarlyPayout(BetNotAllowedForEarlyPayout value) {
        return new JAXBElement<BetNotAllowedForEarlyPayout>(_BetNotAllowedForEarlyPayout_QNAME, BetNotAllowedForEarlyPayout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultInvisible }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "ResultInvisible")
    public JAXBElement<ResultInvisible> createResultInvisible(ResultInvisible value) {
        return new JAXBElement<ResultInvisible>(_ResultInvisible_QNAME, ResultInvisible.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnderMinOddsKey }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "UnderMinOddsKey")
    public JAXBElement<UnderMinOddsKey> createUnderMinOddsKey(UnderMinOddsKey value) {
        return new JAXBElement<UnderMinOddsKey>(_UnderMinOddsKey_QNAME, UnderMinOddsKey.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPossibleEarlyPayoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "CheckPossibleEarlyPayoutResponse")
    public JAXBElement<CheckPossibleEarlyPayoutResponse> createCheckPossibleEarlyPayoutResponse(CheckPossibleEarlyPayoutResponse value) {
        return new JAXBElement<CheckPossibleEarlyPayoutResponse>(_CheckPossibleEarlyPayoutResponse_QNAME, CheckPossibleEarlyPayoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EarlyPayoutError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "EarlyPayoutError")
    public JAXBElement<EarlyPayoutError> createEarlyPayoutError(EarlyPayoutError value) {
        return new JAXBElement<EarlyPayoutError>(_EarlyPayoutError_QNAME, EarlyPayoutError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestIdNotFoundFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "RequestIdNotFoundFault")
    public JAXBElement<RequestIdNotFoundFault> createRequestIdNotFoundFault(RequestIdNotFoundFault value) {
        return new JAXBElement<RequestIdNotFoundFault>(_RequestIdNotFoundFault_QNAME, RequestIdNotFoundFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UndoEarlyPayoutFailed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "UndoEarlyPayoutFailed")
    public JAXBElement<UndoEarlyPayoutFailed> createUndoEarlyPayoutFailed(UndoEarlyPayoutFailed value) {
        return new JAXBElement<UndoEarlyPayoutFailed>(_UndoEarlyPayoutFailed_QNAME, UndoEarlyPayoutFailed.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UndoEarlyPayoutSucceeded }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "UndoEarlyPayoutSucceeded")
    public JAXBElement<UndoEarlyPayoutSucceeded> createUndoEarlyPayoutSucceeded(UndoEarlyPayoutSucceeded value) {
        return new JAXBElement<UndoEarlyPayoutSucceeded>(_UndoEarlyPayoutSucceeded_QNAME, UndoEarlyPayoutSucceeded.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAutoCashoutRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "GetAutoCashoutRequest")
    public JAXBElement<GetAutoCashoutRequest> createGetAutoCashoutRequest(GetAutoCashoutRequest value) {
        return new JAXBElement<GetAutoCashoutRequest>(_GetAutoCashoutRequest_QNAME, GetAutoCashoutRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UndoEarlyPayoutRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "UndoEarlyPayoutRequest")
    public JAXBElement<UndoEarlyPayoutRequest> createUndoEarlyPayoutRequest(UndoEarlyPayoutRequest value) {
        return new JAXBElement<UndoEarlyPayoutRequest>(_UndoEarlyPayoutRequest_QNAME, UndoEarlyPayoutRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayoutAcceptanceMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "PayoutAcceptanceMode")
    public JAXBElement<PayoutAcceptanceMode> createPayoutAcceptanceMode(PayoutAcceptanceMode value) {
        return new JAXBElement<PayoutAcceptanceMode>(_PayoutAcceptanceMode_QNAME, PayoutAcceptanceMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoCashoutBet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "AutoCashoutBet")
    public JAXBElement<AutoCashoutBet> createAutoCashoutBet(AutoCashoutBet value) {
        return new JAXBElement<AutoCashoutBet>(_AutoCashoutBet_QNAME, AutoCashoutBet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BetFromDifferentUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "BetFromDifferentUser")
    public JAXBElement<BetFromDifferentUser> createBetFromDifferentUser(BetFromDifferentUser value) {
        return new JAXBElement<BetFromDifferentUser>(_BetFromDifferentUser_QNAME, BetFromDifferentUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "GetStatusRequest")
    public JAXBElement<GetStatusRequest> createGetStatusRequest(GetStatusRequest value) {
        return new JAXBElement<GetStatusRequest>(_GetStatusRequest_QNAME, GetStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EarlyPayoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "EarlyPayoutResponse")
    public JAXBElement<EarlyPayoutResponse> createEarlyPayoutResponse(EarlyPayoutResponse value) {
        return new JAXBElement<EarlyPayoutResponse>(_EarlyPayoutResponse_QNAME, EarlyPayoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangedBetSlipState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "ChangedBetSlipState")
    public JAXBElement<ChangedBetSlipState> createChangedBetSlipState(ChangedBetSlipState value) {
        return new JAXBElement<ChangedBetSlipState>(_ChangedBetSlipState_QNAME, ChangedBetSlipState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAutoCashoutBet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "ArrayOfAutoCashoutBet")
    public JAXBElement<ArrayOfAutoCashoutBet> createArrayOfAutoCashoutBet(ArrayOfAutoCashoutBet value) {
        return new JAXBElement<ArrayOfAutoCashoutBet>(_ArrayOfAutoCashoutBet_QNAME, ArrayOfAutoCashoutBet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DuplicatedAutoCashout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "DuplicatedAutoCashout")
    public JAXBElement<DuplicatedAutoCashout> createDuplicatedAutoCashout(DuplicatedAutoCashout value) {
        return new JAXBElement<DuplicatedAutoCashout>(_DuplicatedAutoCashout_QNAME, DuplicatedAutoCashout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BetEarlyPayoutNotAllowedReason }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "BetEarlyPayoutNotAllowedReason")
    public JAXBElement<BetEarlyPayoutNotAllowedReason> createBetEarlyPayoutNotAllowedReason(BetEarlyPayoutNotAllowedReason value) {
        return new JAXBElement<BetEarlyPayoutNotAllowedReason>(_BetEarlyPayoutNotAllowedReason_QNAME, BetEarlyPayoutNotAllowedReason.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "Bet")
    public JAXBElement<Bet> createBet(Bet value) {
        return new JAXBElement<Bet>(_Bet_QNAME, Bet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EarlyPayoutPossibility }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "EarlyPayoutPossibility")
    public JAXBElement<EarlyPayoutPossibility> createEarlyPayoutPossibility(EarlyPayoutPossibility value) {
        return new JAXBElement<EarlyPayoutPossibility>(_EarlyPayoutPossibility_QNAME, EarlyPayoutPossibility.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EarlyPayoutSucceeded }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "EarlyPayoutSucceeded")
    public JAXBElement<EarlyPayoutSucceeded> createEarlyPayoutSucceeded(EarlyPayoutSucceeded value) {
        return new JAXBElement<EarlyPayoutSucceeded>(_EarlyPayoutSucceeded_QNAME, EarlyPayoutSucceeded.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestIdBlockedFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "RequestIdBlockedFault")
    public JAXBElement<RequestIdBlockedFault> createRequestIdBlockedFault(RequestIdBlockedFault value) {
        return new JAXBElement<RequestIdBlockedFault>(_RequestIdBlockedFault_QNAME, RequestIdBlockedFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditBetData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "EditBetData")
    public JAXBElement<EditBetData> createEditBetData(EditBetData value) {
        return new JAXBElement<EditBetData>(_EditBetData_QNAME, EditBetData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EarlyPayoutNotFound }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "EarlyPayoutNotFound")
    public JAXBElement<EarlyPayoutNotFound> createEarlyPayoutNotFound(EarlyPayoutNotFound value) {
        return new JAXBElement<EarlyPayoutNotFound>(_EarlyPayoutNotFound_QNAME, EarlyPayoutNotFound.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoCashoutNotificationNotAllowed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "AutoCashoutNotificationNotAllowed")
    public JAXBElement<AutoCashoutNotificationNotAllowed> createAutoCashoutNotificationNotAllowed(AutoCashoutNotificationNotAllowed value) {
        return new JAXBElement<AutoCashoutNotificationNotAllowed>(_AutoCashoutNotificationNotAllowed_QNAME, AutoCashoutNotificationNotAllowed.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EarlyPayoutFailed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "EarlyPayoutFailed")
    public JAXBElement<EarlyPayoutFailed> createEarlyPayoutFailed(EarlyPayoutFailed value) {
        return new JAXBElement<EarlyPayoutFailed>(_EarlyPayoutFailed_QNAME, EarlyPayoutFailed.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEarlyPayoutBet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "ArrayOfEarlyPayoutBet")
    public JAXBElement<ArrayOfEarlyPayoutBet> createArrayOfEarlyPayoutBet(ArrayOfEarlyPayoutBet value) {
        return new JAXBElement<ArrayOfEarlyPayoutBet>(_ArrayOfEarlyPayoutBet_QNAME, ArrayOfEarlyPayoutBet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAutoCashoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "GetAutoCashoutResponse")
    public JAXBElement<GetAutoCashoutResponse> createGetAutoCashoutResponse(GetAutoCashoutResponse value) {
        return new JAXBElement<GetAutoCashoutResponse>(_GetAutoCashoutResponse_QNAME, GetAutoCashoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BetNotFound }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "BetNotFound")
    public JAXBElement<BetNotFound> createBetNotFound(BetNotFound value) {
        return new JAXBElement<BetNotFound>(_BetNotFound_QNAME, BetNotFound.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangedResultStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "ChangedResultStatus")
    public JAXBElement<ChangedResultStatus> createChangedResultStatus(ChangedResultStatus value) {
        return new JAXBElement<ChangedResultStatus>(_ChangedResultStatus_QNAME, ChangedResultStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InconsistentMonetaryValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "InconsistentMonetaryValue")
    public JAXBElement<InconsistentMonetaryValue> createInconsistentMonetaryValue(InconsistentMonetaryValue value) {
        return new JAXBElement<InconsistentMonetaryValue>(_InconsistentMonetaryValue_QNAME, InconsistentMonetaryValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetAutoCashoutRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "SetAutoCashoutRequest")
    public JAXBElement<SetAutoCashoutRequest> createSetAutoCashoutRequest(SetAutoCashoutRequest value) {
        return new JAXBElement<SetAutoCashoutRequest>(_SetAutoCashoutRequest_QNAME, SetAutoCashoutRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "Reason", scope = TechnicalError.class)
    public JAXBElement<String> createTechnicalErrorReason(String value) {
        return new JAXBElement<String>(_TechnicalErrorReason_QNAME, String.class, TechnicalError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "BetNumber", scope = AutoCashoutResponse.class)
    public JAXBElement<String> createAutoCashoutResponseBetNumber(String value) {
        return new JAXBElement<String>(_AutoCashoutResponseBetNumber_QNAME, String.class, AutoCashoutResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "Reason", scope = TechnicalFault.class)
    public JAXBElement<String> createTechnicalFaultReason(String value) {
        return new JAXBElement<String>(_TechnicalErrorReason_QNAME, String.class, TechnicalFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEarlyPayoutBet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "EarlyPayouts", scope = CheckPossibleEarlyPayoutRequest.class)
    public JAXBElement<ArrayOfEarlyPayoutBet> createCheckPossibleEarlyPayoutRequestEarlyPayouts(ArrayOfEarlyPayoutBet value) {
        return new JAXBElement<ArrayOfEarlyPayoutBet>(_CheckPossibleEarlyPayoutRequestEarlyPayouts_QNAME, ArrayOfEarlyPayoutBet.class, CheckPossibleEarlyPayoutRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "SubChannel", scope = CheckPossibleEarlyPayoutRequest.class)
    public JAXBElement<String> createCheckPossibleEarlyPayoutRequestSubChannel(String value) {
        return new JAXBElement<String>(_CheckPossibleEarlyPayoutRequestSubChannel_QNAME, String.class, CheckPossibleEarlyPayoutRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "EarlyPayoutStatuses", scope = GetStatusResponse.class)
    public JAXBElement<ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A> createGetStatusResponseEarlyPayoutStatuses(ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A value) {
        return new JAXBElement<ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A>(_GetStatusResponseEarlyPayoutStatuses_QNAME, ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A.class, GetStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditBetData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "EditBetData", scope = Bet.class)
    public JAXBElement<EditBetData> createBetEditBetData(EditBetData value) {
        return new JAXBElement<EditBetData>(_EditBetData_QNAME, EditBetData.class, Bet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "GlobalSessionId", scope = EarlyPayoutRequest.class)
    public JAXBElement<String> createEarlyPayoutRequestGlobalSessionId(String value) {
        return new JAXBElement<String>(_EarlyPayoutRequestGlobalSessionId_QNAME, String.class, EarlyPayoutRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "AccessId", scope = EarlyPayoutRequest.class)
    public JAXBElement<Integer> createEarlyPayoutRequestAccessId(Integer value) {
        return new JAXBElement<Integer>(_EarlyPayoutRequestAccessId_QNAME, Integer.class, EarlyPayoutRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEarlyPayoutError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "Errors", scope = EarlyPayoutFailed.class)
    public JAXBElement<ArrayOfEarlyPayoutError> createEarlyPayoutFailedErrors(ArrayOfEarlyPayoutError value) {
        return new JAXBElement<ArrayOfEarlyPayoutError>(_EarlyPayoutFailedErrors_QNAME, ArrayOfEarlyPayoutError.class, EarlyPayoutFailed.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEarlyPayoutError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "Errors", scope = AutoCashoutFailed.class)
    public JAXBElement<ArrayOfEarlyPayoutError> createAutoCashoutFailedErrors(ArrayOfEarlyPayoutError value) {
        return new JAXBElement<ArrayOfEarlyPayoutError>(_EarlyPayoutFailedErrors_QNAME, ArrayOfEarlyPayoutError.class, AutoCashoutFailed.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "BetNumber", scope = EarlyPayoutPossibility.class)
    public JAXBElement<String> createEarlyPayoutPossibilityBetNumber(String value) {
        return new JAXBElement<String>(_AutoCashoutResponseBetNumber_QNAME, String.class, EarlyPayoutPossibility.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEarlyPayoutError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "Errors", scope = EarlyPayoutPossibility.class)
    public JAXBElement<ArrayOfEarlyPayoutError> createEarlyPayoutPossibilityErrors(ArrayOfEarlyPayoutError value) {
        return new JAXBElement<ArrayOfEarlyPayoutError>(_EarlyPayoutFailedErrors_QNAME, ArrayOfEarlyPayoutError.class, EarlyPayoutPossibility.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEarlyPayoutPossibility }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "EarlyPayouts", scope = CheckPossibleEarlyPayoutResponse.class)
    public JAXBElement<ArrayOfEarlyPayoutPossibility> createCheckPossibleEarlyPayoutResponseEarlyPayouts(ArrayOfEarlyPayoutPossibility value) {
        return new JAXBElement<ArrayOfEarlyPayoutPossibility>(_CheckPossibleEarlyPayoutRequestEarlyPayouts_QNAME, ArrayOfEarlyPayoutPossibility.class, CheckPossibleEarlyPayoutResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditBetData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "EditBetData", scope = EarlyPayoutBet.class)
    public JAXBElement<EditBetData> createEarlyPayoutBetEditBetData(EditBetData value) {
        return new JAXBElement<EditBetData>(_EditBetData_QNAME, EditBetData.class, EarlyPayoutBet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EarlyPayoutError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "Error", scope = UndoEarlyPayoutFailed.class)
    public JAXBElement<EarlyPayoutError> createUndoEarlyPayoutFailedError(EarlyPayoutError value) {
        return new JAXBElement<EarlyPayoutError>(_UndoEarlyPayoutFailedError_QNAME, EarlyPayoutError.class, UndoEarlyPayoutFailed.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "EarlyPayoutStatuses", scope = EarlyPayoutResponse.class)
    public JAXBElement<ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A> createEarlyPayoutResponseEarlyPayoutStatuses(ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A value) {
        return new JAXBElement<ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A>(_GetStatusResponseEarlyPayoutStatuses_QNAME, ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A.class, EarlyPayoutResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0", name = "BetNumbers", scope = GetAutoCashoutRequest.class)
    public JAXBElement<ArrayOfstring> createGetAutoCashoutRequestBetNumbers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetAutoCashoutRequestBetNumbers_QNAME, ArrayOfstring.class, GetAutoCashoutRequest.class, value);
    }

}
