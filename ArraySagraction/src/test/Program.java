package test;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of ele : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter values: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] temp = new int[n];
		for (int i = 0, k = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				temp[n - 1] = 1;
				n--;
			} else if (arr[i] == 0) {
				temp[k] = 0;
				k++;
			}

		}
		for (int i : temp) {
			System.out.print(i + " ");
		}
		sc.close();
	}
}
