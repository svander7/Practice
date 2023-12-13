package com.coderscampus.practice;

public class Dino {
	String height;
	String weight;
	String color;
	String gender;
	
	Dino (String height, String weight, String color, String gender) {
		this.height = height;
		this.weight = weight;
		this.color = color;
		this.gender = gender;
	}
	
	String getinfo () {
		return "Height: " + height + ", Weight: " + weight +
			   ", Color: " + color + ", Gender: " + gender;
	}
	
//	void setProperties (String height, String weight, String color, String gender) {
//		this.height = height;
//		this.weight = weight;
//		this.color = color;
//		this.gender = gender;
//	}

}
