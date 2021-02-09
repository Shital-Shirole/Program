package test;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter string : ");
		String str = sc.nextLine();
		str = str.replace(" ", "");
		System.out.println(str);
	}
}
