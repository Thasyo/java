package example_product;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println(product);
		
		System.out.println();
		System.out.println("Product Name: ");
		String name = sc.nextLine();
		
		System.out.println("Product Price: ");
		double price = sc.nextDouble();
		
		Product p = new Product(name, price);
		
		p.setName("Computer");
		p.setPrice(1200.00);
		
		System.out.println("Update Name: " + p.getName());
		System.out.println("Update Price: " + p.getPrice());
		
		System.out.println();
		System.out.println("Product Data: " + p);
		
		System.out.println();
		System.out.println("How many products do you want to add to stock? ");
		int addQuantity = sc.nextInt();
		p.addProducts(addQuantity);
		
		if(addQuantity == 1) {
			System.out.println("Essa joça tá pegando!");
		}
		
		System.out.println("Update Data: " + p);
		
		System.out.println();
		System.out.println("How many products do you want to remove to stock? ");
		int removeQuantity = sc.nextInt();
		p.removeProducts(removeQuantity);
		
		System.out.println("Update Data: " + p);
		
		sc.close();
	}

}
