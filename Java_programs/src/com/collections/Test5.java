package com.collections;

import java.util.IdentityHashMap;
import java.util.WeakHashMap;

public class Test5 {

	public static void main(String[] args) {
		String str=new String("A");
		WeakHashMap<String, Integer> map = new WeakHashMap<>();
		map.put(str, 1);
		map.put("P", 20);
		str=null;
		System.gc();
		map.forEach((k,v)-> System.out.println(k +"  ::::   "+v));
		System.out.println("******************************");
		IdentityHashMap<String, Integer> ihm=new IdentityHashMap<>();
		ihm.put(str, 1);
		ihm.put("P", 20);
		
		ihm.forEach((k,v)-> System.out.println(k +"  ::::   "+v));
	}

}
