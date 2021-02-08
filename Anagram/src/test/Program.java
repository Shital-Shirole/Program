package test;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st string : ");
		String str1 = sc.nextLine();
		System.out.println("Enter 2st string : ");
        String str2 = sc.nextLine();
        
        str1 = str1.replace(" ", "").toLowerCase();
        str2 = str2.replace(" ", "").toLowerCase();
        
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        str1 = new String(arr1);
        str2 = new String(arr2);
        
        if(str1.equals(str2))
        	System.out.println("ANAGRAM");
        else
        	System.out.println("NOT ANAGRAM"); 
        sc.close();
	}
}
