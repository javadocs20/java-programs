package com.wait.notify;

public class HelloThread implements Runnable {

	HiHello hiHello;
	
	HelloThread(HiHello obj){
		hiHello=obj;
	}
	
	public void run() {

		for (int i = 0; i < 3; i++) {
			hiHello.printHello();
		}
	}
}
