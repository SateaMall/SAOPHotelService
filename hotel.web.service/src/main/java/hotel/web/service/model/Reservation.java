package hotel.web.service.model;

import java.time.LocalDate;

public class Reservation {
		/* ATTRIBUTES */
	private static int count =0;
	private  int id;
	private String nom;
	private String prenom;
	private LocalDate date_arrive;
	private LocalDate date_depart;
	private Chambre chambre;
	private String nbr_telephone;
	private int creditCard;
	private Client client;

	
		/* CONSTRUCTOR */
	public Reservation(String nom, String prenom, LocalDate date_arrive, LocalDate date_depart, Chambre chambre, String nbr_telephone, int creditCard) {// avec agence
		setNom(nom);
		setPrenom (prenom);
		setDate_arrive(date_arrive);
		setDate_depart(date_depart);
		setNbr_telephone(nbr_telephone);
		setId(count);
		setCreditCard(creditCard);
		count++;
		setClient(new Client(nom, prenom, nbr_telephone,creditCard));
		
	}
	

	public Reservation() {
		this.setId( count);
		count++;
	}
	
		/* METHODES */
	public boolean dateOverlap(LocalDate dep,LocalDate arv) {
		Reservation r1=this;
		if ((arv.isBefore(r1.date_arrive) && dep.isBefore(r1.date_arrive)) || (arv.isAfter(r1.date_depart)&& dep.isAfter(r1.date_depart)) ) {
            return false;  //La chambre n'est pas disponible
        }
		return true;
	}
	
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public LocalDate getDate_arrive() {
		return date_arrive;
	}
	public LocalDate getDate_depart() {
		return date_depart;
	}
	public Chambre getChambre() {
		return chambre;
	}

	public String getNbr_telephone() {
		return nbr_telephone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Reservation.count = count;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setDate_arrive(LocalDate date_arrive) {
		this.date_arrive = date_arrive;
	}
	public void setDate_depart(LocalDate date_depart) {
		this.date_depart = date_depart;
	}
	public void setChambre(Chambre chambre) {
		this.chambre = chambre;
	}
	public void setNbr_telephone(String nbr_telephone) {
		this.nbr_telephone = nbr_telephone;
	}

	public int getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(int creditCard) {
		this.creditCard = creditCard;
	}
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}
