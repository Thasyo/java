package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.println("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Tax Rate: ");
		employee.taxRate = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);

		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);

		System.out.println();
		System.out.println("Update Data: " + employee);
		
		sc.close();
	}

}
