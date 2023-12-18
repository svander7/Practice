package com.coderscampus.oop;

public class Dino {

	String height;
	String weight;
	String color;
	String gender;
	
	String getinfo () {
		return "Height: " + height + ", Weight: " + weight + 
				", Color: " + color + ", Gender: " + gender;
	}
	
	void setStats (String height, String weight, 
			String color, String gender) {
		this.height = height;
		this.weight = weight;
		this.color = color;
		this.gender = gender;
	}
	
}
