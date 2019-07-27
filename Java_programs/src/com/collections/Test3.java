package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test3 {

	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		
		Stream<Integer> sequentialStream = ls.stream();
		Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p < 4);
		highNumsSeq.forEach(System.out::println);
		
		ls.forEach(p -> System.out.println(p));

	}

}
