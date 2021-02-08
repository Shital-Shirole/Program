package test;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of N * N matrix : ");
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter row " + i);
			for (int j = 0; j < n; j++)
				matrix[i][j] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + matrix[i][i];
		}
		System.out.println("Sum of digonal : " + sum);
		int sum2 = 0;
		for (int i = 0; i < n; i++) {
			sum2 = sum2 + matrix[i][n - i - 1];
		}
		System.out.println("Sum of Anti-digonal : " + sum2);
		sc.close();
	}
}
