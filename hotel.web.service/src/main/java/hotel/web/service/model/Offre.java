package hotel.web.service.model;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Offre {
	
	
	/*  ATTRIBUTES  */
	private static int  count=0;
	private int id;
	private int capacite;
	private float prix;
	private LocalDate date_arrive;
	private LocalDate date_depart;
	private List<Integer> date_int_arrive;
	private List<Integer> date_int_depart;
	private int chambreId;
	private int hotelId;
	private String image;
	
	
	/*  CONSTRUCTOR  */
	public Offre(int capacite, LocalDate date_arrive, LocalDate date_depart, float prix, int chambreId, int hotelId, String image) {
		setImage(image);
		setId(count);
		setCapacite(capacite);
		setDate_arrive(date_arrive);
		setDate_depart(date_depart);
		setPrix(prix);
		setHotelId(hotelId);
		setChambreId(chambreId);
		count++;
		//On calcul les dates en int 
		int year = date_arrive.getYear();
	    int month = date_arrive.getMonthValue();
	    int day = date_arrive.getDayOfMonth();
	    List<Integer> arrive= new ArrayList<>(List.of(day,month,year));
		setDate_int_arrive(arrive);
		
		int year1 = date_depart.getYear();
	    int month1 = date_depart.getMonthValue();
	    int day1 = date_depart.getDayOfMonth();
	    List<Integer> depart= new ArrayList<>(List.of(day1,month1,year1));
		setDate_int_depart(depart);
		
		}
	public Offre() {
		
	}


	/*  METHODS  */
	public boolean dateOverlap(LocalDate dep,LocalDate arv) {
		Offre O1=this;
		if (!(dep.isBefore(O1.date_arrive) || arv.isAfter(O1.date_depart))) {
            return true;  
        }
		return false;
	}
	
	
	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}



	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}


	public void setPrix(float prix) {
		this.prix = prix;
	}


	public void setDate_arrive(LocalDate date_arrive) {
		this.date_arrive = date_arrive;
	}


	public void setDate_depart(LocalDate date_depart) {
		this.date_depart = date_depart;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getCapacite() {
		return capacite;
	}
	public LocalDate getDate_arrive() {
		return date_arrive;
	}
	public LocalDate getDate_depart() {
		return date_depart;
	}
	
	public float getPrix() {
		return prix;
	}



	public List<Integer> getDate_int_arrive() {
		return date_int_arrive;
	}


	public void setDate_int_arrive(List<Integer> date_int_arrive) {
		this.date_int_arrive = date_int_arrive;
	}


	public List<Integer> getDate_int_depart() {
		return date_int_depart;
	}


	public void setDate_int_depart(List<Integer> date_int_depart) {
		this.date_int_depart = date_int_depart;
	}
	public int getChambreId() {
		return chambreId;
	}
	public void setChambreId(int chambreId) {
		this.chambreId = chambreId;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Offre.count = count;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
}
