/*

	Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros 
	e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 

*/


package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você quer digitar: ");
		int n = sc.nextInt();
		
		boolean condition = true;
		
		while (condition) {
			
			if(n > 10) {
				System.out.println("Os números não podem ser maior que 10!");
				System.out.println("Quantos números você quer digitar: ");
				n = sc.nextInt();
			}else {
				condition = false;
			}
			
		}
		
		int[] number = new int[n];
		
		for(int i = 0; i < number.length; i++){
			
			System.out.print(i+1 + "° Número: ");
			number[i] = sc.nextInt();
			
		}
		
		negativeNumbers(number);
		
		sc.close();
	}
		
	public static void negativeNumbers(int[] number) {
		
		System.out.println("NÚMEROS NEGATIVOS DIGITADOS:");
			
		for(int i = 0; i < number.length; i++) {
				
			if(number[i] < 0){
				System.out.println(number[i]);
			}
				
		}
			
	}	

}
