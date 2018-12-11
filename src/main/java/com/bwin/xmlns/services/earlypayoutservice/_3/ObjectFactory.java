
package com.bwin.xmlns.services.earlypayoutservice._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.bwin.xmlns.types.earlypayoutservice._3.AutoCashoutResponse;
import com.bwin.xmlns.types.earlypayoutservice._3.CheckPossibleEarlyPayoutRequest;
import com.bwin.xmlns.types.earlypayoutservice._3.EarlyPayoutRequest;
import com.bwin.xmlns.types.earlypayoutservice._3.GetAutoCashoutRequest;
import com.bwin.xmlns.types.earlypayoutservice._3.GetEarlyPayoutConstraintsRequest;
import com.bwin.xmlns.types.earlypayoutservice._3.GetStatusRequest;
import com.bwin.xmlns.types.earlypayoutservice._3.RemoveAutoCashoutRequest;
import com.bwin.xmlns.types.earlypayoutservice._3.SetAutoCashoutRequest;
import com.bwin.xmlns.types.earlypayoutservice._3.UndoEarlyPayoutRequest;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bwin.xmlns.services.earlypayoutservice._3 package. 
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

    private final static QName _CheckPossibleEarlyPayoutAndSubscribeResponseCheckPossibleEarlyPayoutAndSubscribeResult_QNAME = new QName("http://xmlns.bwin.com/services/EarlyPayoutService/3.0", "CheckPossibleEarlyPayoutAndSubscribeResult");
    private final static QName _SetAutoCashoutRequest_QNAME = new QName("http://xmlns.bwin.com/services/EarlyPayoutService/3.0", "request");
    private final static QName _GetEarlyPayoutConstraintsResponseGetEarlyPayoutConstraintsResult_QNAME = new QName("http://xmlns.bwin.com/services/EarlyPayoutService/3.0", "GetEarlyPayoutConstraintsResult");
    private final static QName _CheckPossibleEarlyPayoutResponseCheckPossibleEarlyPayoutResult_QNAME = new QName("http://xmlns.bwin.com/services/EarlyPayoutService/3.0", "CheckPossibleEarlyPayoutResult");
    private final static QName _UndoEarlyPayoutResponseUndoEarlyPayoutResult_QNAME = new QName("http://xmlns.bwin.com/services/EarlyPayoutService/3.0", "UndoEarlyPayoutResult");
    private final static QName _EarlyPayoutResponseEarlyPayoutResult_QNAME = new QName("http://xmlns.bwin.com/services/EarlyPayoutService/3.0", "EarlyPayoutResult");
    private final static QName _SetAutoCashoutResponseSetAutoCashoutResult_QNAME = new QName("http://xmlns.bwin.com/services/EarlyPayoutService/3.0", "SetAutoCashoutResult");
    private final static QName _GetStatusResponseGetStatusResult_QNAME = new QName("http://xmlns.bwin.com/services/EarlyPayoutService/3.0", "GetStatusResult");
    private final static QName _GetAutoCashoutResponseGetAutoCashoutResult_QNAME = new QName("http://xmlns.bwin.com/services/EarlyPayoutService/3.0", "GetAutoCashoutResult");
    private final static QName _RemoveAutoCashoutResponseRemoveAutoCashoutResult_QNAME = new QName("http://xmlns.bwin.com/services/EarlyPayoutService/3.0", "RemoveAutoCashoutResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bwin.xmlns.services.earlypayoutservice._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEarlyPayoutConstraints }
     * 
     */
    public GetEarlyPayoutConstraints createGetEarlyPayoutConstraints() {
        return new GetEarlyPayoutConstraints();
    }

    /**
     * Create an instance of {@link com.bwin.xmlns.services.earlypayoutservice._3.GetAutoCashoutResponse }
     * 
     */
    public com.bwin.xmlns.services.earlypayoutservice._3.GetAutoCashoutResponse createGetAutoCashoutResponse() {
        return new com.bwin.xmlns.services.earlypayoutservice._3.GetAutoCashoutResponse();
    }

    /**
     * Create an instance of {@link com.bwin.xmlns.services.earlypayoutservice._3.GetStatusResponse }
     * 
     */
    public com.bwin.xmlns.services.earlypayoutservice._3.GetStatusResponse createGetStatusResponse() {
        return new com.bwin.xmlns.services.earlypayoutservice._3.GetStatusResponse();
    }

    /**
     * Create an instance of {@link SetAutoCashout }
     * 
     */
    public SetAutoCashout createSetAutoCashout() {
        return new SetAutoCashout();
    }

    /**
     * Create an instance of {@link com.bwin.xmlns.services.earlypayoutservice._3.GetEarlyPayoutConstraintsResponse }
     * 
     */
    public com.bwin.xmlns.services.earlypayoutservice._3.GetEarlyPayoutConstraintsResponse createGetEarlyPayoutConstraintsResponse() {
        return new com.bwin.xmlns.services.earlypayoutservice._3.GetEarlyPayoutConstraintsResponse();
    }

    /**
     * Create an instance of {@link CheckPossibleEarlyPayoutAndSubscribeResponse }
     * 
     */
    public CheckPossibleEarlyPayoutAndSubscribeResponse createCheckPossibleEarlyPayoutAndSubscribeResponse() {
        return new CheckPossibleEarlyPayoutAndSubscribeResponse();
    }

    /**
     * Create an instance of {@link com.bwin.xmlns.services.earlypayoutservice._3.UndoEarlyPayoutResponse }
     * 
     */
    public com.bwin.xmlns.services.earlypayoutservice._3.UndoEarlyPayoutResponse createUndoEarlyPayoutResponse() {
        return new com.bwin.xmlns.services.earlypayoutservice._3.UndoEarlyPayoutResponse();
    }

    /**
     * Create an instance of {@link SetAutoCashoutResponse }
     * 
     */
    public SetAutoCashoutResponse createSetAutoCashoutResponse() {
        return new SetAutoCashoutResponse();
    }

    /**
     * Create an instance of {@link GetAutoCashout }
     * 
     */
    public GetAutoCashout createGetAutoCashout() {
        return new GetAutoCashout();
    }

    /**
     * Create an instance of {@link RemoveAutoCashout }
     * 
     */
    public RemoveAutoCashout createRemoveAutoCashout() {
        return new RemoveAutoCashout();
    }

    /**
     * Create an instance of {@link UndoEarlyPayout }
     * 
     */
    public UndoEarlyPayout createUndoEarlyPayout() {
        return new UndoEarlyPayout();
    }

    /**
     * Create an instance of {@link RemoveAutoCashoutResponse }
     * 
     */
    public RemoveAutoCashoutResponse createRemoveAutoCashoutResponse() {
        return new RemoveAutoCashoutResponse();
    }

    /**
     * Create an instance of {@link com.bwin.xmlns.services.earlypayoutservice._3.CheckPossibleEarlyPayoutResponse }
     * 
     */
    public com.bwin.xmlns.services.earlypayoutservice._3.CheckPossibleEarlyPayoutResponse createCheckPossibleEarlyPayoutResponse() {
        return new com.bwin.xmlns.services.earlypayoutservice._3.CheckPossibleEarlyPayoutResponse();
    }

    /**
     * Create an instance of {@link com.bwin.xmlns.services.earlypayoutservice._3.EarlyPayoutResponse }
     * 
     */
    public com.bwin.xmlns.services.earlypayoutservice._3.EarlyPayoutResponse createEarlyPayoutResponse() {
        return new com.bwin.xmlns.services.earlypayoutservice._3.EarlyPayoutResponse();
    }

    /**
     * Create an instance of {@link CheckPossibleEarlyPayout }
     * 
     */
    public CheckPossibleEarlyPayout createCheckPossibleEarlyPayout() {
        return new CheckPossibleEarlyPayout();
    }

    /**
     * Create an instance of {@link EarlyPayout }
     * 
     */
    public EarlyPayout createEarlyPayout() {
        return new EarlyPayout();
    }

    /**
     * Create an instance of {@link CheckPossibleEarlyPayoutAndSubscribe }
     * 
     */
    public CheckPossibleEarlyPayoutAndSubscribe createCheckPossibleEarlyPayoutAndSubscribe() {
        return new CheckPossibleEarlyPayoutAndSubscribe();
    }

    /**
     * Create an instance of {@link GetStatus }
     * 
     */
    public GetStatus createGetStatus() {
        return new GetStatus();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.bwin.xmlns.types.earlypayoutservice._3.CheckPossibleEarlyPayoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/EarlyPayoutService/3.0", name = "CheckPossibleEarlyPayoutAndSubscribeResult", scope = CheckPossibleEarlyPayoutAndSubscribeResponse.class)
    public JAXBElement<com.bwin.xmlns.types.earlypayoutservice._3.CheckPossibleEarlyPayoutResponse> createCheckPossibleEarlyPayoutAndSubscribeResponseCheckPossibleEarlyPayoutAndSubscribeResult(com.bwin.xmlns.types.earlypayoutservice._3.CheckPossibleEarlyPayoutResponse value) {
        return new JAXBElement<com.bwin.xmlns.types.earlypayoutservice._3.CheckPossibleEarlyPayoutResponse>(_CheckPossibleEarlyPayoutAndSubscribeResponseCheckPossibleEarlyPayoutAndSubscribeResult_QNAME, com.bwin.xmlns.types.earlypayoutservice._3.CheckPossibleEarlyPayoutResponse.class, CheckPossibleEarlyPayoutAndSubscribeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetAutoCashoutRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/EarlyPayoutService/3.0", name = "request", scope = SetAutoCashout.class)
    public JAXBElement<SetAutoCashoutRequest> createSetAutoCashoutRequest(SetAutoCashoutRequest value) {
        return new JAXBElement<SetAutoCashoutRequest>(_SetAutoCashoutRequest_QNAME, SetAutoCashoutRequest.class, SetAutoCashout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.bwin.xmlns.types.earlypayoutservice._3.GetEarlyPayoutConstraintsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/EarlyPayoutService/3.0", name = "GetEarlyPayoutConstraintsResult", scope = com.bwin.xmlns.services.earlypayoutservice._3.GetEarlyPayoutConstraintsResponse.class)
    public JAXBElement<com.bwin.xmlns.types.earlypayoutservice._3.GetEarlyPayoutConstraintsResponse> createGetEarlyPayoutConstraintsResponseGetEarlyPayoutConstraintsResult(com.bwin.xmlns.types.earlypayoutservice._3.GetEarlyPayoutConstraintsResponse value) {
        return new JAXBElement<com.bwin.xmlns.types.earlypayoutservice._3.GetEarlyPayoutConstraintsResponse>(_GetEarlyPayoutConstraintsResponseGetEarlyPayoutConstraintsResult_QNAME, com.bwin.xmlns.types.earlypayoutservice._3.GetEarlyPayoutConstraintsResponse.class, com.bwin.xmlns.services.earlypayoutservice._3.GetEarlyPayoutConstraintsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EarlyPayoutRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/EarlyPayoutService/3.0", name = "request", scope = EarlyPayout.class)
    public JAXBElement<EarlyPayoutRequest> createEarlyPayoutRequest(EarlyPayoutRequest value) {
        return new JAXBElement<EarlyPayoutRequest>(_SetAutoCashoutRequest_QNAME, EarlyPayoutRequest.class, EarlyPayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.bwin.xmlns.types.earlypayoutservice._3.CheckPossibleEarlyPayoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/EarlyPayoutService/3.0", name = "CheckPossibleEarlyPayoutResult", scope = com.bwin.xmlns.services.earlypayoutservice._3.CheckPossibleEarlyPayoutResponse.class)
    public JAXBElement<com.bwin.xmlns.types.earlypayoutservice._3.CheckPossibleEarlyPayoutResponse> createCheckPossibleEarlyPayoutResponseCheckPossibleEarlyPayoutResult(com.bwin.xmlns.types.earlypayoutservice._3.CheckPossibleEarlyPayoutResponse value) {
        return new JAXBElement<com.bwin.xmlns.types.earlypayoutservice._3.CheckPossibleEarlyPayoutResponse>(_CheckPossibleEarlyPayoutResponseCheckPossibleEarlyPayoutResult_QNAME, com.bwin.xmlns.types.earlypayoutservice._3.CheckPossibleEarlyPayoutResponse.class, com.bwin.xmlns.services.earlypayoutservice._3.CheckPossibleEarlyPayoutResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAutoCashoutRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/EarlyPayoutService/3.0", name = "request", scope = RemoveAutoCashout.class)
    public JAXBElement<RemoveAutoCashoutRequest> createRemoveAutoCashoutRequest(RemoveAutoCashoutRequest value) {
        return new JAXBElement<RemoveAutoCashoutRequest>(_SetAutoCashoutRequest_QNAME, RemoveAutoCashoutRequest.class, RemoveAutoCashout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.bwin.xmlns.types.earlypayoutservice._3.UndoEarlyPayoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/EarlyPayoutService/3.0", name = "UndoEarlyPayoutResult", scope = com.bwin.xmlns.services.earlypayoutservice._3.UndoEarlyPayoutResponse.class)
    public JAXBElement<com.bwin.xmlns.types.earlypayoutservice._3.UndoEarlyPayoutResponse> createUndoEarlyPayoutResponseUndoEarlyPayoutResult(com.bwin.xmlns.types.earlypayoutservice._3.UndoEarlyPayoutResponse value) {
        return new JAXBElement<com.bwin.xmlns.types.earlypayoutservice._3.UndoEarlyPayoutResponse>(_UndoEarlyPayoutResponseUndoEarlyPayoutResult_QNAME, com.bwin.xmlns.types.earlypayoutservice._3.UndoEarlyPayoutResponse.class, com.bwin.xmlns.services.earlypayoutservice._3.UndoEarlyPayoutResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.bwin.xmlns.types.earlypayoutservice._3.EarlyPayoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/EarlyPayoutService/3.0", name = "EarlyPayoutResult", scope = com.bwin.xmlns.services.earlypayoutservice._3.EarlyPayoutResponse.class)
    public JAXBElement<com.bwin.xmlns.types.earlypayoutservice._3.EarlyPayoutResponse> createEarlyPayoutResponseEarlyPayoutResult(com.bwin.xmlns.types.earlypayoutservice._3.EarlyPayoutResponse value) {
        return new JAXBElement<com.bwin.xmlns.types.earlypayoutservice._3.EarlyPayoutResponse>(_EarlyPayoutResponseEarlyPayoutResult_QNAME, com.bwin.xmlns.types.earlypayoutservice._3.EarlyPayoutResponse.class, com.bwin.xmlns.services.earlypayoutservice._3.EarlyPayoutResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPossibleEarlyPayoutRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/EarlyPayoutService/3.0", name = "request", scope = CheckPossibleEarlyPayoutAndSubscribe.class)
    public JAXBElement<CheckPossibleEarlyPayoutRequest> createCheckPossibleEarlyPayoutAndSubscribeRequest(CheckPossibleEarlyPayoutRequest value) {
        return new JAXBElement<CheckPossibleEarlyPayoutRequest>(_SetAutoCashoutRequest_QNAME, CheckPossibleEarlyPayoutRequest.class, CheckPossibleEarlyPayoutAndSubscribe.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoCashoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/EarlyPayoutService/3.0", name = "SetAutoCashoutResult", scope = SetAutoCashoutResponse.class)
    public JAXBElement<AutoCashoutResponse> createSetAutoCashoutResponseSetAutoCashoutResult(AutoCashoutResponse value) {
        return new JAXBElement<AutoCashoutResponse>(_SetAutoCashoutResponseSetAutoCashoutResult_QNAME, AutoCashoutResponse.class, SetAutoCashoutResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UndoEarlyPayoutRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/EarlyPayoutService/3.0", name = "request", scope = UndoEarlyPayout.class)
    public JAXBElement<UndoEarlyPayoutRequest> createUndoEarlyPayoutRequest(UndoEarlyPayoutRequest value) {
        return new JAXBElement<UndoEarlyPayoutRequest>(_SetAutoCashoutRequest_QNAME, UndoEarlyPayoutRequest.class, UndoEarlyPayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/EarlyPayoutService/3.0", name = "request", scope = GetStatus.class)
    public JAXBElement<GetStatusRequest> createGetStatusRequest(GetStatusRequest value) {
        return new JAXBElement<GetStatusRequest>(_SetAutoCashoutRequest_QNAME, GetStatusRequest.class, GetStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.bwin.xmlns.types.earlypayoutservice._3.GetStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/EarlyPayoutService/3.0", name = "GetStatusResult", scope = com.bwin.xmlns.services.earlypayoutservice._3.GetStatusResponse.class)
    public JAXBElement<com.bwin.xmlns.types.earlypayoutservice._3.GetStatusResponse> createGetStatusResponseGetStatusResult(com.bwin.xmlns.types.earlypayoutservice._3.GetStatusResponse value) {
        return new JAXBElement<com.bwin.xmlns.types.earlypayoutservice._3.GetStatusResponse>(_GetStatusResponseGetStatusResult_QNAME, com.bwin.xmlns.types.earlypayoutservice._3.GetStatusResponse.class, com.bwin.xmlns.services.earlypayoutservice._3.GetStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAutoCashoutRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/EarlyPayoutService/3.0", name = "request", scope = GetAutoCashout.class)
    public JAXBElement<GetAutoCashoutRequest> createGetAutoCashoutRequest(GetAutoCashoutRequest value) {
        return new JAXBElement<GetAutoCashoutRequest>(_SetAutoCashoutRequest_QNAME, GetAutoCashoutRequest.class, GetAutoCashout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.bwin.xmlns.types.earlypayoutservice._3.GetAutoCashoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/EarlyPayoutService/3.0", name = "GetAutoCashoutResult", scope = com.bwin.xmlns.services.earlypayoutservice._3.GetAutoCashoutResponse.class)
    public JAXBElement<com.bwin.xmlns.types.earlypayoutservice._3.GetAutoCashoutResponse> createGetAutoCashoutResponseGetAutoCashoutResult(com.bwin.xmlns.types.earlypayoutservice._3.GetAutoCashoutResponse value) {
        return new JAXBElement<com.bwin.xmlns.types.earlypayoutservice._3.GetAutoCashoutResponse>(_GetAutoCashoutResponseGetAutoCashoutResult_QNAME, com.bwin.xmlns.types.earlypayoutservice._3.GetAutoCashoutResponse.class, com.bwin.xmlns.services.earlypayoutservice._3.GetAutoCashoutResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoCashoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/EarlyPayoutService/3.0", name = "RemoveAutoCashoutResult", scope = RemoveAutoCashoutResponse.class)
    public JAXBElement<AutoCashoutResponse> createRemoveAutoCashoutResponseRemoveAutoCashoutResult(AutoCashoutResponse value) {
        return new JAXBElement<AutoCashoutResponse>(_RemoveAutoCashoutResponseRemoveAutoCashoutResult_QNAME, AutoCashoutResponse.class, RemoveAutoCashoutResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPossibleEarlyPayoutRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/EarlyPayoutService/3.0", name = "request", scope = CheckPossibleEarlyPayout.class)
    public JAXBElement<CheckPossibleEarlyPayoutRequest> createCheckPossibleEarlyPayoutRequest(CheckPossibleEarlyPayoutRequest value) {
        return new JAXBElement<CheckPossibleEarlyPayoutRequest>(_SetAutoCashoutRequest_QNAME, CheckPossibleEarlyPayoutRequest.class, CheckPossibleEarlyPayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEarlyPayoutConstraintsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/EarlyPayoutService/3.0", name = "request", scope = GetEarlyPayoutConstraints.class)
    public JAXBElement<GetEarlyPayoutConstraintsRequest> createGetEarlyPayoutConstraintsRequest(GetEarlyPayoutConstraintsRequest value) {
        return new JAXBElement<GetEarlyPayoutConstraintsRequest>(_SetAutoCashoutRequest_QNAME, GetEarlyPayoutConstraintsRequest.class, GetEarlyPayoutConstraints.class, value);
    }

}
