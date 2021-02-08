package test;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two nos : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int x = num1, y = num2;
		while (x != y) {
			if (x > y)
				x = x - y;
			else
				y = y - x;
		}
		int lcm = num1 * num2 / x;
		System.out.println("HCF : " + x);
		System.out.println("LCM : " + lcm);
		sc.close();
	}
}
