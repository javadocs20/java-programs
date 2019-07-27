package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class Test2 {

	public static void main(String[] args) {
		WeakHashMap<Integer, String> whm = new WeakHashMap<>();
		whm.put(1, "P");
		whm.put(null, null);

		System.out.println(whm.containsKey(7));
		whm.forEach((key, value) -> System.out.println("Key::" + key + "  Value::: " + value));

		HashMap<Integer, String> hm = new HashMap<>();

		hm.put(1, "pramod");
		hm.put(2, "Dolly");

		// Different way to iterator and print Map items..

		// 1. Using Map.Entry class and Iterator

		Iterator<Map.Entry<Integer, String>> it = hm.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> entry=it.next();
			System.out.println("Key:: " + entry.getKey() + " Value:: "+  entry.getValue());
		}
		
		// 2. Using Java 8 freach method lamda and method ref.
		
		hm.forEach((k,v)-> System.out.println("Key:: " +k + " Value:: "+  v));
		
		//3. using keySet()
		
		Iterator<Integer> keySet=hm.keySet().iterator();
		while(keySet.hasNext()) {
			Integer key=keySet.next();
			System.out.println("Key:: " +key + " Value:: "+  hm.get(key));
		}
	}

}
