
package agence.web.service.client.reserver;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ReservationServiceImplService", targetNamespace = "http://reservation.service.web.hotel/", wsdlLocation = "http://localhost:8080/seasonsService2?wsdl")
public class ReservationServiceImplService
    extends Service
{

    private final static URL RESERVATIONSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException RESERVATIONSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName RESERVATIONSERVICEIMPLSERVICE_QNAME = new QName("http://reservation.service.web.hotel/", "ReservationServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/seasonsService2?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RESERVATIONSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        RESERVATIONSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public ReservationServiceImplService() {
        super(__getWsdlLocation(), RESERVATIONSERVICEIMPLSERVICE_QNAME);
    }

    public ReservationServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), RESERVATIONSERVICEIMPLSERVICE_QNAME, features);
    }

    public ReservationServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, RESERVATIONSERVICEIMPLSERVICE_QNAME);
    }

    public ReservationServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RESERVATIONSERVICEIMPLSERVICE_QNAME, features);
    }

    public ReservationServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ReservationServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ReservationService
     */
    @WebEndpoint(name = "ReservationServiceImplPort")
    public ReservationService getReservationServiceImplPort() {
        return super.getPort(new QName("http://reservation.service.web.hotel/", "ReservationServiceImplPort"), ReservationService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReservationService
     */
    @WebEndpoint(name = "ReservationServiceImplPort")
    public ReservationService getReservationServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://reservation.service.web.hotel/", "ReservationServiceImplPort"), ReservationService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RESERVATIONSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw RESERVATIONSERVICEIMPLSERVICE_EXCEPTION;
        }
        return RESERVATIONSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
