package com.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorTest {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("pramod");
		al.add("kumar");
		al.add("yadav");

		ListIterator<String> li = al.listIterator();
		while (li.hasNext()) {
			String str = li.next();
			if (str.equals("pramod")) {

				li.add(str.toUpperCase());
				li.add(str);
			//	li.remove(); java.lang.IllegalStateException
			}
			if (str.equals("kumar")) {
				li.remove();
			}
			System.out.println(str);
		}
		System.out.println(al);
	}

}
