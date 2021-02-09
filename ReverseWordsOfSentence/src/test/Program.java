package test;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		String str = sc.nextLine();
		String[] wordArray = str.split(" ");
		for (int i = 0; i < wordArray.length; i++) {
			char[] charArray = wordArray[wordArray.length - i - 1].toCharArray();
			for (int j = 0; j < charArray.length; j++) {
				System.out.print(charArray[j]);
			}
			System.out.println(" ");
		}
	}
}
