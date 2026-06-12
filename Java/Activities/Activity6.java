package com.activities;

public class Activity6
{
	// Main class
	
	    public static void main(String[] args) {

	        Plane plane = new Plane(3);

	        plane.addPassenger("Aman");
	        plane.addPassenger("Riya");
	        plane.addPassenger("Karan");
	        plane.addPassenger("Extra"); // should show full

	        plane.takeOff();
	        plane.land();

	        System.out.println("Passengers: " + plane.getPassengers());
	    }
}
