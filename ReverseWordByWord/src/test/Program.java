package test;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word : ");
		String str = sc.nextLine();

		String [] word = str.split(" ");
		String reverse = "";
		for(int i = word.length-1; i>=0; i--)
		{
			reverse = reverse + word[i] + " ";
		}
		System.out.println(reverse);
	}
	//String Reverse
	public static void main1(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word : ");
		String str = sc.nextLine();

		char [] word = str.toCharArray();
		for (int i = 0; i < word.length; i++) {
			System.out.print(word[i]);
		}
		System.out.println();
		for(int i = 0; i< word.length/2; i++)
		{
			char temp = word[i];
			word[i] = word[word.length-i-1];
			word[word.length-i-1] = temp;
		}
		for (int i = 0; i < word.length; i++) {
			System.out.print(word[i]);
		}
	}
}
