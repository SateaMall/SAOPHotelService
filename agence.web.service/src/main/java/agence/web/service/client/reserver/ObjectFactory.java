
package agence.web.service.client.reserver;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the agence.web.service.client.reserver package. 
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

    private final static QName _RoomAlreadyReservedException_QNAME = new QName("http://reservation.service.web.hotel/", "RoomAlreadyReservedException");
    private final static QName _Reserver_QNAME = new QName("http://reservation.service.web.hotel/", "reserver");
    private final static QName _LoginIdentificationBadException_QNAME = new QName("http://reservation.service.web.hotel/", "LoginIdentificationBadException");
    private final static QName _ReserverResponse_QNAME = new QName("http://reservation.service.web.hotel/", "reserverResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: agence.web.service.client.reserver
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginIdentificationBadException }
     * 
     */
    public LoginIdentificationBadException createLoginIdentificationBadException() {
        return new LoginIdentificationBadException();
    }

    /**
     * Create an instance of {@link ReserverResponse }
     * 
     */
    public ReserverResponse createReserverResponse() {
        return new ReserverResponse();
    }

    /**
     * Create an instance of {@link RoomAlreadyReservedException }
     * 
     */
    public RoomAlreadyReservedException createRoomAlreadyReservedException() {
        return new RoomAlreadyReservedException();
    }

    /**
     * Create an instance of {@link Reserver }
     * 
     */
    public Reserver createReserver() {
        return new Reserver();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomAlreadyReservedException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservation.service.web.hotel/", name = "RoomAlreadyReservedException")
    public JAXBElement<RoomAlreadyReservedException> createRoomAlreadyReservedException(RoomAlreadyReservedException value) {
        return new JAXBElement<RoomAlreadyReservedException>(_RoomAlreadyReservedException_QNAME, RoomAlreadyReservedException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reserver }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservation.service.web.hotel/", name = "reserver")
    public JAXBElement<Reserver> createReserver(Reserver value) {
        return new JAXBElement<Reserver>(_Reserver_QNAME, Reserver.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginIdentificationBadException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservation.service.web.hotel/", name = "LoginIdentificationBadException")
    public JAXBElement<LoginIdentificationBadException> createLoginIdentificationBadException(LoginIdentificationBadException value) {
        return new JAXBElement<LoginIdentificationBadException>(_LoginIdentificationBadException_QNAME, LoginIdentificationBadException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserverResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reservation.service.web.hotel/", name = "reserverResponse")
    public JAXBElement<ReserverResponse> createReserverResponse(ReserverResponse value) {
        return new JAXBElement<ReserverResponse>(_ReserverResponse_QNAME, ReserverResponse.class, null, value);
    }

}
