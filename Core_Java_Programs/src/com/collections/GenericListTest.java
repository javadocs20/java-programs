package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

class MyGenericList<T> {

	private List<T> values = new ArrayList<>();

	public void add(T value) {
		values.add(value);
	}

	public void printAllValues(MyGenericList<T> value) {
		value.values.forEach(l -> System.out.println(l));
	}

}

public class GenericListTest {

	public static void main(String[] args) {
		/*
		 * MyGenericList<String> list=new MyGenericList<>(); list.add("p");
		 * list.printAllValues(list); MyGenericList<Integer> listInteger=new
		 * MyGenericList<>(); listInteger.add(1);
		 */

		HashMap<String, Integer> hs = new HashMap<>();
		hs.put("S", 1);
		hs.put("A", 2);
		
		Iterator<String> it=hs.keySet().iterator();
		while(it.hasNext()) {
			String x=it.next();
			int value=hs.get(x);
			System.out.println(value);
		}

	}

}
