package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class PassengerList {

	List<Passenger> passengerInfo() {
		List<Passenger> plist = new ArrayList<Passenger>();
		Passenger p = new Passenger();
		p.passengername = "ravi kiran";
		p.passengerage = 22;
		p.passengermobilenumber = 9440000;
		p.seatnumber = 14;
		AbhiBusDetails b = new AbhiBusDetails();
		p.bus=b;
		b.operatorname = "APSRTC";
		b.bustype = "garuda";
		b.boardingpoint = "kphb";
		b.boardingtime = "10pm";
		AbhibusTicketDetails a = new AbhibusTicketDetails();
		p.ticket=a;
		a.ticketnumber = "J75130081";
		a.travellingfrom = "hyderabad";
		a.tarvellingto = "banglore";
		a.ticketfare = "1000/rs";
		plist.add(p);
		
		return plist;
	}
}