package com.collections;

import java.util.HashSet;

public class SortingSet {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<>();
		
		hs.add("pra");
		hs.add("dolly");
		
		hs.forEach(System.out::println);
		System.out.println("after sorting");
		hs.stream().sorted((s2,s1)-> s1.compareTo(s2)).forEach(System.out::println);
		
		

	}

}
