package com.simple.program;

import java.util.HashMap;

public class Map1 {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<>();

		addKeyInMap("P", hm, 1);
		addKeyInMap("R", hm, 2);
		addKeyInMap("P", hm, 3);
		addKeyInMap("R", hm, 4);
		addKeyInMap("R", hm, 5);

		hm.forEach((k, v) -> System.out.println("Key::->" + k + " value::->" + v));

	}

	public static void addKeyInMap(String key, HashMap<String, Integer> hm, Integer value) {

		String mapKey = key;
		int count = 1;
		while (hm.containsKey(mapKey)) {

			value = hm.get(mapKey) + value;

			mapKey = key + "_" + count;

			count++;

		}

		hm.put(mapKey, value);

	}

}
