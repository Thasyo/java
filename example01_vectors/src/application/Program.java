/*
	Fazer um programa para ler um número inteiro N e a altura de N
	pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
	altura média dessas pessoas.

 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] heightPeople = new double[n];
		double sumHeight = 0.00;
		double averageHeight = 0.00;
		
		for(int i = 0; i < n; i++){
			
			heightPeople[i] = sc.nextDouble();
			sumHeight += heightPeople[i];
		}
		
		averageHeight = sumHeight / n;
		
		System.out.printf("AVERAGE HEIGHT OF PEOPLE: %.2f", averageHeight);
	}

}
