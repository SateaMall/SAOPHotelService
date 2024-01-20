package hotel.web.service.services;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import hotel.web.service.exceptions.LoginIdentificationBadException;
import hotel.web.service.exceptions.NoRoomFoundException;
import hotel.web.service.model.Adresse;
import hotel.web.service.model.Hotel;
import hotel.web.service.model.Offre;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface HotelService {
	
	/* METHODES */
	@WebMethod
	ArrayList<Offre> getChambresDispo(int id, String mdp,List<Integer> date_deb, List<Integer> date_fin, int nbrPersonne) throws NoRoomFoundException, LoginIdentificationBadException;
	
	@WebMethod
	String Connectiontest(String message) ;
	
	@WebMethod
	Adresse returnHotelAdr();
	
	@WebMethod
	int hotelId();
	
	@WebMethod
	String hotelNom();
	
	
	
}
