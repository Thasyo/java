package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account = new Account();
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.println("Enter account holder: ");
		String holder = sc.next();
		
		System.out.println("Is there an initial deposit (y/n): ");
		char option = sc.next().charAt(0);
				
		if(option == 'y') {
			
			System.out.println();
			System.out.println("Enter initial deposit value: ");
			double depositInitial = sc.nextDouble();
			
			account.setHolder(holder);
			account.setNumber(number);
			account.setBalance(depositInitial);
			
		} else {
			
			account.setHolder(holder);
			account.setNumber(number);
			account.setBalance(0);
		
		}
		
		System.out.println();
		System.out.println(account.String());
		
		sc.close();
	}

}
