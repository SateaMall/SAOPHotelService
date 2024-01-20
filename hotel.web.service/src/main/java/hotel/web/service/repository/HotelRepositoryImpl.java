package hotel.web.service.repository;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import hotel.web.service.exceptions.LoginIdentificationBadException;
import hotel.web.service.exceptions.NoRoomFoundException;
import hotel.web.service.exceptions.RoomAlreadyReservedException;
import hotel.web.service.model.Adresse;
import hotel.web.service.model.Chambre;
import hotel.web.service.model.Client;
import hotel.web.service.model.Hotel;
import hotel.web.service.model.Offre;
import hotel.web.service.model.Reservation;

public class HotelRepositoryImpl implements HotelRepository {
	
		/* ATTRIBUTES */
	private Hotel hotel;
	private ArrayList<Offre> offres= new ArrayList<>();
	

	
		/* CONSTRUCTORS */
	public HotelRepositoryImpl(Hotel hotel) throws IOException {
		setHotel(hotel);
		int hotelId1=hotel.getId();
		String badHotel="Photos/badHotel.jpg";
		String mediumHotel="Photos/mediumHotel.jpg";
		String goodHotel="Photos/goodHotel.jpg";
		
		Chambre c3= new Chambre (3, 2, 200, hotelId1,mediumHotel); hotel.addChambre(c3);
		Chambre c4= new Chambre (4, 2, 200, hotelId1,mediumHotel); hotel.addChambre(c4);
		Chambre c5= new Chambre (5, 2, 200, hotelId1,mediumHotel); hotel.addChambre(c5);
		Chambre c6= new Chambre (6, 1, 150, hotelId1,badHotel); hotel.addChambre(c6);
		Chambre c7= new Chambre (7, 1, 150, hotelId1,badHotel); hotel.addChambre(c7);
		Chambre c8= new Chambre (8, 1, 150, hotelId1,badHotel); hotel.addChambre(c8);
		Chambre c9= new Chambre (9, 1, 150, hotelId1,badHotel); hotel.addChambre(c9);
		Chambre c10=new Chambre (10,1, 150, hotelId1,badHotel); hotel.addChambre(c10);
		
		Reservation r1 = new Reservation("Nom1", "Prenom1", LocalDate.of(2023, 11, 1), LocalDate.of(2023, 11, 5), c4, "06 55 46 45 45",11455457);
        Reservation r2 = new Reservation("Nom2", "Prenom2", LocalDate.of(2023, 11, 6), LocalDate.of(2023, 11, 10), c4,"06 55 46 45 45",55566544);
        Reservation r3 = new Reservation("Nom3", "Prenom3", LocalDate.of(2023, 11, 11), LocalDate.of(2023, 11, 15), c4, "06 55 46 45 45",55554848);
        Reservation r4 = new Reservation("Nom4", "Prenom4", LocalDate.of(2023, 11, 16), LocalDate.of(2023, 11, 20), c6, "06 55 46 45 45",55577746);
        Reservation r5 = new Reservation("Nom5", "Prenom5", LocalDate.of(2023, 11, 21), LocalDate.of(2023, 11, 25), c6, "06 55 46 45 45",55566669);
        
        c3.addReservation(r1);
        c3.addReservation(r2);
        c3.addReservation(r3);
        c6.addReservation(r4);
        c6.addReservation(r5);
        
        Chambre c1;
        Chambre c2;
        
        switch(hotel.getId()){
        
        case 0: 
        	 c1= new Chambre (1, 4, 1000, hotelId1,goodHotel); hotel.addChambre(c1);
    		 c2= new Chambre (2, 4, 1000, hotelId1,goodHotel); hotel.addChambre(c2);
            break;
    
        case 1:
        	 c1= new Chambre (1, 4, 2000, hotelId1,goodHotel); hotel.addChambre(c1);
    		 c2= new Chambre (2, 4, 2000, hotelId1,goodHotel); hotel.addChambre(c2);
            break;
    
        case 2:
        	 c1= new Chambre (1, 4, 3000, hotelId1,goodHotel); hotel.addChambre(c1);
    		 c2= new Chambre (2, 4, 3000, hotelId1,goodHotel); hotel.addChambre(c2);
            break;
         
        case 3:
        	 c1= new Chambre (1, 4, 4000, hotelId1,goodHotel); hotel.addChambre(c1);
    		 c2= new Chambre (2, 4, 4000, hotelId1,goodHotel); hotel.addChambre(c2);
    		break;
        case 4:
       	 c1= new Chambre (1, 4, 5000, hotelId1,goodHotel); hotel.addChambre(c1);
   		 c2= new Chambre (2, 4, 5000, hotelId1,goodHotel); hotel.addChambre(c2);
            break;
           
    	default:
       	 c1= new Chambre (1, 4, 6000, hotelId1,goodHotel); hotel.addChambre(c1);
   		 c2= new Chambre (2, 4, 6000, hotelId1,goodHotel); hotel.addChambre(c2);
   		 	break;

    		
           
    }
        
        
        hotel.addAgences(0, "0000");
        hotel.addAgences(1, "1111");
 
        
	}
	public HotelRepositoryImpl() {}
	
			/*   METHODES Service 1   */
	public ArrayList<Offre> getChambresDispo(int id, String mdp, List<Integer> date_deb, List<Integer> date_fin, int nbrPersonne) throws NoRoomFoundException, LoginIdentificationBadException {
		offres= new ArrayList<>();
		LocalDate date_debLD= LocalDate.of(date_deb.get(2), date_deb.get(1), date_deb.get(0));
		LocalDate date_finLD= LocalDate.of(date_fin.get(2), date_fin.get(1), date_fin.get(0));
		System.out.println("Chercher une chambre de: "+date_debLD+" jusqu'à "+date_finLD);
		if(!signIn(id,mdp)) {throw new LoginIdentificationBadException(); }
		for(Chambre c: hotel.getChambres())
		{
			if(c.getCapacite()>=nbrPersonne) {
			boolean chambreDisponible = true;
			for(Reservation r: c.getReservations()) {
	            if (r.dateOverlap(date_debLD,date_finLD)) {
	                chambreDisponible = false;
	                break; //La chambre n'est pas disponible
	            }
			}
			if(chambreDisponible) {
				Offre offre= new Offre(c.getCapacite(),date_debLD,date_finLD, c.getPrix_base(), c.getNum_chambre(),hotel.getId(), c.getImage());
				offres.add(offre);}
		}
		}
	    if (offres.isEmpty()) {
	        throw new NoRoomFoundException(); // Aucune chambre n'est disponible
	    }
		return offres;
	}
	
	public Adresse returnHotelAdr() {
		return hotel.getAdresse();
	}
	
	
	
	public int hotelId() {
		return this.hotel.getId();
	}
	
	public String hotelNom() {
		return this.hotel.getNom();
				}


			/*	METHODES Service2  */
	public int reserver(int id, String mdp, int id_offre, String nom, String pre_nom, String nbr_telephone,int creditCard) throws LoginIdentificationBadException, RoomAlreadyReservedException {
		if(!signIn(id,mdp)) {throw new LoginIdentificationBadException(); }
		for(int i=0; i<offres.size(); i++)
		{
			System.out.println("les offres: "+offres.get(i).getId() + ", offre a reserver"+ id_offre);
		}
		Offre of= this.getOffre(id_offre);
		Chambre c = hotel.findChambre(of.getChambreId());
		for(Reservation r: c.getReservations()) {
	        if (r.dateOverlap(of.getDate_arrive(),of.getDate_depart())) {  	
	        	throw new RoomAlreadyReservedException(); // Aucune chambre n'est disponible
	        }
		}
		Reservation r = new Reservation(nom, pre_nom, of.getDate_arrive(), of.getDate_depart(), c, nbr_telephone, creditCard);
		c.addReservation(r);
		Client client=r.getClient();
		System.out.println("New reservation added! from "+ client.getNom()+" IdReservatio:" + r.getId());
		return r.getId();
		}
	

	
			/*	METHODES EN COMMUN  */
	public 	String Connectiontest(String message) {
		System.out.println(message);
		return message+"\n"+ "Thank you for sending us a message" ;
	}
	
	public boolean signIn(int id, String mdp) {
		Map<Integer,String> agences= hotel.getAgences();
		  if (agences.containsKey(id)) {
	            String storedPassword = agences.get(id);
	            if (storedPassword.equals(mdp)) {
	                return true; //L'utilisateur est authentifi� avec succ�s
	            }
	        }
	        return false; // L'utilisateur n'existe pas
	    }
	
	
	/*   METHODES Repository   */
public Offre getOffre(int id) {
	for(Offre o: this.offres) {
		System.out.println("les offres: "+o.getId() + ", offre a reserver"+ id);
		if(id==o.getId()) {
			return o;
		}
	}
	return null;
}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public ArrayList<Offre> getOffres() {
		return offres;
	}

	public void setOffres(ArrayList<Offre> offres) {
		this.offres = offres;
	}


}
