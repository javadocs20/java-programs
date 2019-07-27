package com.executor;

import static com.util.ThreadUtilities.randomSleep;

public class CounterRunnable implements Runnable {
	private int counter = 0;
	private String objName;
	{
		System.out.println("Object created: CounterRunnable");
	}
	
	public CounterRunnable(String name){
		objName = name;
	}
	
	public int increAndGet(){
		randomSleep();
		return ++counter;
	}
		
	public void run(){
		Thread thisThread = Thread.currentThread();
		String threadName = thisThread.getName();
		for(int i=0; i<5; i++)
			System.out.println(objName+ "|"+threadName+": "+increAndGet());
	}
}
