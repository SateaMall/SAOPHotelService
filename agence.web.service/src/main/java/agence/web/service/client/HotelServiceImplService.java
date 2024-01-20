
package agence.web.service.client;

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
@WebServiceClient(name = "HotelServiceImplService", targetNamespace = "http://services.service.web.hotel/", wsdlLocation = "http://localhost:8080/seasonsService1?wsdl")
public class HotelServiceImplService
    extends Service
{

    private final static URL HOTELSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException HOTELSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName HOTELSERVICEIMPLSERVICE_QNAME = new QName("http://services.service.web.hotel/", "HotelServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/seasonsService1?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HOTELSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        HOTELSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public HotelServiceImplService() {
        super(__getWsdlLocation(), HOTELSERVICEIMPLSERVICE_QNAME);
    }

    public HotelServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HOTELSERVICEIMPLSERVICE_QNAME, features);
    }

    public HotelServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, HOTELSERVICEIMPLSERVICE_QNAME);
    }

    public HotelServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HOTELSERVICEIMPLSERVICE_QNAME, features);
    }

    public HotelServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HotelServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HotelService
     */
    @WebEndpoint(name = "HotelServiceImplPort")
    public HotelService getHotelServiceImplPort() {
        return super.getPort(new QName("http://services.service.web.hotel/", "HotelServiceImplPort"), HotelService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HotelService
     */
    @WebEndpoint(name = "HotelServiceImplPort")
    public HotelService getHotelServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.service.web.hotel/", "HotelServiceImplPort"), HotelService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HOTELSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw HOTELSERVICEIMPLSERVICE_EXCEPTION;
        }
        return HOTELSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
