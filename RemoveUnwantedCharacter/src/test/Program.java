package test;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		System.out.println("Enter character to be removed : ");
		String remove = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		char[] strArray = str.toCharArray();
		char[] removeArray = remove.toCharArray();
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i] != removeArray[0]) {
				sb.append(strArray[i]);
			}
		}
		System.out.println(sb);
	}
}
