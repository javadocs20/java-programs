package com.lamda;

import java.util.Map;
import java.util.WeakHashMap;

public class Collection {

	public static void main(String[] args) {
		Map<String, String> map = new WeakHashMap<>();
		map.put("1", "Pramod");
		map.put("2", "Pramod");
		map.put("3", "Pramod");

		// 1. Iterate map using Map.Entry class
		for (Map.Entry<String, String> entry : map.entrySet()) {

			// System.out.println("Key:::"+entry.getKey() + " Value:::"+entry.getValue());
		}

		// 2. using lamda

		map.forEach((k, v) -> System.out.println("Key:::" + k + " Value:::" + v));

	}

}
