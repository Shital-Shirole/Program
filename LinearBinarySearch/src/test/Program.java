package test;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 10, 20, 30, 40, 50, 60 };

		System.out.println("Enter element to be searched : ");
		int element = sc.nextInt();

		Program.linearSearch(arr, element);
		Program.binarySearch(arr, element);
		System.out.println("Key found at + " + recBinarySearch(arr, 0, arr.length - 1, element));
		sc.close();
	}

	private static void linearSearch(int[] arr, int element) {
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				flag = 1;
				System.out.println("Element found at position " + i);
			}
		}
		if (flag == 0)
			System.out.println("Element not found");
	}

	private static void binarySearch(int[] arr, int element) {
		int left = 0, right = arr.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == element) {
				System.out.println("Element found at position " + mid);
				break;
			} else if (arr[mid] > element) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
	}

	private static int recBinarySearch(int[] arr, int left, int right, int key) {
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] > key) {
				return recBinarySearch(arr, left, right = mid - 1, key);
			} else {
				return recBinarySearch(arr, left = mid + 1, right, key);
			}
		}
		return -1;
	}
}
