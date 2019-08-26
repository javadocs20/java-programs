package com.collections;

import java.util.concurrent.atomic.AtomicInteger;

public class ProcessingThread implements Runnable {

	//private int count;
	
	private AtomicInteger count=new AtomicInteger();

	@Override
	public void run() {
		for (int i = 1; i < 5; i++) {
			processSomething(i);
			//count++;
			count.incrementAndGet();
		}

	}

	private void processSomething(int i) {
		// processing some job
		try {
			Thread.sleep(i * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public int getCount() {
		return count.get();
	}

}
