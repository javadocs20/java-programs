package com.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortingMap {

	public static void main(String[] args) {
		
		HashMap<Integer,String>  hm=new HashMap<>();
		
		hm.put(1, "P");
		hm.put(3, "R");
		hm.put(2, "A");
		System.out.println("*******************************");
		hm.forEach((k,v)->System.out.println (k +" :: "+v));
		System.out.println("*******************************");
		
		SortedMap<Integer,String>  tm=new TreeMap<>();
		
		tm.put(1, "P");
		tm.put(3, "R");
		tm.put(2, "A");
		
		System.out.println("***********TreeMap********************");
		hm.forEach((k,v)->System.out.println (k +" :: "+v));
		
		System.out.println("*******************************");
		
		LinkedHashMap<Integer,String> reverseSortedMap = new LinkedHashMap<>();
		
		tm.entrySet().stream().sorted(Map.Entry.<Integer,String>comparingByValue().reversed()).forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
		
		reverseSortedMap.forEach((k,v)->System.out.println (k +" :: "+v));
	}

}
