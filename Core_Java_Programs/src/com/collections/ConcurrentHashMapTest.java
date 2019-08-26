package com.collections;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {

	public static void main(String[] args) {
		
		ConcurrentHashMap<Integer, String> chm=new ConcurrentHashMap<>();
		chm.put(1, "pramod");
		chm.put(2, "dolly");
		
		//Iterating Map 
		Iterator<Entry<Integer, String>>it=chm.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry<Integer, String> entry=it.next();
			System.out.println(entry.getKey() +" --:::-- "+entry.getValue());
			chm.put(3, "sangita");
		}
		
		

	}

}
