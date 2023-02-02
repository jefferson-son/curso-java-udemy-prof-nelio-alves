package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int[][] matrix = new int[N][N];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Main diagonal: ");
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(matrix[i][i] + " ");
		}

		int sumNegative = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < 0) {
					sumNegative++;
				}
			}
		}

		System.out.println();
		
		if (sumNegative > 0) {
			System.out.print("Negative Numbers = " + sumNegative);
		} else {
			System.out.print("No negative numbers");
		}
		scanner.close();
	}

}
