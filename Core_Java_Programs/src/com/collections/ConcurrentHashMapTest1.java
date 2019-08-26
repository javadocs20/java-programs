package com.collections;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentHashMapTest1 implements Runnable{
	
	static ConcurrentHashMap<Integer, String> chm=new ConcurrentHashMap<>();
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() +"is adding element in Map:::");
		
		chm.put(3, "guddu");
	}

	public static void main(String[] args) throws InterruptedException {
		
		chm.put(1, "pramod");
		chm.put(2, "dolly");
		
		ConcurrentHashMapTest1 chmt=new ConcurrentHashMapTest1();
		
		ExecutorService es=Executors.newSingleThreadExecutor();
		es.execute(chmt);
		es.shutdown();
		//Iterating Map 
		Iterator<Entry<Integer, String>>it=chm.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry<Integer, String> entry=it.next();
			System.out.println(entry.getKey() +" --:::-- "+entry.getValue());
			Thread.sleep(2000);
		}
		

	}

	

}
