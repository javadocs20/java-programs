package com.lamda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		Stream<String> stream=Stream.of("dolly","dolly1");
		List<String> list=stream.collect(Collectors.toList());
		list.forEach(System.out::println);

	}

}
