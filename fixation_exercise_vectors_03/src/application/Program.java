/*

	Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na 
	tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, 
	bem como os nomes dessas pessoas caso houver.

*/


package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int totalPeopleUnder16 = 0;
		double sum = 0.00;
		double averageHeight = 0.00;
		System.out.print("Quantas pessoas serão digitadas: ");
		int n = sc.nextInt();
		Person[] person = new Person[n];
		
		
		for(int i = 0; i < person.length; i++) {
			
			System.out.println("-------------");
			
			System.out.println("Dados da " + (i+1) + "° Pessoa");
			sc.nextLine();
			
			System.out.print("Nome: ");
			String name = sc.nextLine();
			
			System.out.print("Idade: ");
			int age = sc.nextInt();
			
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			
			person[i] = new Person(name, age, height);
			
			sum += person[i].getHeight();
			averageHeight = sum / person.length;
			
			if(person[i].getAge() < 16) {
				totalPeopleUnder16++;
			}
			
		}
		
		double percentage = ((double) totalPeopleUnder16 / person.length) * 100;
			
		System.out.printf("Altura média das pessoas: %.2f", averageHeight);
		System.out.println("\nPessoas com menos de 16 anos: " + percentage + "%");
		
		for(int i = 0; i < person.length; i++) {
			
			if(person[i].getAge() < 16) {
				
				System.out.println(person[i].getName());
				
			}
			
		}
		
		sc.close();

	}

}
