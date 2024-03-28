package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC, areaX, areaY, p;
		
		System.out.println("Insira os lados do Triângulo X: ");
		
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Insira os lados do Triângulo Y: ");

		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		p = (xA + xB + xC) / 2.00;
		
		areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2.00;
		
		areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
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
