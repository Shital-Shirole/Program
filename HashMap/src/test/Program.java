package test;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;

public class Program {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Shital");
		hm.put(2, "Kisan");
		hm.put(3, "Shirole");

		HashMap<Integer, String> hm2 = new HashMap<>();
		hm2.put(1, "Shital");
		hm2.put(2, "Kisan");
		hm2.put(3, "Shirole");

		System.out.println(hm.equals(hm2));

		for (Entry<Integer, String> e : hm.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue() + " " + e.hashCode());
		}

		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(1, "ABV");
		ht.put(2, "XYZ");
		ht.put(3, "ACF");
		Enumeration<String> e = ht.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
