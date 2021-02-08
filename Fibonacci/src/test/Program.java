package test;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, i;
		int prev = 0;
		int next = 1;
		int sum;
		System.out.println("Enter value of num : ");
		num = sc.nextInt();
		System.out.println(next);
		//non recursive
//		for (i = 0; i < num; i++) {
//			sum = prev + next;
//			System.out.println(sum);
//			prev = next;
//			next = sum;
//		}
		//recursive
		fibonaciSeries(prev, next, num);
		sc.close();
	}
	private static void fibonaciSeries(int prev, int next, int num)
	{
		if( num==0 )
			return;
		System.out.println(prev + next + " ");
		fibonaciSeries(next, prev+next,num=num-1);
	}
}
