
package com.springboot.bankapplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu  {

	//private static boolean quit = false;

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

	private static void welcomeMenu() {

		System.out.println();
		System.out.println("Welcome to Bank of Java" + "\n\n1. I am a customer" + "\n2. I do not have an account"
				+ "\n0. Close Program" + " \n\nPlease make a selection:");
		Scanner kbd = new Scanner(System.in);

		try {
			do {

				int welcomeInput = kbd.nextInt();
				int loginInput = kbd.nextInt(); 

				switch (welcomeInput) {

				case 1:
					System.out.println();
					verifyLogin();
						
				case 2:
					System.out.println();
					System.out.println("I do not have an account Method");
					break;
				case 0:
					System.out.println();
					System.out.println("Exiting...");
					System.out.println("Thanks for using our application!");
					//quit = true;
					break;

				default:
					System.out.println();
					System.out.println("Invalid choice! \nPlease choose either enter option 1 or 2!");

				}

			} while ();

		} catch (InputMismatchException e) {
			System.out.println();
			System.out.println("Invalid Entry");
			System.out.println();
			System.out.println("Please enter a numeric value for selection");
			welcomeMenu(); 
		}

	}

	private static void loginMenu() {
		System.out.println("\n\n1. Retry" + "\n2. Forget password" + "\n3. Return to Main Menu" + "\n4. Exit"); 
		Scanner kb = new Scanner(System.in);
		int retry = kb.nextInt();
		//String mail = kb.nextLine();
		switch(retry)
		{
			case 1: 
				verifyLogin();
				break;
			
			case 2:
				System.out.println();
				System.out.println("Forget password method!");
				break;
				
			case 3: 
				System.out.println("Return to main menu");
				break;
			case 0:
				System.out.println();
				System.out.println("Exiting.. Thanks for using our Application!");
				System.exit(0);
				break;
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
					System.out.println();

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
		}

	}

}
