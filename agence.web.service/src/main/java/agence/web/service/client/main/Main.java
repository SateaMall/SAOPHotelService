package agence.web.service.client.main;

import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import agence.web.service.Input.DateInputProcessor;
import agence.web.service.Input.InputProcessor;
import agence.web.service.Input.IntegerInputProcessor;
import agence.web.service.Input.StringInputProcessor;
import agence.web.service.Input.StringIntegerProcessor;
import agence.web.service.client.HotelService;
import agence.web.service.client.LoginIdentificationBadException_Exception;
import agence.web.service.client.NoRoomFoundException_Exception;
import agence.web.service.client.Offre;
import agence.web.service.model.agence.Agence;
import agence.web.service.model.agence.AgenceImp;
import agence.web.service.client.reserver.RoomAlreadyReservedException_Exception;


public class Main {
	public static void main(String[] args) throws LoginIdentificationBadException_Exception, NoRoomFoundException_Exception, agence.web.service.client.reserver.LoginIdentificationBadException_Exception, RoomAlreadyReservedException_Exception {
	
	try {
		
	
	/* 
	 * Agences
	 * */
	Agence agence1 = new Agence("Trival", 10, 0, "0000");
	Agence agence2 = new Agence("Syriatel", 10, 1, "1111");
	ArrayList <Agence> agences = new ArrayList<>(List.of(agence1,agence2));
	int id; String mdp;
	agence1.addhotel("http://localhost:8080/seasonsService1?wsdl","http://localhost:8080/seasonsService2?wsdl");
	agence1.addhotel("http://localhost:8080/SaopService1?wsdl","http://localhost:8080/SaopService2?wsdl");
	//agence1.addhotel("http://localhost:8080/The-RiveService1?wsdl","http://localhost:8080/The-RiveService2?wsdl");
	agence1.addhotel("http://localhost:8080/Al-SafirService1?wsdl","http://localhost:8080/Al-SafirService2?wsdl");
	agence1.addhotel("http://localhost:8080/GhornataService1?wsdl","http://localhost:8080/GhornataService2?wsdl");
	agence1.addhotel("http://localhost:8080/Al-HamraService1?wsdl","http://localhost:8080/Al-HamraService2?wsdl"); 
	
	agence2.addhotel("http://localhost:8080/seasonsService1?wsdl","http://localhost:8080/seasonsService2?wsdl");
	//agence2.addhotel("http://localhost:8080/GhornataService1","http://localhost:8080/GhornataService2");
	agence2.addhotel("http://localhost:8080/The-RiveService1?wsdl","http://localhost:8080/The-RiveService2?wsdl");
	agence2.addhotel("http://localhost:8080/Al-SafirService1?wsdl","http://localhost:8080/Al-SafirService2?wsdl");
	agence2.addhotel("http://localhost:8080/GhornataService1?wsdl","http://localhost:8080/GhornataService2?wsdl");
	agence2.addhotel("http://localhost:8080/Al-HamraService1?wsdl","http://localhost:8080/Al-HamraService2?wsdl"); 
	
	Scanner scanner = new Scanner(System.in);
	
	int z=0;
	for(Agence agence: agences) {
		String agenceName=agence.getNom();
		System.out.println(z+")"+agenceName);
		z++;
	}
	AgenceImp imp;
	InputProcessor AgenceInputProcessor= new IntegerInputProcessor("l'indice de la'agence", 0, agences.size()-1);
	int choixAgence = (int) AgenceInputProcessor.processInput(scanner);
	if  (choixAgence==0) { imp= new AgenceImp(agence1); id=agence1.getId();  mdp=agence1.getMdp();}
	else {imp= new AgenceImp(agence2);  id=agence2.getId();  mdp=agence2.getMdp();}

	/* 
	 * Declarations
	 * */

	
	InputProcessor DateInputProcessor= new DateInputProcessor();
	InputProcessor StringInputProcessor= new StringInputProcessor();
	InputProcessor numberOfPersonsProcessor = new IntegerInputProcessor("le nombre de personnes", 1, 4);
	InputProcessor continuation = new IntegerInputProcessor("0 Si vous rentrer en arrière et 1 si vous continuez la reservation", 0, 1);
	InputProcessor StringIntegerProcessor = new StringIntegerProcessor("le numero de telephone");
	InputProcessor carteDeCredit = new IntegerInputProcessor("la carte de credit",0,1000000000);
	
	
	
	/*
	 * CHOIX DE VILLE  
	 * */
	while(true) {
	ArrayList<String> villes = new ArrayList<>();
	ArrayList<String> payss = new ArrayList<>();
	ArrayList<Offre> offres = new ArrayList<>();
	ArrayList<Offre> offresTemp = new ArrayList<>();
	System.out.println("Les villes disponibles:");
	int j=0;
	for(HotelService proxy: imp.getHotelS1()) {
		String ville=proxy.returnHotelAdr().getVille();
		String pays= proxy.returnHotelAdr().getPays();
		
		/*  Pour ne pas avoir la meme ville deux fois  */
		boolean h=true;
		for (String v: villes) {
			if(ville.equals(v)) {
				h=false;
			}
		}
		
		if(h) { 
			payss.add(pays);
			villes.add(ville);
			j++;
		}
	
		
	}
	for(int u=0; u<villes.size(); u++) {
		System.out.println(u+")"+villes.get(u)+" / "+payss.get(u));
	}
	
	
	
	InputProcessor VilleInputProcessor= new IntegerInputProcessor("l'indice de la ville", 0, villes.size()-1);
	int choixVille = (int) VilleInputProcessor.processInput(scanner);
	
	while(offresTemp.size()==0) {
		
	    /*
		 * INSERTION DES DATES
		 * */
	    System.out.print("La date d'arrivée - ");
	    List<Integer> dateArrive = (List<Integer>) DateInputProcessor.processInput(scanner);
	
	    System.out.print("La date de départ - ");
	    List<Integer> dateDepart = (List<Integer>) DateInputProcessor.processInput(dateArrive, scanner);
	
	    
	    /*
		 * INSERTION DE LA NOMBRE DES PERSONNES
		 * */
	    int numberOfPersons = (Integer) numberOfPersonsProcessor.processInput(scanner);
	    

	    /*
		 * AFFICHAGE DES OFFRES
		 * */
	    int i=0;
	    for(HotelService proxy: imp.getHotelS1()) {
	    	if(proxy.returnHotelAdr().getVille().equals(villes.get(choixVille))) {
	    		offresTemp=(ArrayList<Offre>) proxy.getChambresDispo(id, mdp,dateArrive, dateDepart, numberOfPersons);
	    		offres.addAll(offresTemp);
	    		for (Offre of : offresTemp) {
	    			System.out.println(i+") Hotel:"+proxy.hotelNom() + ", Prix:" + agence1.reducPrix(of.getPrix()) +
	                           ", capacite:" + of.getCapacite() +
	                           ", disponiblite:" + of.getDateIntArrive() +
	                           " - " + of.getDateIntDepart());
	    			i++;
	    		}
	    	}
	    }
	    }

	    /*
		 * CHOIX DE LA RESERVATION
		 * */
		int valeur=0;
		Offre offre=null;
		while(valeur==0) {
		InputProcessor ChoixReservationProcessor = new IntegerInputProcessor("le nombre de l'offre a reserver", 0, offres.size()-1);
	    int choix= (Integer)ChoixReservationProcessor.processInput(scanner);
	    
	    offre=offres.get(choix); //on cherche l'offre
	    
	    afficherImage(offre.getImage());
	    valeur = (int) continuation.processInput(scanner);
	    
		}
	    
	    int index= imp.getIndexhotelIds(offre.getHotelId());
	    
	    System.out.print("Entrez le prénom : ");
	    String prenom = (String) StringInputProcessor.processInput(scanner);
	
	    System.out.print("Entrez le nom : ");
	    String nom = (String) StringInputProcessor.processInput(scanner);
	
	    String numeroTelephone = (String) StringIntegerProcessor.processInput(scanner);
	    
	    int numeroCarte = (int) carteDeCredit.processInput(scanner);
	    
	    int idReservation = imp.getHotelS2().get(index).reserver(id, mdp,offre.getId() , nom, prenom, numeroTelephone, numeroCarte); //have to add credit card
	    System.out.println("Votre id de reservation est :" + idReservation);
	}
	
	} catch(MalformedURLException e) {
		e.printStackTrace();
		}
		
}
    public static void afficherImage(String ParamImage) {
        try {
            // Décoder la chaîne Base64 pour obtenir les données de l'image
            byte[] imageBytes = Base64.getDecoder().decode(ParamImage);
            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            BufferedImage image = ImageIO.read(bais);

            // Afficher l'image dans une fenêtre
            JFrame frame = new JFrame();
            JLabel label = new JLabel(new ImageIcon(image));
            frame.getContentPane().add(label, BorderLayout.CENTER);
            frame.pack();
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}