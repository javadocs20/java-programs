package com.thread;

import com.util.ThreadUtilities;

public class CounterThread extends Thread {
	private int counter = 0;
	{
		System.out.println("Object created: CounterRunnable");
	}

	public int increAndGet() {
		ThreadUtilities.randomSleep();
		return ++counter;
	}

	public void run() { // Running
		for (int i = 0; i < 5; i++) {
			System.out.println(getName() + ": " + increAndGet());
		}
		System.out.println("Main is alive? " + CounterThread.main.isAlive());
	}

	private static Thread main;

	public static void main(String[] args) {
		main = Thread.currentThread();

		CounterThread counter1 = new CounterThread(); // New
		CounterThread counter2 = new CounterThread();
		CounterThread counter3 = new CounterThread();

		counter1.start(); // Runnable
		// System.out.println("counter1 state: "+counter1.getState());
		counter2.start();
		counter3.start();

		String main = Thread.currentThread().getName();
		System.out.println("Which thread main() runs within?" + " " + main);
		System.out.println("Main is alive? from main: " + CounterThread.main.isAlive());

	}
}
