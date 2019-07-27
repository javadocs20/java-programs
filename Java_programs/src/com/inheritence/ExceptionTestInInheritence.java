package com.inheritence;

class Inheritence {

	public void m1() throws Exception {
		System.out.println("Inheritence-m1()");

	}
}

class InheritenceSub extends Inheritence {
	public void m1() throws NullPointerException{
		System.out.println("InheritenceSub-m1()");
	}
}

public class ExceptionTestInInheritence {

	public static void main(String[] args) {

	}

}
