package com.wait.notify;

public class HiThread implements Runnable {

	HiHello hiHello;

	HiThread(HiHello obj) {
		hiHello = obj;
	}

	public void run() {

		for (int i = 0; i < 3; i++) {
			hiHello.printHi();
		}
	}

}
