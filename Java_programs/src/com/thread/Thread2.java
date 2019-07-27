package com.thread;

class MyThread extends Thread {

	static Thread mt;

	public void run() {

		for (int i = 0; i <= 3; i++) {

			try {
				mt.join();
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " :: " + i);
		}
	}
}

public class Thread2 {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
	//	MyThread t2 = new MyThread();
		MyThread.mt = Thread.currentThread();
		t1.start();

	/*	try {
			t1.join();
			t2.start();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		for (int i = 0; i <= 3; i++) {

			System.out.println(Thread.currentThread().getName() + " :: " + i);
		}
	}

}
