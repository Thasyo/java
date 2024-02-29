import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double ray;
		double pi;
		double area;
		
		pi = 3.14159;
		ray = sc.nextDouble();
		area = pi * Math.pow(ray, 2);
		
		System.out.printf("A = %.4f", area);
		
	}

}
