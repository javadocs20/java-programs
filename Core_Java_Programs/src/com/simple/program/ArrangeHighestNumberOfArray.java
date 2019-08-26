package com.simple.program;

import java.util.*;
import java.util.Collections;

public class ArrangeHighestNumberOfArray {

	public static void main(String[] args) {
		// Converts into List from any arrays.
		// List<String> al1 =Arrays.asList(args);

		ArrayList<String> al = new ArrayList<>();
		al.add("10");
		al.add("68");
		al.add("75");
		al.add("7");
		al.add("21");
		al.add("12");

		Collections.sort(al, new Comparator<String>() {

			@Override
			public int compare(String x, String y) {

				String xy = x + y;
				String yx = y + x;
				return yx.compareTo(xy);
			}

		});

		al.forEach(System.out::println);
		System.out.println("***************************");
		StringBuffer sb = new StringBuffer();
		for (String str : al) {
			sb.append(str);
		}
		System.out.println(sb); //o/p===77568211210
	}

}
