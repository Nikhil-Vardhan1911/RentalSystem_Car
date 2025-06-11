package com.dl.RentalSystem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		CarRentalSystem rentalSystem = new CarRentalSystem();
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("\n======= Car Rental Menu ======");
			System.out.println("1. Show Available Cars");
			System.out.println("2. Rent a Car");
			System.out.println("3. Return a car");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			
			case 1:
				rentalSystem.showAvailableCars();
				break;
			
			case 2:
				System.out.println("Enter car number to rent: ");
				rentalSystem.rentCar(sc.nextLine());
				break;
			case 3:
				System.out.println("Enter car number to return");
				rentalSystem.returnCar(sc.nextLine());
				break;
			case 4:
				System.out.println("👋 Exiting... Thank you!");
				break;
			default:
				System.out.println("⚠️ Invalid choice");
			}	
		} while(choice!=4);
		sc.close();
	}
}