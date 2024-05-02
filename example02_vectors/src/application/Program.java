/*

	Fazer um programa para ler um número inteiro N e os dados (nome e
	preço) de N Produtos. Armazene os N produtos em um vetor. Em
	seguida, mostrar o preço médio dos produtos.

*/

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] product = new Product[n];
		double sum = 0.00;
		double averageProductPrice = 0.00;

		for(int i = 0; i < product.length; i++) {
			
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			product[i] = new Product(name, price);
			
			sum += product[i].getPrice();
			
		}
		
		averageProductPrice = sum / product.length;
		
		System.out.printf("AVERAGE OF PRODUCT PRICE: %.2f", averageProductPrice);
		
		sc.close();
		
	}

}
