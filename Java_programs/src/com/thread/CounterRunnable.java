package com.thread;

import static com.util.ThreadUtilities.randomSleep;

public class CounterRunnable implements Runnable {
	private int counter = 0;	
	{
		System.out.println("Object created: CounterRunnable");
	}
	
	public int increAndGet(){
		randomSleep(); // Sleep(Random)
		return counter = counter + 1;
	}
		
	public void run(){ // Task // Running
		Thread thisThread = Thread.currentThread();
		String threadName = thisThread.getName();
		for(int i=0; i<5; i++)
			System.out.println(threadName+": "+increAndGet());
	} // Dead
	
	public static void main(String[] args) {
		CounterRunnable counter = new CounterRunnable();
		
		Thread counter1 = new Thread(counter); // Worker1 // New
		Thread counter2 = new Thread(counter); // Worker2 // New
		Thread counter3 = new Thread(counter); // Worker3 // New
		
		System.out.println("After Creating Object:");
		System.out.println("counter1: "+counter1.getState());
		System.out.println("counter2: "+counter2.getState());
		System.out.println("counter3: "+counter3.getState());
		
		counter1.start(); // Runnable
		counter2.start(); // Runnable
		counter3.start(); // Runnable
		
		System.out.println("After Calling start:");
		System.out.println("counter1: "+counter1.getState());
		System.out.println("counter2: "+counter2.getState());
		System.out.println("counter3: "+counter3.getState());
		
		try {
			counter1.join();
			counter2.join();			
			counter3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("After join :");
		System.out.println("counter1: "+counter1.getState());
		System.out.println("counter2: "+counter2.getState());
		System.out.println("counter3: "+counter3.getState());
		
		String main = Thread.currentThread().getName();
		System.out.println("Which thread main() runs within?"+" "+main);
	}
	
}
