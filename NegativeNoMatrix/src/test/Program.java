package test;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows and cols : ");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int[][] matrix = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			System.out.println("Enter row " + i);
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("Your Matrix  :  ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}
		int[][] negativeNoCnt = new int[rows][2];
		int k = 0;
		for (int i = 0; i < rows; i++) {
			int count = 0;
			for (int j = 0; j < cols; j++) {
				if (matrix[i][j] < 0) {
					count++;
				}
				negativeNoCnt[i][k] = i;
				negativeNoCnt[i][k + 1] = count;
			}
			System.out.println();
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(negativeNoCnt[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
