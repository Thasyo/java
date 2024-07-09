package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rental;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int roomRental = sc.nextInt();
		
		Rental[] rental = new Rental[10];
		
		for(int i = 0; i < roomRental; i++) {
			
			System.out.println();
			System.out.println("Rent#" + (i+1));
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			
			rental[roomNumber] = new Rental(name, email, roomNumber);
		}
		
		System.out.println();
		System.out.println("Busy Rooms:");
		for(int i = 0; i < rental.length; i++) {
			
			if(rental[i] != null) {
					System.out.println(i + ": " + rental[i].getName() + ", " + rental[i].getEmail());
			}
		}
		

		sc.close();
	}

}
