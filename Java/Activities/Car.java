package com.activities;

public class Car 
{
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	public Car(String color, String transmission, int make, int tyres, int doors)
	{
		this.color=color;
		this.transmission=transmission;
		this.make=make;
		this.tyres=tyres;
		this.doors=doors;
	}
	public void displayCharacteristics() 
	{
		System.out.println("Color is "+this.color + " transmission is "+transmission
		+ " make is "+make + " tyres is"+tyres + " doors is "+doors);
	}
	
	public void accelerate()
	{
		System.out.println("Car is moving forward");
	}
	
	public void brake()
	{
		System.out.println("Car has stopped!");
	}
	
}
