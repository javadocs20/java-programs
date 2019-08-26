package com.simple.program;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> tm=new TreeMap<>();
		tm.put(2, null);
		tm.put(1, "P");
		
		Iterator<Entry<Integer, String>> it=tm.entrySet().iterator();
		while(it.hasNext()) {
			Entry<Integer, String> entry=it.next();
			System.out.println(entry.getKey()+"::::"+entry.getValue());
		}

	}

}
