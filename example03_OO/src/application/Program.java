package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Name: ");
		student.name = sc.nextLine();

		System.out.print("Grade 01: ");
		student.grade01 = sc.nextDouble();
		
		System.out.print("Grade 02: ");
		student.grade02 = sc.nextDouble();
		
		System.out.print("Grade 03: ");
		student.grade03 = sc.nextDouble();
		
		System.out.println();
		System.out.println(student);
		
		sc.close();
	}

}
