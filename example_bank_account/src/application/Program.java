package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n): ");
		char option = sc.next().charAt(0);
				
		if(option == 'y') {
			
			System.out.println();
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			
			account = new Account(holder, number, initialDeposit);
			
		} else {
			
			account = new Account(holder, number);
		
		}
		
		System.out.println();
		System.out.println("Account Data: " + account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositCash = sc.nextDouble();
		account.deposit(depositCash);
		
		System.out.println();
		System.out.println("Update account Data: " + account);
		

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawCash = sc.nextDouble();
		account.withdraw(withdrawCash);
		
		System.out.println();
		System.out.println("Update account Data: " + account);
		
		sc.close();
	}

}
