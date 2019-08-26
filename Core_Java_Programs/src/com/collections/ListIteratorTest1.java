package com.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorTest1 {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(4);
		ListIterator<Integer> li = al.listIterator();
		
	
		while (li.hasNext()) {
			System.out.println(li.next());
			if (li.nextIndex() == 2) {
				li.remove();
			}
		}

		System.out.println(al);

	}

}
