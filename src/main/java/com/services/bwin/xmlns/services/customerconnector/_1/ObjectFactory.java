
package com.services.bwin.xmlns.services.customerconnector._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts.ArrayOfCachedProfileData;
import org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts.ArrayOfLookUpByForeignSystemIdRequest;
import org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts.CachedProfileData;
import org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts.ChangeUserCountryRequest;
import org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts.ChangeUserLoyaltyStatusRequest;
import org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts.CreateUserProfileRequest;
import org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts.CustomerData;
import org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts.GetAssociatedAccountsReq;
import org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts.GetAssociatedAccountsResp;
import org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts.GetCustomerDataRequest;
import org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts.GetExternalIdRequest;
import org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts.JurisdictionRequest;
import org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts.JurisdictionStatusData;
import org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts.LookUpByForeignSystemIdRequest;
import org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts.LookUpBySportsBookUserIdRequest;
import org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts.LoyaltyStatusData;
import org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts.SetCurrencyRequest;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.services.bwin.xmlns.services.customerconnector._1 package.
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

    private final static QName _GetCustomerDataResponseGetCustomerDataResult_QNAME = new QName("http://xmlns.bwin.com/services/CustomerConnector/1.2", "GetCustomerDataResult");
    private final static QName _ChangeUserCountryRequest_QNAME = new QName("http://xmlns.bwin.com/services/CustomerConnector/1.2", "request");
    private final static QName _BulkLookUpByForeignSystemIdResponseBulkLookUpByForeignSystemIdResult_QNAME = new QName("http://xmlns.bwin.com/services/CustomerConnector/1.2", "BulkLookUpByForeignSystemIdResult");
    private final static QName _ChangeUserLoyaltyStatusResponseChangeUserLoyaltyStatusResult_QNAME = new QName("http://xmlns.bwin.com/services/CustomerConnector/1.2", "ChangeUserLoyaltyStatusResult");
    private final static QName _LookUpBySportsBookUserIdResponseLookUpBySportsBookUserIdResult_QNAME = new QName("http://xmlns.bwin.com/services/CustomerConnector/1.2", "LookUpBySportsBookUserIdResult");
    private final static QName _ChangeUserCountryResponseChangeUserCountryResult_QNAME = new QName("http://xmlns.bwin.com/services/CustomerConnector/1.2", "ChangeUserCountryResult");
    private final static QName _LookUpByForeignSystemIdResponseLookUpByForeignSystemIdResult_QNAME = new QName("http://xmlns.bwin.com/services/CustomerConnector/1.2", "LookUpByForeignSystemIdResult");
    private final static QName _GetExternalIdResponseGetExternalIdResult_QNAME = new QName("http://xmlns.bwin.com/services/CustomerConnector/1.2", "GetExternalIdResult");
    private final static QName _ChangeUserJurisdictionResponseChangeUserJurisdictionResult_QNAME = new QName("http://xmlns.bwin.com/services/CustomerConnector/1.2", "ChangeUserJurisdictionResult");
    private final static QName _GetAssociatedAccountsResponseGetAssociatedAccountsResult_QNAME = new QName("http://xmlns.bwin.com/services/CustomerConnector/1.2", "GetAssociatedAccountsResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.services.bwin.xmlns.services.customerconnector._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LookUpByForeignSystemId }
     * 
     */
    public LookUpByForeignSystemId createLookUpByForeignSystemId() {
        return new LookUpByForeignSystemId();
    }

    /**
     * Create an instance of {@link CreateSportsUserProfileResponse }
     * 
     */
    public CreateSportsUserProfileResponse createCreateSportsUserProfileResponse() {
        return new CreateSportsUserProfileResponse();
    }

    /**
     * Create an instance of {@link CreateSportsUserProfile }
     * 
     */
    public CreateSportsUserProfile createCreateSportsUserProfile() {
        return new CreateSportsUserProfile();
    }

    /**
     * Create an instance of {@link ChangeUserCountry }
     * 
     */
    public ChangeUserCountry createChangeUserCountry() {
        return new ChangeUserCountry();
    }

    /**
     * Create an instance of {@link ChangeUserLoyaltyStatusResponse }
     * 
     */
    public ChangeUserLoyaltyStatusResponse createChangeUserLoyaltyStatusResponse() {
        return new ChangeUserLoyaltyStatusResponse();
    }

    /**
     * Create an instance of {@link ChangeUserLoyaltyStatus }
     * 
     */
    public ChangeUserLoyaltyStatus createChangeUserLoyaltyStatus() {
        return new ChangeUserLoyaltyStatus();
    }

    /**
     * Create an instance of {@link GetCustomerDataResponse }
     * 
     */
    public GetCustomerDataResponse createGetCustomerDataResponse() {
        return new GetCustomerDataResponse();
    }

    /**
     * Create an instance of {@link LookUpBySportsBookUserIdResponse }
     * 
     */
    public LookUpBySportsBookUserIdResponse createLookUpBySportsBookUserIdResponse() {
        return new LookUpBySportsBookUserIdResponse();
    }

    /**
     * Create an instance of {@link ChangeUserCountryResponse }
     * 
     */
    public ChangeUserCountryResponse createChangeUserCountryResponse() {
        return new ChangeUserCountryResponse();
    }

    /**
     * Create an instance of {@link ChangeUserJurisdiction }
     * 
     */
    public ChangeUserJurisdiction createChangeUserJurisdiction() {
        return new ChangeUserJurisdiction();
    }

    /**
     * Create an instance of {@link com.services.bwin.xmlns.services.customerconnector._1.GetExternalIdResponse }
     * 
     */
    public com.services.bwin.xmlns.services.customerconnector._1.GetExternalIdResponse createGetExternalIdResponse() {
        return new com.services.bwin.xmlns.services.customerconnector._1.GetExternalIdResponse();
    }

    /**
     * Create an instance of {@link GetExternalId }
     * 
     */
    public GetExternalId createGetExternalId() {
        return new GetExternalId();
    }

    /**
     * Create an instance of {@link BulkLookUpByForeignSystemIdResponse }
     * 
     */
    public BulkLookUpByForeignSystemIdResponse createBulkLookUpByForeignSystemIdResponse() {
        return new BulkLookUpByForeignSystemIdResponse();
    }

    /**
     * Create an instance of {@link SetCurrencyResponse }
     * 
     */
    public SetCurrencyResponse createSetCurrencyResponse() {
        return new SetCurrencyResponse();
    }

    /**
     * Create an instance of {@link GetCustomerData }
     * 
     */
    public GetCustomerData createGetCustomerData() {
        return new GetCustomerData();
    }

    /**
     * Create an instance of {@link BulkLookUpByForeignSystemId }
     * 
     */
    public BulkLookUpByForeignSystemId createBulkLookUpByForeignSystemId() {
        return new BulkLookUpByForeignSystemId();
    }

    /**
     * Create an instance of {@link LookUpByForeignSystemIdResponse }
     * 
     */
    public LookUpByForeignSystemIdResponse createLookUpByForeignSystemIdResponse() {
        return new LookUpByForeignSystemIdResponse();
    }

    /**
     * Create an instance of {@link GetAssociatedAccountsResponse }
     * 
     */
    public GetAssociatedAccountsResponse createGetAssociatedAccountsResponse() {
        return new GetAssociatedAccountsResponse();
    }

    /**
     * Create an instance of {@link SetCurrency }
     * 
     */
    public SetCurrency createSetCurrency() {
        return new SetCurrency();
    }

    /**
     * Create an instance of {@link ChangeUserJurisdictionResponse }
     * 
     */
    public ChangeUserJurisdictionResponse createChangeUserJurisdictionResponse() {
        return new ChangeUserJurisdictionResponse();
    }

    /**
     * Create an instance of {@link LookUpBySportsBookUserId }
     * 
     */
    public LookUpBySportsBookUserId createLookUpBySportsBookUserId() {
        return new LookUpBySportsBookUserId();
    }

    /**
     * Create an instance of {@link GetAssociatedAccounts }
     * 
     */
    public GetAssociatedAccounts createGetAssociatedAccounts() {
        return new GetAssociatedAccounts();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/CustomerConnector/1.2", name = "GetCustomerDataResult", scope = GetCustomerDataResponse.class)
    public JAXBElement<CustomerData> createGetCustomerDataResponseGetCustomerDataResult(CustomerData value) {
        return new JAXBElement<CustomerData>(_GetCustomerDataResponseGetCustomerDataResult_QNAME, CustomerData.class, GetCustomerDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeUserCountryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/CustomerConnector/1.2", name = "request", scope = ChangeUserCountry.class)
    public JAXBElement<ChangeUserCountryRequest> createChangeUserCountryRequest(ChangeUserCountryRequest value) {
        return new JAXBElement<ChangeUserCountryRequest>(_ChangeUserCountryRequest_QNAME, ChangeUserCountryRequest.class, ChangeUserCountry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LookUpByForeignSystemIdRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/CustomerConnector/1.2", name = "request", scope = LookUpByForeignSystemId.class)
    public JAXBElement<LookUpByForeignSystemIdRequest> createLookUpByForeignSystemIdRequest(LookUpByForeignSystemIdRequest value) {
        return new JAXBElement<LookUpByForeignSystemIdRequest>(_ChangeUserCountryRequest_QNAME, LookUpByForeignSystemIdRequest.class, LookUpByForeignSystemId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeUserLoyaltyStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/CustomerConnector/1.2", name = "request", scope = ChangeUserLoyaltyStatus.class)
    public JAXBElement<ChangeUserLoyaltyStatusRequest> createChangeUserLoyaltyStatusRequest(ChangeUserLoyaltyStatusRequest value) {
        return new JAXBElement<ChangeUserLoyaltyStatusRequest>(_ChangeUserCountryRequest_QNAME, ChangeUserLoyaltyStatusRequest.class, ChangeUserLoyaltyStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCachedProfileData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/CustomerConnector/1.2", name = "BulkLookUpByForeignSystemIdResult", scope = BulkLookUpByForeignSystemIdResponse.class)
    public JAXBElement<ArrayOfCachedProfileData> createBulkLookUpByForeignSystemIdResponseBulkLookUpByForeignSystemIdResult(ArrayOfCachedProfileData value) {
        return new JAXBElement<ArrayOfCachedProfileData>(_BulkLookUpByForeignSystemIdResponseBulkLookUpByForeignSystemIdResult_QNAME, ArrayOfCachedProfileData.class, BulkLookUpByForeignSystemIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoyaltyStatusData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/CustomerConnector/1.2", name = "ChangeUserLoyaltyStatusResult", scope = ChangeUserLoyaltyStatusResponse.class)
    public JAXBElement<LoyaltyStatusData> createChangeUserLoyaltyStatusResponseChangeUserLoyaltyStatusResult(LoyaltyStatusData value) {
        return new JAXBElement<LoyaltyStatusData>(_ChangeUserLoyaltyStatusResponseChangeUserLoyaltyStatusResult_QNAME, LoyaltyStatusData.class, ChangeUserLoyaltyStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerDataRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/CustomerConnector/1.2", name = "request", scope = GetCustomerData.class)
    public JAXBElement<GetCustomerDataRequest> createGetCustomerDataRequest(GetCustomerDataRequest value) {
        return new JAXBElement<GetCustomerDataRequest>(_ChangeUserCountryRequest_QNAME, GetCustomerDataRequest.class, GetCustomerData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CachedProfileData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/CustomerConnector/1.2", name = "LookUpBySportsBookUserIdResult", scope = LookUpBySportsBookUserIdResponse.class)
    public JAXBElement<CachedProfileData> createLookUpBySportsBookUserIdResponseLookUpBySportsBookUserIdResult(CachedProfileData value) {
        return new JAXBElement<CachedProfileData>(_LookUpBySportsBookUserIdResponseLookUpBySportsBookUserIdResult_QNAME, CachedProfileData.class, LookUpBySportsBookUserIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CachedProfileData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/CustomerConnector/1.2", name = "ChangeUserCountryResult", scope = ChangeUserCountryResponse.class)
    public JAXBElement<CachedProfileData> createChangeUserCountryResponseChangeUserCountryResult(CachedProfileData value) {
        return new JAXBElement<CachedProfileData>(_ChangeUserCountryResponseChangeUserCountryResult_QNAME, CachedProfileData.class, ChangeUserCountryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JurisdictionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/CustomerConnector/1.2", name = "request", scope = ChangeUserJurisdiction.class)
    public JAXBElement<JurisdictionRequest> createChangeUserJurisdictionRequest(JurisdictionRequest value) {
        return new JAXBElement<JurisdictionRequest>(_ChangeUserCountryRequest_QNAME, JurisdictionRequest.class, ChangeUserJurisdiction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLookUpByForeignSystemIdRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/CustomerConnector/1.2", name = "request", scope = BulkLookUpByForeignSystemId.class)
    public JAXBElement<ArrayOfLookUpByForeignSystemIdRequest> createBulkLookUpByForeignSystemIdRequest(ArrayOfLookUpByForeignSystemIdRequest value) {
        return new JAXBElement<ArrayOfLookUpByForeignSystemIdRequest>(_ChangeUserCountryRequest_QNAME, ArrayOfLookUpByForeignSystemIdRequest.class, BulkLookUpByForeignSystemId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCurrencyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/CustomerConnector/1.2", name = "request", scope = SetCurrency.class)
    public JAXBElement<SetCurrencyRequest> createSetCurrencyRequest(SetCurrencyRequest value) {
        return new JAXBElement<SetCurrencyRequest>(_ChangeUserCountryRequest_QNAME, SetCurrencyRequest.class, SetCurrency.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CachedProfileData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/CustomerConnector/1.2", name = "LookUpByForeignSystemIdResult", scope = LookUpByForeignSystemIdResponse.class)
    public JAXBElement<CachedProfileData> createLookUpByForeignSystemIdResponseLookUpByForeignSystemIdResult(CachedProfileData value) {
        return new JAXBElement<CachedProfileData>(_LookUpByForeignSystemIdResponseLookUpByForeignSystemIdResult_QNAME, CachedProfileData.class, LookUpByForeignSystemIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssociatedAccountsReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/CustomerConnector/1.2", name = "request", scope = GetAssociatedAccounts.class)
    public JAXBElement<GetAssociatedAccountsReq> createGetAssociatedAccountsRequest(GetAssociatedAccountsReq value) {
        return new JAXBElement<GetAssociatedAccountsReq>(_ChangeUserCountryRequest_QNAME, GetAssociatedAccountsReq.class, GetAssociatedAccounts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserProfileRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/CustomerConnector/1.2", name = "request", scope = CreateSportsUserProfile.class)
    public JAXBElement<CreateUserProfileRequest> createCreateSportsUserProfileRequest(CreateUserProfileRequest value) {
        return new JAXBElement<CreateUserProfileRequest>(_ChangeUserCountryRequest_QNAME, CreateUserProfileRequest.class, CreateSportsUserProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts.GetExternalIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/CustomerConnector/1.2", name = "GetExternalIdResult", scope = com.services.bwin.xmlns.services.customerconnector._1.GetExternalIdResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts.GetExternalIdResponse> createGetExternalIdResponseGetExternalIdResult(org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts.GetExternalIdResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts.GetExternalIdResponse>(_GetExternalIdResponseGetExternalIdResult_QNAME, org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts.GetExternalIdResponse.class, com.services.bwin.xmlns.services.customerconnector._1.GetExternalIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LookUpBySportsBookUserIdRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/CustomerConnector/1.2", name = "request", scope = LookUpBySportsBookUserId.class)
    public JAXBElement<LookUpBySportsBookUserIdRequest> createLookUpBySportsBookUserIdRequest(LookUpBySportsBookUserIdRequest value) {
        return new JAXBElement<LookUpBySportsBookUserIdRequest>(_ChangeUserCountryRequest_QNAME, LookUpBySportsBookUserIdRequest.class, LookUpBySportsBookUserId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JurisdictionStatusData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/CustomerConnector/1.2", name = "ChangeUserJurisdictionResult", scope = ChangeUserJurisdictionResponse.class)
    public JAXBElement<JurisdictionStatusData> createChangeUserJurisdictionResponseChangeUserJurisdictionResult(JurisdictionStatusData value) {
        return new JAXBElement<JurisdictionStatusData>(_ChangeUserJurisdictionResponseChangeUserJurisdictionResult_QNAME, JurisdictionStatusData.class, ChangeUserJurisdictionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssociatedAccountsResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/CustomerConnector/1.2", name = "GetAssociatedAccountsResult", scope = GetAssociatedAccountsResponse.class)
    public JAXBElement<GetAssociatedAccountsResp> createGetAssociatedAccountsResponseGetAssociatedAccountsResult(GetAssociatedAccountsResp value) {
        return new JAXBElement<GetAssociatedAccountsResp>(_GetAssociatedAccountsResponseGetAssociatedAccountsResult_QNAME, GetAssociatedAccountsResp.class, GetAssociatedAccountsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExternalIdRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.bwin.com/services/CustomerConnector/1.2", name = "request", scope = GetExternalId.class)
    public JAXBElement<GetExternalIdRequest> createGetExternalIdRequest(GetExternalIdRequest value) {
        return new JAXBElement<GetExternalIdRequest>(_ChangeUserCountryRequest_QNAME, GetExternalIdRequest.class, GetExternalId.class, value);
    }

}
