package test;

public class Program {
	public static void main(String[] args) {
		int[] arr = { 20, 30, 50, 10, 15, 60, 5 };
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("Minimum element is : " + min);
	}
}
