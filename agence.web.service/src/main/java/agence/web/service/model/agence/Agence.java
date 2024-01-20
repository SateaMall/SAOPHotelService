package agence.web.service.model.agence;

import java.util.ArrayList;


public class Agence {
	
int id;
private String nom;
private String mdp;
private double taux_reduc;
private ArrayList<String> hotelS1 = new ArrayList<>();
private ArrayList<String> hotelS2 = new ArrayList<>();


public Agence(String nom, double taux_reduc,int id, String mdp) {
	this.id=id;
	this.nom = nom;
	this.mdp = mdp;
	this.taux_reduc = taux_reduc;
}


public double reducPrix(double prix) {
	return prix- prix/10;
}

public void addhotel(String link_S1, String link_S2) {
	hotelS1.add(link_S1);
	hotelS2.add(link_S2);
} 


public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getMdp() {
	return mdp;
}

public void setMdp(String mdp) {
	this.mdp = mdp;
}
public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public double getTaux_reduc() {
	return taux_reduc;
}

public void setTaux_reduc(double taux_reduc) {
	this.taux_reduc = taux_reduc;
}

public ArrayList<String> getHotelS1() {
	return hotelS1;
}
public ArrayList<String> getHotelS2() {
	return hotelS2;
}



}
