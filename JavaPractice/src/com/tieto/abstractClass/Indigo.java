package com.tieto.abstractClass;

public class Indigo extends GenericAirCraft{
	
	int a = 20;

	public static void main(String[] args) {
		
		GenericAirCraft g = new Indigo();
		g.engineSpecification();  // It will take the method of child class 
		g.flightcolor();
		System.out.println(g.a); // Takes the variable depending upon the type of the object i.e. classname 

	}

	@Override
	public void flightcolor() {

		System.out.println("Flight color is red..");
	}
	
	public void engineSpecification()
	{
		System.out.println("Engine specification of indigo");
	}
	

}
