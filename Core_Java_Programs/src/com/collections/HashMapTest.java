package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest extends Thread {

	static HashMap<Integer, String> hm = new HashMap<>();

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() +"is adding element in Map:::");

		hm.put(3, "guddu");
	}

	public static void main(String[] args) throws InterruptedException {

		hm.put(1, "pramod");
		hm.put(2, "dolly");

		HashMapTest t1 = new HashMapTest();
		t1.start();

		// Iterating Map
		Iterator<Entry<Integer, String>> it = hm.entrySet().iterator();
		//t1.start();

		while (it.hasNext()) {
			Entry<Integer, String> entry = it.next();
			System.out.println(Thread.currentThread().getName() + entry.getKey() + " --:::-- " + entry.getValue());
			Thread.sleep(2000);

		}
		
	

	}

}
