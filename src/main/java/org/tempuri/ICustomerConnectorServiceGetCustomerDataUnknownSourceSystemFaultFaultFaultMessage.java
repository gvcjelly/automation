
package org.tempuri;

import javax.xml.ws.WebFault;
import org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts.UnknownSourceSystemFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "UnknownSourceSystemFault", targetNamespace = "http://schemas.datacontract.org/2004/07/Bwin.Sportsbook.CustomerConnector.Service.DataContracts.Faults")
public class ICustomerConnectorServiceGetCustomerDataUnknownSourceSystemFaultFaultFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private UnknownSourceSystemFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ICustomerConnectorServiceGetCustomerDataUnknownSourceSystemFaultFaultFaultMessage(String message, UnknownSourceSystemFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ICustomerConnectorServiceGetCustomerDataUnknownSourceSystemFaultFaultFaultMessage(String message, UnknownSourceSystemFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.datacontract.schemas._2004._07.bwin_sportsbook_customerconnector_service_datacontracts.UnknownSourceSystemFault
     */
    public UnknownSourceSystemFault getFaultInfo() {
        return faultInfo;
    }

}
