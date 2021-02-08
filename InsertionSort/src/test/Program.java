package test;

public class Program {
	public static void main(String[] args) {
		int arr[] = { 20, 50, 10, 30, 80, 40 };
		int j, temp;
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			for (j = i - 1; j >= 0 && arr[j] > temp; j--)
				arr[j + 1] = arr[j];
			arr[j + 1] = temp;
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
