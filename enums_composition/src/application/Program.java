package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Order;
import entities.enums.OrderStatus;
import entities.enums.WorkerLevel;
import exercise01.Department;
import exercise01.HourContract;
import exercise01.Worker;

public class Program {

	public static void main(String[] args) throws ParseException {
		
//		Exemplo de enumeração e composição
//		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
//		System.out.println(order);
//		
//		EXERCÍCIO 01: Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). 
//		Depois, solicitar do usuário um mês e mostrar qual foi o salário do funcionário nesse mês, 
//		conforme exemplo (próxima página).

		//********** DESAFIO 01 ABAIXO *************
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("insira o nome do departamento: ");
//		String depName = sc.nextLine();
//		Department dep = new Department(depName);
//		
//		System.out.println();
//		System.out.println("--- Insira os dados do trabalhador ---");
//		System.out.print("Nome: ");
//		String name = sc.nextLine();
//		System.out.print("Nivel: ");
//		String level = sc.nextLine();
//		System.out.print("Base salarial: R$");
//		Double baseSalary = sc.nextDouble();
//		Worker worker = new Worker(name, level, baseSalary);
//		
//		System.out.println();
//		System.out.println("--- Insira os dados do(s) contrato(s) ---");
//		System.out.print("Quantos contratos para esse trabalhador? ");
//		Integer contractsNumber = sc.nextInt();
//		
//		for(int i = 0; i < contractsNumber; i++) {
//			
//			
//			
//		}
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Nome do departamento: ");
		String depName = sc.nextLine();
		System.out.println("Dados do Trabalhador: ");
		System.out.println("Nome: ");
		String name = sc.nextLine();
		System.out.println("Nível: ");
		String level = sc.nextLine();
		System.out.println("Salário Base: ");
		Double baseSalary= sc.nextDouble();
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(depName)); 

		System.out.print("Quantos contratos: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Contrato " + i);
			System.out.print("Data (DD//MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valueHour = sc.nextDouble();
			System.out.print("Duração (horas): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valueHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Insira mês e ano para calcular salário (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Nome: " + worker.getName());
		System.out.println("Departamento: " + worker.getDepartment().getName());
		System.out.println("Salário do mês (" + monthAndYear + "): " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();
	}

}
