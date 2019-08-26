package com.simple.program;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap1 {

	public static void main(String[] args) {

		ConcurrentHashMap<String, Integer> chm = new ConcurrentHashMap<>();

		// if (key == null || value == null) throw new NullPointerException();
		chm.put(null, null);

		System.out.println(chm);

	}

}
