package hotel.web.service.reservation;

import java.util.Map;

import hotel.web.service.exceptions.LoginIdentificationBadException;
import hotel.web.service.exceptions.NoRoomFoundException;
import hotel.web.service.exceptions.RoomAlreadyReservedException;
import hotel.web.service.model.Adresse;
import hotel.web.service.model.Chambre;
import hotel.web.service.model.Hotel;
import hotel.web.service.model.Offre;
import hotel.web.service.model.Reservation;
import hotel.web.service.repository.HotelRepository;
import hotel.web.service.repository.HotelRepositoryImpl;
import hotel.web.service.services.HotelService;
import hotel.web.service.services.HotelServiceImpl;
import jakarta.jws.WebService;

@WebService(endpointInterface="hotel.web.service.reservation.ReservationService")
public class ReservationServiceImpl implements ReservationService {


		/* ATTRIBUTES */
	
	private HotelRepository repository;
	
		/* CONSTRUCTOR */
	public ReservationServiceImpl(HotelServiceImpl Service) { repository=Service.getRepository() ;}
	public ReservationServiceImpl() {}
	
		/* METHODES */
	public int reserver(int id, String mdp, int id_offre, String nom, String pre_nom, String nbr_telephone,int creditCard) throws LoginIdentificationBadException, RoomAlreadyReservedException {
		return repository.reserver(id, mdp, id_offre, nom, pre_nom, nbr_telephone, creditCard);
		}

}


