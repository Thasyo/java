package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantidade de linhas da matrix: ");
		int rows = sc.nextInt();
		System.out.print("Quantidade de colunas da matrix: ");
		int columns = sc.nextInt();
		
		int[][] matrix = new int[rows][columns];
		
		System.out.println();
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.print("Matrix[" + i + "]" + "[" + j + "]: ");
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.print("Digite o número que você quer buscar na matrix: ");
		int number = sc.nextInt();
		
		System.out.println();
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				if(matrix[i][j] == number) {
					System.out.println("Posição: [" + i + "][" + j + "]");
					int left = Math.abs(matrix[i][1-j]);
					int top = Math.abs(matrix[1-i][j]);
					int right = Math.abs(matrix[i][1+j]);
					int down = Math.abs(matrix[1+i][j]);
					
					System.out.printf("Left: %d%n", left);
					System.out.printf("Top: %d%n", top);
					System.out.printf("Right: %d%n", right);
					System.out.printf("Down: %d%n", down);
				}
			}
		}
		
		sc.close();
	}

}
