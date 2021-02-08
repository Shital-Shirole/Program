package test;

public class Program {
	public static void main(String[] args) {
		int arr[] = { 20, 50, 10, 30, 80, 40 };
		for (int i = 0; i < arr.length; i++) {
			int flag = 0;
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0)
				break;
		}
		for (int i : arr) {
			System.out.println(i + " ");
		}
	}
}
