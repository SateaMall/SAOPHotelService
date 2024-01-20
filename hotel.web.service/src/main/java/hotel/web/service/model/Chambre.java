package hotel.web.service.model;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Base64;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class Chambre {
		/* ATTRIBUTES */
	private int num_chambre;
	private int capacite;
	private int prix_base;
	private int hotelId;
	private String image;
	private ArrayList<Reservation> reservations; 
	
	
		/* CONSTRUCTOR */
	public Chambre(int num_chambre, int capacite, int prix_base, int hotelId, String file_path) throws IOException {
		setNum_chambre (num_chambre);
		setCapacite(capacite);
		setPrix_base(prix_base);
		setHotelId(hotelId);
		setImage(encodeImage(file_path));
		setReservations( new ArrayList<>()); 
	}
	public Chambre() {}
	
	
		/* METHODES */
	 public String getImage() {
	        return image;
	    }

	    public void setImage(String image) {
	        this.image = image;
	    }
	
	public void addReservation(Reservation r) {
		reservations.add(r);
	}
	public int getNum_chambre() {
		return num_chambre;
	}
	public void setNum_chambre(int num_chambre) {
		this.num_chambre = num_chambre;
	}
	public int getCapacite() {
		return capacite;
	}
	public int getPrix_base() {
		return prix_base;
	}
	public int getHotel() {
		return hotelId;
	}
	public ArrayList<Reservation> getReservations() {
		return reservations;
	}
	public void setReservations(ArrayList<Reservation> reservations) {
		this.reservations = reservations;
	}


	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}


	public void setPrix_base(int prix_base) {
		this.prix_base = prix_base;
	}


	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
    public static String encodeImage(String imagePath) throws IOException {
        File imageFile = new File(imagePath);
        byte[] fileContent = Files.readAllBytes(imageFile.toPath());
        return Base64.getEncoder().encodeToString(fileContent);
    }
    
	
	
}
