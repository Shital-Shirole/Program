package test;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int reverse = 0;
		int orig, digit;
		orig = num;
		while (num != 0) {
			digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}
		if (orig == reverse)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

	// String Palindrome
	public static void main1(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		boolean flag = true;
		int len = str.length();
		char[] strArr = str.toCharArray();
		for (int i = 0; i < len / 2; i++) {
			if (strArr[i] != strArr[len - i - 1]) {
				flag = false;
				break;
			}
		}
		if (flag == false)
			System.out.println("NOT Palindrom");
		else
			System.out.println("Palidrom");
	}
}
