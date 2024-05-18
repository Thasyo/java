/*

	Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na 
	tela todos os números pares, e também a quantidade de números pares.

*/


package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int pairsQuantity = 0;
		System.out.print("Quantos números você deseja digitar: ");
		int n = sc.nextInt();
		ArrayList<Integer> pairsNumbers = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			
			System.out.print((i+1) + "° Número: ");
			int number = sc.nextInt();
			
			if(number % 2 == 0) {
				pairsNumbers.add(number);
				pairsQuantity++;
			}

			
		}
		
		System.out.print("NÚMEROS PARES: ");
		System.out.println(pairsNumbers);
		
		System.out.print("QUANTIDADE DE PARES: ");
		System.out.println(pairsQuantity);

	}

}
