package hotel.web.service.server;

import java.io.IOException;

import hotel.web.service.model.Adresse;
import hotel.web.service.model.Hotel;
import hotel.web.service.reservation.ReservationServiceImpl;
import hotel.web.service.services.HotelServiceImpl;
import jakarta.xml.ws.Endpoint;

public class Server {

	public static void main(String[] args) throws IOException {
		
		/**
		 * First Hotel
		 * */	
		Adresse adresse= new Adresse("Germany", "Cologne", "570 Route de Ganges", "Hotel de 4 seisons","654654,65465 654654,654654 ", 34090);
		Hotel hotel= new Hotel("4 Seasons", "Lux",5, adresse,0);
		HotelServiceImpl HotelService =new HotelServiceImpl(hotel);
		Endpoint.publish("http://localhost:8080/seasonsService1", HotelService);
		Endpoint.publish("http://localhost:8080/seasonsService2", new ReservationServiceImpl(HotelService));
		System.out.println("4-Seasons Hotel's services are running!");
		
		/**
		 * Second Hotel
		 * */	
		Adresse adresse2= new Adresse("Germany", "Cologne", "570 Route de Ganges", "Hotel de Barcelone","654654,65465 654654,654654 ", 64500);
		Hotel hotel2= new Hotel("Saop", "Auberge",2, adresse2,1);
		HotelServiceImpl HotelService2 =new HotelServiceImpl(hotel2);
		Endpoint.publish("http://localhost:8080/SaopService1", HotelService2);
		Endpoint.publish("http://localhost:8080/SaopService2", new ReservationServiceImpl(HotelService2));
		System.out.println("Soap Hotel's services are running!");
		
		/**
		 * Third Hotel
		 * */	
		Adresse adresse3= new Adresse("Germany", "Cologne", "940 the square street", "centre de commerce","654654,65465 654654,654654 ", 12000);
		Hotel hotel3= new Hotel("The-Rive", "Motel",2, adresse3,2);
		HotelServiceImpl HotelService3 =new HotelServiceImpl(hotel3);
		Endpoint.publish("http://localhost:8080/The-RiveService1", HotelService3);
		Endpoint.publish("http://localhost:8080/The-RiveService2", new ReservationServiceImpl(HotelService3));
		System.out.println("The-Rive Hotel's services are running!");
		
		/**
		 * Forth Hotel
		 * */	
		Adresse adresse4= new Adresse("Syrie", "Homs", "570 Route du stadium", "Hotel d'al safir","654654,65465 654654,654654 ", 00000);
		Hotel hotel4= new Hotel("Al-Safir", "Luxe",5, adresse4,3);
		HotelServiceImpl HotelService4 =new HotelServiceImpl(hotel4);
		Endpoint.publish("http://localhost:8080/Al-SafirService1", HotelService4);
		Endpoint.publish("http://localhost:8080/Al-SafirService2", new ReservationServiceImpl(HotelService4));
		System.out.println("Al-Safir Hotel's services are running!");
		
		/**
		 * Fifth Hotel
		 * */	
		Adresse adresse5= new Adresse("Syrie", "Homs", "09 Route de Ghornata", "City centre","654654,65465 654654,654654 ", 00000);
		Hotel hotel5= new Hotel("Ghornata", "Auberge",5, adresse5,4);
		HotelServiceImpl HotelService5 =new HotelServiceImpl(hotel5);
		Endpoint.publish("http://localhost:8080/GhornataService1", HotelService5);
		Endpoint.publish("http://localhost:8080/GhornataService2", new ReservationServiceImpl(HotelService5));
		System.out.println("Ghornata Hotel's services are running!");
		
		
		/**
		 * Sixth Hotel
		 * */	
		Adresse adresse6= new Adresse("Syrie", "Homs", "570 Route de al-Hamre", "City centre","654654,65465 654654,654654 ", 00000);
		Hotel hotel6= new Hotel("Al-Hamra", "Luxe",5, adresse6,5);
		HotelServiceImpl HotelService6 =new HotelServiceImpl(hotel6);
		Endpoint.publish("http://localhost:8080/Al-HamraService1", HotelService6);
		Endpoint.publish("http://localhost:8080/Al-HamraService2", new ReservationServiceImpl(HotelService6));
		System.out.println("Al-Hamra Hotel's services are running!");
		
		
	}

}
