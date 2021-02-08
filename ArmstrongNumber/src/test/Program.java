package test;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int sum = 0, digit=0,orig;
		orig = num;
		while(num != 0)
		{
			digit = num % 10;
			//sum = sum + (digit * digit * digit);
			sum = (int) (sum + Math.pow(digit, 3));
			num = num/10;
		}
		if(orig == sum)
			System.out.println(orig + " is a ArmStrong number");
		else
			System.out.println(orig + " is not a ArmStrong number");
		sc.close();
	}
}
