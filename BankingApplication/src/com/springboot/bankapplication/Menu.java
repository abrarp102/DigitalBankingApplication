
package com.springboot.bankapplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu  {

	private static boolean quit = false;

	public static void runMenu() {
		printHeader();
		welcomeMenu();

	}

	private static void printHeader() {
		System.out.println("+----------------------------------------+");
		System.out.println("|        Welcome to Digital Banking      |");
		System.out.println("|        Awesome Digital Banking App     |");
		System.out.println("+----------------------------------------+");
	}
	
	private static void printFooter() {
		System.out.println("__________________________________________");
	}

	private static void welcomeMenu() {

		System.out.println();
		System.out.println("Welcome to Bank of Java" + "\n\n1. I am a customer" + "\n2. I do not have an account"
				+ "\n0. Close Program" + " \n\nPlease make a selection:");
		Scanner kbd = new Scanner(System.in);

		try {
			do {

				int welcomeInput = kbd.nextInt();
				switch (welcomeInput) {

				case 1:
					verifyLogin();
					printFooter();
					break;
				case 2:
					System.out.println();
					System.out.println("I do not have an account Method");
					printFooter();
					break;
				case 0:
					System.out.println();
					System.out.println("Exiting...");
					System.out.println("Thanks for using our application!");
					quit = true;
					printFooter();
					break;
				default:
					System.out.println();
					System.out.println("Invalid choice! \nPlease choose either enter option 1 or 2!");
					printFooter();

				}

			} while (!quit);

		} catch (InputMismatchException e) {
			System.out.println();
			System.out.println("Invalid Entry");
			System.out.println();
			System.out.println("Please enter a numeric value for selection");
			welcomeMenu(); 
			printFooter();
		}

	}

	private static void loginMenu() {
		System.out.println("\n\n1. Retry" + "\n2. Forget password" + "\n3. Return to Main Menu" + "\n0. Exit");
		printFooter();
		Scanner kb = new Scanner(System.in);
		try {
		do {
		int retry = kb.nextInt();
		switch(retry)
		{
			case 1: 
				verifyLogin();
				
				break;
			
			case 2:
				System.out.println();
				System.out.println("Forget password method!");
				printFooter();
				break;
				
			case 3: 
				System.out.println("Return to main menu");
				printFooter();
				break;
			case 0:
				System.out.println();
				System.out.println("Exiting.. Thanks for using our Application!");
				printFooter();
				quit = true;
				System.exit(0);
				break;
			default:
				System.out.println();
				System.out.println("Invalid choice! \nPlease choose either enter option 1,2,3 or 0!");
				printFooter();
		}
		}while(!quit); // Exception handling
		} catch (InputMismatchException e) {
			System.out.println();
			System.out.println("Invalid Entry");
			System.out.println();
			System.out.println("Please enter a numeric value for selection");
			loginMenu();
			printFooter();
		}
		
			
		}
				

	public static void verifyLogin() {
		Scanner kbd = new Scanner(System.in);
		int loginuserID = 0;
		System.out.println("Please enter UserID: ");
		loginuserID = kbd.nextInt();
		String loginPassword;
		System.out.println("Please enter password: ");
		loginPassword = kbd.next();
		printFooter();

		File file = new File("C:\\Users\\Abrar\\Desktop\\Quintrix Training\\Project\\users.txt");
		try {
			Scanner sc = new Scanner(file);

			sc.useDelimiter("[,\n]");
			boolean found = false;

			while (sc.hasNext() && file.exists()) {

				
				int tempUserID = sc.nextInt();
				String tempPassword = sc.next();

				if (tempUserID == loginuserID && tempPassword.trim().equals(loginPassword.trim())) {
					found = true;
					System.out.println();
					System.out.println("Login Succesful!!");
					System.out.println("__________________________________________");
				}

			}
			if (!found) {
				System.out.println();
				System.out.println("Invalid login!! Please try again!");
				loginMenu();
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			printFooter();
		}

	}

}
