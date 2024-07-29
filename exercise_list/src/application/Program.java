package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		List<Employee> employees = new ArrayList<>();
		
		
		System.out.println("Quantas pessoas irão ser registradas? ");
		int personNumber = sc.nextInt();
		
		Employee[] employee = new Employee[personNumber];
		
		for(int i = 0; i < employee.length; i++) {
			
			System.out.println("Funcionário #" + (i+1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salário: R$");
			double salary = sc.nextDouble();
			
			employee[i] = new Employee(id, name, salary);
			
			employees.add(employee[i]);
			
		}
		
		System.out.println("Digite o ID do funcionário que vai ter o aumento salarial: ");
		int idEmployeeSalaryIncrease = sc.nextInt();
		System.out.println("Digite a porcentagem do aumento salarial: ");
		int percentageSalaryIncrease = sc.nextInt();
		
		for(Employee emp: employees) {
			
			if(emp.getId() == idEmployeeSalaryIncrease) {
				emp.increaseSalary(percentageSalaryIncrease);
			}
			
		}
		
		System.out.println("Lista de Funcionários: ");
		
		for(Employee emp: employees) {
			System.out.println(emp.getId() + ", " + emp.getName() + ", " + emp.getSalary());
		}
		
		sc.close();	
	
	}

}
