package test;

import java.util.Arrays;
import java.util.HashSet;

public class Program {
	public static void main(String[] args) {
		int arr[] = { 20, 10, 20, 30, 50, 60, 40, 50, 20, 10, 30 };
		Arrays.sort(arr);
		int j = 0;
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j] = arr[i];
				j++;
			}
		}
		arr[j] = arr[arr.length - 1];
		for (int i = 0; i < j + 1; i++) {
			System.out.println(arr[i] + " ");
		}
		
		System.out.println("<--------------------------------OR----------------------------->");
		HashSet<Integer> hs = new HashSet<>();
		System.out.println();
		for (int i : arr) {
			hs.add(i);
		}
		System.out.println(hs);
	}
}
