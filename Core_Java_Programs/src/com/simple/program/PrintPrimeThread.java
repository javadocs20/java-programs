package com.simple.program;

public class PrintPrimeThread implements Runnable {
	
	PrimeNumber primeNumber=null;

	public PrintPrimeThread(PrimeNumber primeNumber) {
		this.primeNumber=primeNumber;
	}

	@Override
	public void run() {
		for (int i=2;i<20;i++) {
		primeNumber.printPrime();
		}

	}

}
