
package agence.web.service.client;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the agence.web.service.client package. 
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

    private final static QName _GetChambresDispo_QNAME = new QName("http://services.service.web.hotel/", "getChambresDispo");
    private final static QName _NoRoomFoundException_QNAME = new QName("http://services.service.web.hotel/", "NoRoomFoundException");
    private final static QName _LoginIdentificationBadException_QNAME = new QName("http://services.service.web.hotel/", "LoginIdentificationBadException");
    private final static QName _HotelIdResponse_QNAME = new QName("http://services.service.web.hotel/", "hotelIdResponse");
    private final static QName _HotelNom_QNAME = new QName("http://services.service.web.hotel/", "hotelNom");
    private final static QName _Connectiontest_QNAME = new QName("http://services.service.web.hotel/", "Connectiontest");
    private final static QName _HotelNomResponse_QNAME = new QName("http://services.service.web.hotel/", "hotelNomResponse");
    private final static QName _ReturnHotelAdr_QNAME = new QName("http://services.service.web.hotel/", "returnHotelAdr");
    private final static QName _ReturnHotelAdrResponse_QNAME = new QName("http://services.service.web.hotel/", "returnHotelAdrResponse");
    private final static QName _ConnectiontestResponse_QNAME = new QName("http://services.service.web.hotel/", "ConnectiontestResponse");
    private final static QName _GetChambresDispoResponse_QNAME = new QName("http://services.service.web.hotel/", "getChambresDispoResponse");
    private final static QName _HotelId_QNAME = new QName("http://services.service.web.hotel/", "hotelId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: agence.web.service.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NoRoomFoundException }
     * 
     */
    public NoRoomFoundException createNoRoomFoundException() {
        return new NoRoomFoundException();
    }

    /**
     * Create an instance of {@link LoginIdentificationBadException }
     * 
     */
    public LoginIdentificationBadException createLoginIdentificationBadException() {
        return new LoginIdentificationBadException();
    }

    /**
     * Create an instance of {@link GetChambresDispo }
     * 
     */
    public GetChambresDispo createGetChambresDispo() {
        return new GetChambresDispo();
    }

    /**
     * Create an instance of {@link HotelNom }
     * 
     */
    public HotelNom createHotelNom() {
        return new HotelNom();
    }

    /**
     * Create an instance of {@link Connectiontest }
     * 
     */
    public Connectiontest createConnectiontest() {
        return new Connectiontest();
    }

    /**
     * Create an instance of {@link HotelNomResponse }
     * 
     */
    public HotelNomResponse createHotelNomResponse() {
        return new HotelNomResponse();
    }

    /**
     * Create an instance of {@link ReturnHotelAdr }
     * 
     */
    public ReturnHotelAdr createReturnHotelAdr() {
        return new ReturnHotelAdr();
    }

    /**
     * Create an instance of {@link ReturnHotelAdrResponse }
     * 
     */
    public ReturnHotelAdrResponse createReturnHotelAdrResponse() {
        return new ReturnHotelAdrResponse();
    }

    /**
     * Create an instance of {@link ConnectiontestResponse }
     * 
     */
    public ConnectiontestResponse createConnectiontestResponse() {
        return new ConnectiontestResponse();
    }

    /**
     * Create an instance of {@link GetChambresDispoResponse }
     * 
     */
    public GetChambresDispoResponse createGetChambresDispoResponse() {
        return new GetChambresDispoResponse();
    }

    /**
     * Create an instance of {@link HotelId }
     * 
     */
    public HotelId createHotelId() {
        return new HotelId();
    }

    /**
     * Create an instance of {@link HotelIdResponse }
     * 
     */
    public HotelIdResponse createHotelIdResponse() {
        return new HotelIdResponse();
    }

    /**
     * Create an instance of {@link Offre }
     * 
     */
    public Offre createOffre() {
        return new Offre();
    }

    /**
     * Create an instance of {@link Adresse }
     * 
     */
    public Adresse createAdresse() {
        return new Adresse();
    }

    /**
     * Create an instance of {@link LocalDate }
     * 
     */
    public LocalDate createLocalDate() {
        return new LocalDate();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChambresDispo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.service.web.hotel/", name = "getChambresDispo")
    public JAXBElement<GetChambresDispo> createGetChambresDispo(GetChambresDispo value) {
        return new JAXBElement<GetChambresDispo>(_GetChambresDispo_QNAME, GetChambresDispo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoRoomFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.service.web.hotel/", name = "NoRoomFoundException")
    public JAXBElement<NoRoomFoundException> createNoRoomFoundException(NoRoomFoundException value) {
        return new JAXBElement<NoRoomFoundException>(_NoRoomFoundException_QNAME, NoRoomFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginIdentificationBadException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.service.web.hotel/", name = "LoginIdentificationBadException")
    public JAXBElement<LoginIdentificationBadException> createLoginIdentificationBadException(LoginIdentificationBadException value) {
        return new JAXBElement<LoginIdentificationBadException>(_LoginIdentificationBadException_QNAME, LoginIdentificationBadException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.service.web.hotel/", name = "hotelIdResponse")
    public JAXBElement<HotelIdResponse> createHotelIdResponse(HotelIdResponse value) {
        return new JAXBElement<HotelIdResponse>(_HotelIdResponse_QNAME, HotelIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelNom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.service.web.hotel/", name = "hotelNom")
    public JAXBElement<HotelNom> createHotelNom(HotelNom value) {
        return new JAXBElement<HotelNom>(_HotelNom_QNAME, HotelNom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Connectiontest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.service.web.hotel/", name = "Connectiontest")
    public JAXBElement<Connectiontest> createConnectiontest(Connectiontest value) {
        return new JAXBElement<Connectiontest>(_Connectiontest_QNAME, Connectiontest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelNomResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.service.web.hotel/", name = "hotelNomResponse")
    public JAXBElement<HotelNomResponse> createHotelNomResponse(HotelNomResponse value) {
        return new JAXBElement<HotelNomResponse>(_HotelNomResponse_QNAME, HotelNomResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnHotelAdr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.service.web.hotel/", name = "returnHotelAdr")
    public JAXBElement<ReturnHotelAdr> createReturnHotelAdr(ReturnHotelAdr value) {
        return new JAXBElement<ReturnHotelAdr>(_ReturnHotelAdr_QNAME, ReturnHotelAdr.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnHotelAdrResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.service.web.hotel/", name = "returnHotelAdrResponse")
    public JAXBElement<ReturnHotelAdrResponse> createReturnHotelAdrResponse(ReturnHotelAdrResponse value) {
        return new JAXBElement<ReturnHotelAdrResponse>(_ReturnHotelAdrResponse_QNAME, ReturnHotelAdrResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectiontestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.service.web.hotel/", name = "ConnectiontestResponse")
    public JAXBElement<ConnectiontestResponse> createConnectiontestResponse(ConnectiontestResponse value) {
        return new JAXBElement<ConnectiontestResponse>(_ConnectiontestResponse_QNAME, ConnectiontestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChambresDispoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.service.web.hotel/", name = "getChambresDispoResponse")
    public JAXBElement<GetChambresDispoResponse> createGetChambresDispoResponse(GetChambresDispoResponse value) {
        return new JAXBElement<GetChambresDispoResponse>(_GetChambresDispoResponse_QNAME, GetChambresDispoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.service.web.hotel/", name = "hotelId")
    public JAXBElement<HotelId> createHotelId(HotelId value) {
        return new JAXBElement<HotelId>(_HotelId_QNAME, HotelId.class, null, value);
    }

}
