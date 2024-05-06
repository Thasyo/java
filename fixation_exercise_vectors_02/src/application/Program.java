/*

 	Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida: 
	- Imprimir todos os elementos do vetor.
	- Mostrar na tela a soma e a média dos elementos do vetor.
 
*/

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Quantos números reais você deseja digitar? ");
		int n = sc.nextInt();
		
		double[] number = new double[n];
		double sum = 0.00;
		double average = 0.00;
		
		for(int i = 0; i < number.length; i++){
			
			System.out.print("Digite um número: ");
			number[i] = sc.nextDouble();
			sum += number[i];
			
		}
		
		average = sum / number.length;
		
		showResult(number, sum, average);
		
		
		sc.close();
	}
	
	public static void showResult(double[] number, double sum, double average) {
		
		System.out.println();
		System.out.print("VALORES = ");
			
		for(int i = 0; i < number.length; i++) {
				
			System.out.print(number[i] + "  ");
				
		}
		
		System.out.println();
		System.out.printf("SOMA = %.2f\n", sum);
		System.out.printf("MÉDIA = %.2f", average);
	}

}
