package com.thread;

public class Tread1 implements Runnable {
	
	static Object lock=new Object();
	
	public void run() {
		int count = 1;
		while (count <= 5) {

			synchronized (lock) {

				try {
					lock.wait();
					System.out.println(Thread.currentThread().getName() + " is released lock");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + " is waiting");
				System.out.println(Thread.currentThread().getName() + count);
				count++;
				lock.notifyAll();
			}
			
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		Tread1 tt1 = new Tread1();
		Tread1 tt2 = new Tread1();

		Thread t1 = new Thread(tt1);
		Thread t2 = new Thread(tt2);

		t1.start();
		t2.start();

		
		 //t1.join(); 
		// t2.join();
		 

	}
}
