package com.coderscampus.A3;

import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) {
		
		UserService userService = new UserService();
		try (Scanner scanner = new Scanner(System.in)) {

			int attempts = 0;
			User loggedInUser = null;
			while (attempts < 5) {
				System.out.println("Enter your Email:");
				String inputEmail = scanner.nextLine();
				System.out.println("Enter your Password:");
				String inputPassword = scanner.nextLine();

				loggedInUser = userService.validateUser(inputEmail, inputPassword);
				if (loggedInUser != null) {
					System.out.println("Welcome " + loggedInUser.getName());
					break;
				} else if (attempts == 4) {
					System.out.println("Too many failed login attempts, you are now locked out!");
					break;
				} else {
					System.out.println("Invalid login, please try again");
				}
				attempts++;
			}
			scanner.close();
		}

	}

}