package com.simple.program;

import java.util.HashMap;

public class Map3 {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<>();

		hm.put("p", 1);
		hm.put("p1", 3);
		hm.put("p2", 4);
		System.out.println("*************************");
		System.out.println(hm);
		System.out.println("*************************");

		boolean flag = false;
		StringBuilder sb = new StringBuilder();

		for (String key : hm.keySet()) {

			if (hm.keySet().contains(key) && flag) {
				sb.append(".");
			}

			sb.append(key).append(":").append(hm.get(key));
			flag = true;
		}
		System.out.println("*************************");
		System.out.println(sb);
		System.out.println("*************************");

	}

}
