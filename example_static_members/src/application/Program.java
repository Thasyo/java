package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.println();
		System.out.println("How many dollars will be bought? ");
		double dollarValue = sc.nextDouble();
		
		double AmountToBePaidInReais = CurrencyConverter.converterToReais(dollarPrice, dollarValue);
		
		System.out.println();
		System.out.printf("amount to be paid in reais: R$ %.2f%n", AmountToBePaidInReais);

		sc.close();
	}

}
