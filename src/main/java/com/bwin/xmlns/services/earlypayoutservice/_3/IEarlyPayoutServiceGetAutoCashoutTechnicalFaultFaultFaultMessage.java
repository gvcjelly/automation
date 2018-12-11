
package com.bwin.xmlns.services.earlypayoutservice._3;

import javax.xml.ws.WebFault;
import com.bwin.xmlns.types.earlypayoutservice._3.TechnicalFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "TechnicalFault", targetNamespace = "http://xmlns.bwin.com/types/EarlyPayoutService/3.0")
public class IEarlyPayoutServiceGetAutoCashoutTechnicalFaultFaultFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private TechnicalFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public IEarlyPayoutServiceGetAutoCashoutTechnicalFaultFaultFaultMessage(String message, TechnicalFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public IEarlyPayoutServiceGetAutoCashoutTechnicalFaultFaultFaultMessage(String message, TechnicalFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.bwin.xmlns.types.earlypayoutservice._3.TechnicalFault
     */
    public TechnicalFault getFaultInfo() {
        return faultInfo;
    }

}
