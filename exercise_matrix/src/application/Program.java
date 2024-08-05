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
					if (j > 0) {
						System.out.println("Left: " + matrix[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matrix[i-1][j]);
					}
					if (j < matrix[i].length-1) {
						System.out.println("Right: " + matrix[i][j+1]);
					}
					if (i < matrix.length-1) {
						System.out.println("Down: " + matrix[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}

}
