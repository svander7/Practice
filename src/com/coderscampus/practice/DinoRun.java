package com.coderscampus.practice;

public class DinoRun {
	
	public static void main(String[] args) {
	
		Dino rex = new Dino("22'11\"", "12,000", "brown", "male");
		
		System.out.println(rex.getinfo());
		
		Dino steg = new Dino("14'5\"", "15,500", "green", "female");
		
		System.out.println(steg.getinfo());
			
	}
}
