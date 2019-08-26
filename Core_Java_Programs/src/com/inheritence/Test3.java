package com.inheritence;

class Super1 {
	int x = 10;
	int a = 20;

	public Super1() {

	}

	public Super1(int x, int a) {
		super();
		this.x = x;
		this.a = a;
	}

	public void m1() {
		System.out.println("x:::" + this.x);
		System.out.println("a:::" + this.a);
	}

}

class Super2 extends Super1 {

	int x = 30;
	int b = 40;

	public Super2() {

	}

	public Super2(int x, int b) {
		super();
		this.x = x;
		this.b = b;
	}
	public void m2() {
		System.out.println("x:::" + super.x);
		System.out.println("a:::" + super.a);
		System.out.println("x:::" + this.x);
		System.out.println("b:::" + this.b);
		super.m1();
	}
}

public class Test3 {

	public static void main(String[] args) {
		
		Super2 s2=new Super2();
		s2.m2();

	}

}
