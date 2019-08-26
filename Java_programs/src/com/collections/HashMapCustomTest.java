package com.collections;

public class HashMapCustomTest {

	public static void main(String[] args) {

		HashMapCustom<Integer,String> hm=new HashMapCustom<>();
		hm.put(11, "Pramod");
		hm.put(121, "RAM");
		hm.put(121, "dolly");
		hm.display();

	}

}
