package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Program {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("<-------------------------------------------------------->");
		ListIterator<Integer> listItr = list.listIterator();
		while (listItr.hasNext()) {
			System.out.println(listItr.next() + " ");
		}
		System.out.println("<-------------------------------------------------------->");
		list.forEach(element ->{
			System.out.println(element);
		});
	}
}
