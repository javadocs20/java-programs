package com.simple.program;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModificationExceTest {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);

		// Collections.sort(al, Collections.reverseOrder());
		Iterator<Integer> it = al.iterator();
		while (it.hasNext()) {

			System.out.println(it.next());
			//No Exceptions in below case
			//al.set(1, 0);
			//al.set(0, Integer.valueOf(4));
			
			
			//al.add(3);
			al.remove(0);
		//	it.remove();
		//	it.remove();
			
			
		}
		
		System.out.println(al);

	}

}
