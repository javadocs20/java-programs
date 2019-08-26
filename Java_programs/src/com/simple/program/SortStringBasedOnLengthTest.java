package com.simple.program;

import java.util.*;

public class SortStringBasedOnLengthTest {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		al.add("abc");
		al.add("abcde");
		al.add("aaa");
		al.add("abcd");
		
		Collections.sort(al, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				int l1=o1.length();
				int l2=o2.length();
				return o1.compareTo(o2);
			}
		});
		al.forEach(System.out::println);
	}

}
