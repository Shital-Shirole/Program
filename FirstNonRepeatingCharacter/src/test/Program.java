package test;

import java.util.HashMap;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word : ");
		String word = sc.nextLine();
		HashMap<Character, Integer> hs = new HashMap<>();
		char[] wordArray = word.toCharArray();
		for (int i = 0; i < wordArray.length; i++) {
			if (!hs.containsKey(wordArray[i])) {
				hs.put(wordArray[i], 1);
			} else {
				int oldValue = hs.get(wordArray[i]);
				hs.put(wordArray[i], oldValue + 1);
			}
		}
		System.out.println(hs);
		for (int i = 0; i < wordArray.length; i++) {
			char c = wordArray[i];
			if (hs.get(c) == 1) {
				System.out.println("First non repeating  character : " + c);
				break;
			}
		}
		sc.close();
	}
}
