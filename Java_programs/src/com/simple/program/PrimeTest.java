package com.simple.program;

public class PrimeTest {

	public static void main(String[] args) {
		PrimeNumber pm = new PrimeNumber();

		GeneratePrimeThread gpt = new GeneratePrimeThread(pm);
		PrintPrimeThread ppt = new PrintPrimeThread(pm);
		Thread t1 = new Thread(gpt);
		Thread t2 = new Thread(ppt);
		t1.start();
		t2.start();
}

}
