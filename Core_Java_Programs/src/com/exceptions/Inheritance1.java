package com.exceptions;

class H1{
	public void m1() {
		System.out.println("m1");
	}
	
	public void m2(int i) {
		System.out.println("m2");
	}
}

class H2 extends H1{
	
	public void m2() {
		System.out.println("m1");
	}
}
public class Inheritance1 {

	public static void main(String[] args) {
		
		
		H2 h=new H2();
		h.m1();
		h.m2();
		
		H1 h1=new H2();
		h1.m1();
		h1.m2(5);
	

	}

}
