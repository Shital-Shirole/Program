package test;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows,cols for 1st matrix : ");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		int[][] first = new int[r1][c1];
		System.out.println("Enter values for 1st matrix : ");
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++)
				first[i][j] = sc.nextInt();
		}

		System.out.println("Enter rows,cols for 2st matrix : ");
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		int[][] second = new int[r2][c2];
		System.out.println("Enter values for 2nd matrix : ");
		for (int i = 0; i < r2; i++) {
			for (int j = 0; j < c2; j++)
				second[i][j] = sc.nextInt();
		}
		System.out.println("First Matrix");
		Program.printMatrix(first, r1, c1);
		System.out.println("Second Matrix");
		Program.printMatrix(second, r2, c2);

		int sum = 0;
		if (c1 != c2) {
			System.out.println("multiplication can't be possible");
		} else {
			int mult[][] = new int[r1][c2];
			for (int loop1 = 0; loop1 < r1; loop1++) {
				for (int loop2 = 0; loop2 < c2; loop2++) {
					for (int loop3 = 0; loop3 < c1; loop3++)// OR loop3<r2
					{
						sum = sum + first[loop1][loop3] * second[loop3][loop2];
					}
					mult[loop1][loop2] = sum;
				}
			}
			System.out.println("***********************************Multi Matrix***********************************");
			Program.printMatrix(mult, r1, c2);

		}
		sc.close();
	}

	private static void printMatrix(int[][] matrix, int rows, int cols) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++)
				System.out.print(matrix[i][j] + "   ");
			System.out.println();
		}
	}
}
