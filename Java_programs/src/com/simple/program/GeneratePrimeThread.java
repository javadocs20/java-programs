package com.simple.program;

public class GeneratePrimeThread implements Runnable {
	PrimeNumber primeNumber=null;

	public GeneratePrimeThread(PrimeNumber primeNumber) {
		this.primeNumber=primeNumber;
	}
	@Override
	public void run() {
		
		for (int i=2;i<=20;i++) {
			primeNumber.generatePrime(i);
		}
		
		
	}

}
