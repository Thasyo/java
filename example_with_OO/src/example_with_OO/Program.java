package example_with_OO;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		
		x = new Triangle();
		y = new Triangle();
		
		double areaX, areaY, p;
		
		System.out.println("Insira os lados do Triângulo X: ");
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Insira os lados do Triângulo Y: ");

		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		p = (x.a + x.b + x.c) / 2.00;
		
		areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		p = (y.a + y.b + y.c) / 2.00;
		
		areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		
		System.out.printf("Area do triângulo X: %.4f%n", areaX);
		
		System.out.printf("Area do triângulo Y: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Maior area e do triângulo: X");
		} else {
			System.out.println("Maior area e do triângulo: Y");
		}
		
		sc.close();

	}

}
