package com.seimens;

public class ThreadTest extends Thread {
	
	@Override
	public void run() {
		System.out.println("test run");
	}

	public static void main(String[] args) {
		
		System.out.println("Starting Main");
		Thread t=Thread.currentThread(); 
		// Main thread is already started by JVM. So we can not start explicitly.
		t.start();
		System.out.println("completed Main");
	}

}
