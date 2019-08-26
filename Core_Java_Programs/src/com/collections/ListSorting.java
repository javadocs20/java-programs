package com.collections;

import java.util.Arrays;
import java.util.*;

public class ListSorting {

	public static void main(String[] args) {
		
		Integer[] it= {2,4,1,7,5};
		
		//Sorting using Arrays utitly class.
		
		Arrays.sort(it);
		
		for(int i : it) {
		System.out.println(i);
		}
		
		List<Integer> list=Arrays.asList(it);
		
		System.out.println("******************************");
		
		list.sort(new Comparator<Integer>() {
			public int compare(Integer i1,Integer i2) {
				return i1.compareTo(i2);
			}
		});
		
		System.out.println(list);
		
		System.out.println("******************************");
		list.sort((i1,i2)-> i2.compareTo(i1));
		
		System.out.println(list);
		System.out.println("******************************");
		
		list.stream().sorted((i1,i2)-> i2.compareTo(i1)).forEach(System.out::println);
		
		
		
		

	}

}
