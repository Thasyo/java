package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.enums.OrderStatus;
import exercise03.Client;
import exercise03.Order;
import exercise03.OrderItem;
import exercise03.Product;

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
		
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		
//		System.out.print("Nome do departamento: ");
//		String depName = sc.nextLine();
//		System.out.println("Dados do Trabalhador: ");
//		System.out.println("Nome: ");
//		String name = sc.nextLine();
//		System.out.println("Nível: ");
//		String level = sc.nextLine();
//		System.out.println("Salário Base: ");
//		Double baseSalary= sc.nextDouble();
//		Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(depName)); 
//
//		System.out.print("Quantos contratos: ");
//		int n = sc.nextInt();
//		
//		for(int i = 1; i <= n; i++) {
//			System.out.println("Contrato " + i);
//			System.out.print("Data (DD//MM/YYYY): ");
//			Date contractDate = sdf.parse(sc.next());
//			System.out.print("Valor por hora: ");
//			double valueHour = sc.nextDouble();
//			System.out.print("Duração (horas): ");
//			int hours = sc.nextInt();
//			HourContract contract = new HourContract(contractDate, valueHour, hours);
//			worker.addContract(contract);
//		}
//		
//		System.out.println();
//		System.out.print("Insira mês e ano para calcular salário (MM/YYYY): ");
//		String monthAndYear = sc.next();
//		int month = Integer.parseInt(monthAndYear.substring(0, 2));
//		int year = Integer.parseInt(monthAndYear.substring(3));
//		
//		System.out.println("Nome: " + worker.getName());
//		System.out.println("Departamento: " + worker.getDepartment().getName());
//		System.out.println("Salário do mês (" + monthAndYear + "): " + String.format("%.2f", worker.income(year, month)));
		
		//********** DESAFIO 02 ABAIXO *************
		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		
//		Comment c1 = new Comment("Have a nice trip");
//		Comment c2 = new Comment("Wow that's awesome!");
//		Post post01 = new Post(sdf.parse("21/06/2018 13:05:44"), 
//				"Traveling to New Zealand", 
//				"I'm going to visit this wonderful country!", 
//				12
//		);
//		
//		post01.addComment(c1);
//		post01.addComment(c2);
//		
//		Comment c3 = new Comment("Good night");
//		Comment c4 = new Comment("May the force be with you");
//		Post post02 = new Post(sdf.parse("28/07/2018 23:14:19"), 
//				"Good night guys", 
//				"See you tomorrow", 
//				5
//		);
//		
//		post02.addComment(c3);
//		post02.addComment(c4);
//		
//		System.out.println(post01);
//		System.out.println(post02);
		
		//********** DESAFIO 03 ABAIXO *************
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf02 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US); 
		
		System.out.println("--- Insira os dados do cliente ---");
		System.out.print("\nNome: ");
		String clientName = sc.nextLine();
		System.out.print("Email: ");
		String clientEmail = sc.nextLine();
		System.out.print("Data de aniversário: ");
		Date birthDate = sdf.parse(sc.nextLine());
		Client client = new Client(clientName, clientEmail, birthDate);
		
		System.out.println("\n--- Insira os dados do Pedido ---");
		System.out.print("\nStatus do pedido: ");
		String status = sc.nextLine();
		Order order = new Order(new Date(), OrderStatus.valueOf(status));
		
		System.out.print("Quantos items para esse pedido: ");
		Integer quantityItems = sc.nextInt();
		
		for(int i = 1; i <= quantityItems; i++) {
			System.out.println("\n--- Insira os dados do " + i + "° Item ---");
			System.out.print("\nNome do Produto: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Preço do Produto: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantidade: ");
			int productQuantity = sc.nextInt();
			Product product = new Product(productName, productPrice);
			OrderItem orderItem = new OrderItem(productQuantity, product.getPrice());
			order.addItem(orderItem);
			order.setClient(client);
		}
		
		System.out.println("\n--- ORDER SUMARY ---");
		System.out.println("Momento do Pedido: " + sdf02.format(order.getMoment()));
		System.out.println("Status do pedido: " + order.getStatus());
		System.out.println("Cliente: " + order.getClient().getName() + " (" + sdf.format(order.getClient().getBirthDate()) + ") - " + order.getClient().getEmail());
		System.out.println("Items do Pedido: ");
		for(OrderItem i: order.getItems()) {
			System.out.println(i.getProduct().getName() + ", $" + i.getPrice() + ", Quantidade: " + i.getQuantity() + ", SubTotal: $" + i.subTotal());
		}
		System.out.println("Total: $" + order.total());
		
		sc.close();
	}

}
