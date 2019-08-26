package com.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		al.add("pramod");
		al.add("pramod1");
		al.add("pramod2");
		al.add("pramod3");
		al.add("pramod");
		
		//1. using Stream filter() method.
		Stream<String> stream=al.stream().filter(p-> p.equals("pramod"));
		//stream.forEach(System.out::println);
		
		//2. Using Stream to collect values in list.
		List<String> filterList=stream.collect(Collectors.toList());
		System.out.println(filterList.size());
		
		String str="ab4";
		System.out.println(str.chars().allMatch(Character::isLetterOrDigit));
		
		ArrayList<Integer> al1=new ArrayList<>();
		al1.add(2);
		al1.add(3);
		al1.add(1);
		al1.stream().forEach(System.out::println);
		
		
	}

}
