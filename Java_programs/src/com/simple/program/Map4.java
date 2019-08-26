package com.simple.program;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Map4 {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();
		HashSet<String> hs = new HashSet<>();
		hm.put(1, "pramod");
		hm.put(2, "pramod1");
		hm.put(3, "pramod");
		Iterator<Integer> it = hm.keySet().iterator();
		while (it.hasNext()) {
			String str = hm.get(it.next());
			if (!hs.add(str))
				System.out.println(str);

		}

	}

}
