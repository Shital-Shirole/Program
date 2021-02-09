package test;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no n*n : ");
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter row " + i);
			for (int j = 0; j < n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("Original Matrix  :  ");
		Program.printMatrix(matrix, n);

		int level = 0;
		int last = n - 1;
		int totalNoOfLevels = n / 2;
		while (level < totalNoOfLevels) {
			for (int i = level; i < last; i++) {
				Program.swap(matrix[level][i], matrix[i][last]);
				Program.swap(matrix[level][i], matrix[i][last - i + level]);
				Program.swap(matrix[level][i], matrix[last - i + level][level]);
			}
			level++;
			--last;
		}
		Program.printMatrix(matrix, n);
		sc.close();
	}

	private static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

	private static void printMatrix(int[][] matrix, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
