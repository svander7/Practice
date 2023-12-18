package com.coderscampus.oop;

public class TestRun {

	public static void main(String[] args) {
		
		Dino rex = new Dino();
		
		 rex.setStats("18'6\"", "12,000", "green", "male");
		
		  System.out.println(rex.getinfo());
		
		Dino steg = new Dino();
		
		 steg.setStats("12'2\"", "15,000", "brown", "female");
		 
		  System.out.println(steg.getinfo());
		  
		
		
	}

}
