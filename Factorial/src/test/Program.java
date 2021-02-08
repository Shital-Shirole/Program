package test;

import java.util.Scanner;

public class Program {
	static int fact = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();

		// non recursive way
//		int i = 1;
//		while (i <= num) {
//			if (i < num)
//				System.out.println(i + " * ");
//			else
//				System.out.println(i + " : ");
//			fact = fact * i;
//			i++;
//		}

		// recursive
		factorial(num);
		System.out.println(fact);
		sc.close();
	}

	private static int factorial(int num) {
		if (num != 0) {
			fact = fact * num;
			return factorial(num - 1);
		}
		return 1;
	}
}
