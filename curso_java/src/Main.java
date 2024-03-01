import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int code_part1, number_part1, code_part2, number_part2;
		double value1, value2, total_part1, total_part2, sum_all;
		
		code_part1 = sc.nextInt();
		number_part1 = sc.nextInt();
		value1 = sc.nextDouble();
		total_part1 = number_part1 * value1;
		
		code_part2 = sc.nextInt();
		number_part2 = sc.nextInt();
		value2 = sc.nextDouble();
		total_part2 = number_part2 * value2;
		
		sum_all = total_part1 + total_part2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", sum_all);
		
	}

}
