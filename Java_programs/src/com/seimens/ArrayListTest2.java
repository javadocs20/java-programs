package com.seimens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ArrayListTest2 {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();

		al.add(1);
		al.add(2);
		al.add(3);
		al.add(1);
		al.add(3);

		ArrayList<Integer> al1 = new ArrayList<>();

		al1.add(1);
		al1.add(2);
		al1.add(3);
		System.out.println(al.retainAll(al1)); // TRUE if collections are same, else return FALSE

		String str = "abca";

		System.out.println(str.indexOf('a'));

		System.out.println("Finding duplicate in list");
		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int a : al) {
			hm.put(a, Collections.frequency(al, a));
		}

		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {

			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
		System.out.println("finding duplicate using for loop");
		int[] a = { 1, 2, 3, 4, 5, 1, 2 };

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i+1; j < a.length; j++) {

				if (a[i] == a[j]) {
					count++;
				}

			}
			if (count >= 1) {
				System.out.println(a[i]);
				
			}
		}
	}

}
