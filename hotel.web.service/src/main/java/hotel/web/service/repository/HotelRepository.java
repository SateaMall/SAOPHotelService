package hotel.web.service.repository;

import java.util.ArrayList;
import java.util.List;

import hotel.web.service.exceptions.LoginIdentificationBadException;
import hotel.web.service.exceptions.NoRoomFoundException;
import hotel.web.service.exceptions.RoomAlreadyReservedException;
import hotel.web.service.model.Adresse;
import hotel.web.service.model.Offre;

public interface HotelRepository {
	
		/* METHODES Service 1 */
	
		ArrayList<Offre> getChambresDispo(int id, String mdp,List<Integer> date_deb, List<Integer> date_fin, int nbrPersonne) throws NoRoomFoundException, LoginIdentificationBadException;
		

		String Connectiontest(String message) ;
		

		Adresse returnHotelAdr();
		
	
		int hotelId();
		

		String hotelNom();
		
		/* METHODES Service 2 */
		
		public int reserver(int id, String mdp, int id_offre, String nom, String pre_nom, String nbr_telephone,int creditCard) throws LoginIdentificationBadException, RoomAlreadyReservedException;


}
