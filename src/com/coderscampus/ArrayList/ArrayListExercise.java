package com.coderscampus.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExercise {

	public static void main(String[] args) {
		
		// Task 1 - Create the ListArray.
		List<String> chores = new ArrayList<String>();
		
		// Task 2 - Add in 3 chores, then print to console.
		chores.add("Wash Dishes.");
		chores.add("Fold Laundry.");
		chores.add("Code For an Hour.");
		
		printChoreListToConsole(chores);
		System.out.println("");
		
		// Task 3 - Remove "Wash Dishes", then print to console.
		chores.remove("Wash Dishes.");
		
		// Task 4 - Change "Code For an Hour." to "Code All Day.", then print to console.
		for (int i = 0; i < chores.size(); i++) {
		    String chore = chores.get(i);
		    chore = chore.replaceAll("Code For an Hour.", "Code All Day.");
		    chores.set(i, chore);
		    
		printChoreListToConsole(chores);
		System.out.println("");
		}

	}

	public static void printChoreListToConsole(List<String> chores) {
		for (String chore : chores) {
			System.out.println(chore);
		}
	}

}
