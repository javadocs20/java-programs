package com.collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Test1 {

	public static void main(String[] args) {
		NavigableSet<Integer> ns= new TreeSet<>();
		ns.add(1);
		ns.add(2);
		ns.add(3);
		ns.add(4);
		ns.add(5);
						
		System.out.println(ns.headSet(3, false));  // o/p--> [1, 2]
		
		System.out.println(ns.tailSet(3, false)); // o/p--> [3, 4]
		
		System.out.println(ns.subSet(2, false, 4, false)); // o/p--> [3]
		
		System.out.println(ns.subSet(2, true, 4, true)); // o/p--> [2, 3, 4]
		
		System.out.println(ns.pollFirst()); // 1
		System.out.println(ns.pollLast()); // 5
		
		
		//print all element of TreeSet
		System.out.println("Printing all element of set:::");
		ns.forEach(i -> System.out.println(i));
	}

}
