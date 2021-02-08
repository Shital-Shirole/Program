package test;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Program {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);

		Enumeration<Integer> e = v.elements();
		Integer element = null;
		Iterator<Integer> itr = v.iterator();

		while (e.hasMoreElements()) {
			element = e.nextElement();
			System.out.print(element + " ");
			if (element == 40)
				v.add(60); // OK
		}

		while (itr.hasNext()) {
			element = itr.next();
			System.out.println(element + " ");
			if (element == 30)
				v.add(50);
		}
	}
}
