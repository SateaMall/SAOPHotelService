package hotel.web.service.services;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import hotel.web.service.exceptions.LoginIdentificationBadException;
import hotel.web.service.exceptions.NoRoomFoundException;
import hotel.web.service.model.Adresse;
import hotel.web.service.model.Chambre;
import hotel.web.service.model.Hotel;
import hotel.web.service.model.Offre;
import hotel.web.service.model.Reservation;
import hotel.web.service.repository.HotelRepository;
import hotel.web.service.repository.HotelRepositoryImpl;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(endpointInterface="hotel.web.service.services.HotelService")
public class HotelServiceImpl implements HotelService{
	
		/* ATTRIBUTES */
	private HotelRepository repository;

		/* CONSTRUCTOR */
	public HotelServiceImpl(Hotel hotel) throws IOException {
		repository= new HotelRepositoryImpl(hotel);
	}
	public HotelServiceImpl() {
	}
	
	/* METHODES */
	public ArrayList<Offre> getChambresDispo(int id, String mdp, List<Integer> date_deb, List<Integer> date_fin, int nbrPersonne) throws NoRoomFoundException, LoginIdentificationBadException {
		return repository.getChambresDispo(id, mdp, date_deb, date_fin, nbrPersonne);
	}
	public 	String Connectiontest(String message) {
		return repository.Connectiontest(message);
	    }
	public Adresse returnHotelAdr() {
		return repository.returnHotelAdr();
	}
	public int hotelId() {
		return repository.hotelId();
	}
	public String hotelNom() {
		return repository.hotelNom();
				}
	public HotelRepository getRepository() { //Pour connecter les deux services avec la meme repository
		return repository;
	}
	

	
	
	}


