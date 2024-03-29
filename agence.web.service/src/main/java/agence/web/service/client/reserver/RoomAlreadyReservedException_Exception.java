
package agence.web.service.client.reserver;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "RoomAlreadyReservedException", targetNamespace = "http://reservation.service.web.hotel/")
public class RoomAlreadyReservedException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private RoomAlreadyReservedException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public RoomAlreadyReservedException_Exception(String message, RoomAlreadyReservedException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public RoomAlreadyReservedException_Exception(String message, RoomAlreadyReservedException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: agence.web.service.client.reserver.RoomAlreadyReservedException
     */
    public RoomAlreadyReservedException getFaultInfo() {
        return faultInfo;
    }

}
