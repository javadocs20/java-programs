package com.simple.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ListProgram {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);

		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(1);
		al1.add(2);
		al1.add(3);

		//System.out.println(al.retainAll(al1));

		Comparator<Integer> com = Collections.reverseOrder();

		Collections.sort(al1, com);

		System.out.println(al1);
		
		for(Integer it:al) {
			
			System.out.println(it);
			al1.remove(0);
		}
		System.out.println(al1);
		Iterator<Integer> it=al1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); 
			al1.remove(0);
		}

	}

}
