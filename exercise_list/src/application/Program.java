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

		//criei uma lista do tipo Employee(funcionário). 
		List<Employee> employees = new ArrayList<>();
		
		
		System.out.print("Quantas pessoas irão ser registradas? ");
		int personNumber = sc.nextInt();
		
		//Instanciei um array do tipo Employee(funcionário), predefinindo a quantidade de funcionário que seriam registrados.
		Employee[] employee = new Employee[personNumber];
		
		//Armazenar os dados de todos os funcionários, seus respectivos id's, nomes e salários.
		//Depois criar uma instancia da classe Employee (funcionário) para cada posição do array criado anteriormente e adicionar os dados recebidos.
		//Depois de preencher as informações do funcionário presente no array; adicionamos esse mesmo funcionário dentro da Lista "employees"criada no início do sistema. 
		for(int i = 0; i < employee.length; i++) {
			
			//recebendo os dados dos funcionários.
			System.out.println("\nFuncionário #" + (i+1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salário: R$");
			double salary = sc.nextDouble();
			
			//armazenando os dados do funcinário.
			employee[i] = new Employee(id, name, salary);
			
			//adicionando o funcionário e seus dados dentro da lista.
			employees.add(employee[i]);
			
		}
		
		System.out.print("\nDigite o ID do funcionário que vai ter o aumento salarial: ");
		int idEmployeeSalaryIncrease = sc.nextInt();
		
		//Estou filtrando e verificando se existe o ID que foi informado nas linhas acima dentro da lista de funcionários.
		//Se existir o ID dentro da lista, será armazenada na variável o ID buscado.
		//Se não existir, é retornado um valor NULL à variável.
		Employee employeeIncreaseSalary = employees.stream().filter(x -> x.getId() == idEmployeeSalaryIncrease).findFirst().orElse(null);
		
		//é feito um aumento de salário se existir o ID buscado para o funcionário proprietário do ID.
		//Se o resultado for NULL, é retornado uma mensagem dizendo que não existe funcionário com aquele ID.
		if(employeeIncreaseSalary != null) {
			
			System.out.print("Digite a porcentagem do aumento salarial: ");
			double percentageSalaryIncrease = sc.nextDouble();
			
			
			for(Employee emp: employees) {
				
				if(emp.getId() == idEmployeeSalaryIncrease) {
					emp.increaseSalary(percentageSalaryIncrease);
				}
				
			}
			
		} else {
			
			System.out.println("O ID digitado não existe!");
			
		}
		
		
		//É registrado na tela a informações atualizadas de cada funcionário presente na lista.
		System.out.println("\nLista de Funcionários: ");
		
		for(Employee emp: employees) {
			System.out.printf("%d, %s, %.2f%n", emp.getId(), emp.getName(), emp.getSalary());
		}
		
		sc.close();	
	
	}

}
