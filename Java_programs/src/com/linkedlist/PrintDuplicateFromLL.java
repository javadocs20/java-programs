package com.linkedlist;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class PrintDuplicateFromLL {

	public static void main(String[] args) {

		Integer[] i = new Integer[] { 1, 2, 3, 1, 2 };

		List<Integer> al = Arrays.asList(i);

		al.forEach(System.out::println);

		System.out.println("*********************");
		//Step 1
		HashMap<Integer, Integer> hm = new HashMap<>();

		Iterator<Integer> it = al.iterator();
		while (it.hasNext()) {
			int x = it.next();
			if (!hm.containsKey(x)) {
				hm.put(x, 0);
			} else {
				hm.put(x, hm.get(x) + 1);
			}
		}
		System.out.println("Duplicate element List from list::");
		hm.forEach((key, value) -> {

			if (value > 0)
				System.out.println(key);
		});
		
		//Step 2
		System.out.println("Duplicate element List from list::");
		HashSet<Integer> hs=new HashSet<>();
		Iterator<Integer> it1 = al.iterator();
		while (it1.hasNext()) {
			int x = it1.next();
			if(hs.add(x)==false) {
				System.out.println(x);
			}
		}

		
		
		ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<>();
		chm.put(1, "P");
		chm.put(2, "P");
		chm.forEach(2, (k,v)-> System.out.println(k + "::::"+v +"  ---->"+Thread.currentThread().getName()));
		
	}

}
