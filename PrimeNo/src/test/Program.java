package test;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a no : ");
//		int num = sc.nextInt();
		for (int j = 2; j < 100; j++) {
			int n = j;
			boolean flag = true;
			for (int i = 2; i <= n / 2; i++) {
				if (j % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.println(j + " ");
		}
	}
}
