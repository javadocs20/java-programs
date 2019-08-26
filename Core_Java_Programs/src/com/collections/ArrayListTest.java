package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest extends Thread{
	
static ArrayList<Integer> hm=new ArrayList<>();
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is adding  :: ");
		try {
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hm.add(3);
	}

	public static void main(String[] args) throws InterruptedException {
		
		hm.add(1);
		hm.add(2);
		
		ArrayListTest t1=new ArrayListTest();
		//t1.start();
	
		//Iterating Map 
		Iterator<Integer>it=hm.iterator();
		t1.start();
		while(it.hasNext()) {
			
			System.out.println(Thread.currentThread().getName() + " is printing  :: "+ it.next());
			Thread.sleep(2000);
		//	hm.add(4);
			
		}
		

	}

}
