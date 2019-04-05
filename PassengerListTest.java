package com.java.collections;

import java.util.List;

public class PassengerListTest {

	public static void main(String[] args) {
		PassengerList p = new PassengerList();
		List<Passenger> customer = p.passengerInfo();
		System.out.println("Name    " + "\t" + "age" + "\t" + "seatnumber" + "\t"+"mobile"+"\t" + "operatorname"
		                   +"\t"+"bus-type"+"\t"+"From"+"\t"+"\t"+"To"+"\t"+"boardingpoint"+"\t"+"boardingTime"
				+"\t"+"ticketnumber"+"\t"+"Fare");
		
		for (Passenger pa : customer) 
		{
			
			System.out.println(pa.passengername + "\t" + pa.passengerage + "\t" + pa.seatnumber + "\t" + "\t"
          +pa.passengermobilenumber+"\t"+ pa.bus.operatorname+"\t"+"\t"+pa.bus.bustype+"\t"+"\t"+
		pa.ticket.travellingfrom+"\t"+pa.ticket.tarvellingto+"\t"+pa.bus.boardingpoint+"\t"
          +pa.bus.boardingtime+"\t"+"\t"+pa.ticket.ticketnumber+"\t"+pa.ticket.ticketfare);
		}
	}

}
