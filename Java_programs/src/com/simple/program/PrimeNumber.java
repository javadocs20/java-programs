package com.simple.program;

public class PrimeNumber {

	int n;

	boolean tFlag = false;

	public PrimeNumber() {

	}

	public synchronized void generatePrime(int i) {
		if (tFlag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int flag = 0;
		for (int j = 2; j <= i / 2; j++) {
			if (i % j == 0) {
				flag = 1;
				break;
			}
		}

		if (flag == 0) {
			System.out.println(Thread.currentThread().getName() + " : " + "generated prime number" + " : " + i);
			n = i;
			tFlag = true;
		}
		
		notify();
	}

	public synchronized void printPrime() {

		if (!tFlag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		tFlag = false;
		System.out.println(Thread.currentThread().getName() + " printed generated prime number" + " : " + n);
		notify();

	}
}
