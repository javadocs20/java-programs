package com.simple.program;

import java.util.HashMap;

public class Map2 {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<>();

		hm.put(addKeyInMap("P", hm), 1);
		hm.put(addKeyInMap("R", hm), 2);
		hm.put(addKeyInMap("P", hm), 3);
		hm.put(addKeyInMap("R", hm), 7);
		hm.put(addKeyInMap("R", hm), 7);
		hm.forEach((k, v) -> System.out.println("Key::->" + k + " value::->" + v));

	}

	public static String addKeyInMap(String key, HashMap<String, Integer> hm) {

		String mapKey = key;
		int count = 1;
		while (hm.containsKey(mapKey)) {

			mapKey = key + "_" + count;

			count++;

		}

		return mapKey;

	}
}
