/*

	Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela 
	o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento, 
	considerando a primeira posição como 0 (zero).

*/

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você deseja digitar? ");
		int n = sc.nextInt();
		
		double[] number = new double[n];
		double highestValue = 0;
		int highestValueIndex = 0;
		
		for(int i = 0; i < number.length; i++) {
			
			System.out.print("Digite um número: ");
			number[i] = sc.nextDouble();
			
			if(number[i] > highestValue){
				highestValue = number[i];
				highestValueIndex = i;
			}
			
		}
		
		System.out.println();
		System.out.println("MAIOR VALOR: " + highestValue);
		System.out.println("POSICAO DO MAIOR VALOR: " + highestValueIndex);
		
		sc.close();
	}

}
