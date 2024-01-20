package agence.web.service.model.agence;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import agence.web.service.client.HotelService;
import agence.web.service.client.HotelServiceImplService;
import agence.web.service.client.reserver.ReservationService;
import agence.web.service.client.reserver.ReservationServiceImplService;

public class AgenceImp {
	private Agence agence;
	private ArrayList<HotelService> hotelS1 = new ArrayList<>();
	private ArrayList<ReservationService> hotelS2 = new ArrayList<>();
	private int [] hotelIds;
			
	public AgenceImp(Agence agence) throws MalformedURLException {
		this.agence = agence;
		for(String S1: agence.getHotelS1()) {
			hotelS1.add(connectS1(S1));
		}
		for(String S2: agence.getHotelS2()) {
			hotelS2.add(connectS2(S2));
		}
		hotelIds= new int [hotelS1.size()];
		for(int i=0; i<hotelS1.size(); i++) {
			hotelIds[i]= hotelS1.get(i).hotelId();
		}
		
	}
	
	public HotelService connectS1(String link) throws MalformedURLException {
		URL url= new URL(link); 
		HotelServiceImplService serviceImpl= new HotelServiceImplService(url);
		HotelService proxy= serviceImpl.getHotelServiceImplPort();
		return proxy; 
		
	}
	
	public ReservationService connectS2(String link) throws MalformedURLException {
		URL url= new URL(link); 

		ReservationServiceImplService serviceImpl= new ReservationServiceImplService(url);
		ReservationService proxy= serviceImpl.getReservationServiceImplPort(); //Le pb est la
		return proxy; 
		
	}
	public int getIndexhotelIds(int id) {
		for(int i=0; i<hotelS1.size();i++) {
			if(hotelIds[i]==id) {
				return i;
			}
		}
		return -1;
	}
	
	public ArrayList<HotelService> getHotelS1() {
		return hotelS1;
	}
	
	public ArrayList<ReservationService> getHotelS2() {
		return hotelS2;
	}
	
}
