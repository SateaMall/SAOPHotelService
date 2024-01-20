
package agence.web.service.client;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "LoginIdentificationBadException", targetNamespace = "http://services.service.web.hotel/")
public class LoginIdentificationBadException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private LoginIdentificationBadException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public LoginIdentificationBadException_Exception(String message, LoginIdentificationBadException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public LoginIdentificationBadException_Exception(String message, LoginIdentificationBadException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: agence.web.service.client.LoginIdentificationBadException
     */
    public LoginIdentificationBadException getFaultInfo() {
        return faultInfo;
    }

}
