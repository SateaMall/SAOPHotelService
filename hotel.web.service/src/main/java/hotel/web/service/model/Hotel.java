package hotel.web.service.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hotel {
	
		/* ATTRIBUTES */
	private int id;
	private String nom;
	private String category;
	private int etoiles;
	private Adresse adresse;
	private Map<Integer, String> agences = new HashMap<Integer,String>(); //(id,mot de pass)
	private ArrayList<Chambre> chambres= new ArrayList<> ();
	

	/* CONSTRUCTORS */
	public Hotel(String nom, String category, int etoiles, Adresse adresse, int id) {
		setNom(nom);
		setCategory(category);
		setEtoiles(etoiles);
		setAdresse(adresse);
		setId(id);
	}
	public Hotel() {}

	

	
	public Chambre findChambre(int idChambre) {

		for(Chambre c: chambres) {
			if (c.getNum_chambre()==idChambre) {
				return c;
			}
		}
		return null;
	}
	
	
	public void addChambre(Chambre chambre) {
		chambres.add(chambre);
	}
	
	public Map<Integer, String> getAgences() {
		return agences;
	}


	public void addAgences(int id, String mdp) {
		agences.put(id, mdp);
	}
	
	public void setAgences(Map<Integer, String> agences) {
		this.agences = agences;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getEtoiles() {
		return etoiles;
	}

	public void setEtoiles(int etoiles) {
		this.etoiles = etoiles;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public ArrayList<Chambre> getChambres() {
		return chambres;
	}

	public void setChambres(ArrayList<Chambre> chambres) {
		this.chambres = chambres;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	
}
