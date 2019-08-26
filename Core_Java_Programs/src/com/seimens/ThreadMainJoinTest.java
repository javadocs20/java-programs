package com.seimens;

public class ThreadMainJoinTest {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Starting Main");
		Thread.currentThread().join();
		System.out.println("completed Main");

	}

}
