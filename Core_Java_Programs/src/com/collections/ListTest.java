package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {

	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<>();
		ls.add(5);
		ls.add(4);
		ls.add(3);

		// ls.stream().sorted((i1,i2)-> i1.compareTo(i2)).forEach(System.out::println);
		// System.out.println(ls.stream().findFirst().get().intValue());
		// ls.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		ListIterator<Integer> li = ls.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());

			li.add(10); // This is fine. Since using ListIterator add() method.
			// ls.add(50); // In this case using List add() method. so it will throw CCME
			// Runtime.
		}
		// li.add(20);

		System.out.println(ls);

	}

}
