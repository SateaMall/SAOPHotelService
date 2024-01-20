
package agence.web.service.client.reserver;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.FaultAction;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ReservationService", targetNamespace = "http://reservation.service.web.hotel/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ReservationService {


    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     * @param arg6
     * @return
     *     returns int
     * @throws LoginIdentificationBadException_Exception
     * @throws RoomAlreadyReservedException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "reserver", targetNamespace = "http://reservation.service.web.hotel/", className = "agence.web.service.client.reserver.Reserver")
    @ResponseWrapper(localName = "reserverResponse", targetNamespace = "http://reservation.service.web.hotel/", className = "agence.web.service.client.reserver.ReserverResponse")
    @Action(input = "http://reservation.service.web.hotel/ReservationService/reserverRequest", output = "http://reservation.service.web.hotel/ReservationService/reserverResponse", fault = {
        @FaultAction(className = LoginIdentificationBadException_Exception.class, value = "http://reservation.service.web.hotel/ReservationService/reserver/Fault/LoginIdentificationBadException"),
        @FaultAction(className = RoomAlreadyReservedException_Exception.class, value = "http://reservation.service.web.hotel/ReservationService/reserver/Fault/RoomAlreadyReservedException")
    })
    public int reserver(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        String arg5,
        @WebParam(name = "arg6", targetNamespace = "")
        int arg6)
        throws LoginIdentificationBadException_Exception, RoomAlreadyReservedException_Exception
    ;

}