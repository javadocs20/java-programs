package com.simple.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListOfStringSorting {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("tribhuvan");
		al.add("dolly");
		al.add("pramod");
		al.add("kumar");
		
		
		System.out.println("******Natural sorting::");
		//al.stream().sorted().forEach(System.out::println);
		Collections.sort(al);
		System.out.println(al.get(al.size()-1));
		al.forEach(System.out::println);
		
		
		
		al.forEach(System.out::println);
		
		System.out.println("******Reverse sorting::");
		al.stream().sorted((s1,s2)->(s2.compareTo(s1))).forEach(System.out::println);
		//System.out.println("******Reverse sorting::");
		//al.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		System.out.println("pramodtribhuvan".compareTo("tribhuvanpramod"));

	}

}
