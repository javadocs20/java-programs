package com.inheritence;

class Be1 {

	void eat() {
		System.out.println("Be1-eat");
	}
	
	public void m1() {
		System.out.println("Be1-m1");
	}
}

class Be2 extends Be1 {
	void eat() {
		System.out.println("Be2-eat");
	}
	
	public void m2() {
		System.out.println("Be2-m2");
	}
}

public class Test1 {

	public static void main(String[] args) {
		
		Be1 obj=new Be2();
		obj.eat();
		obj.m1();
		
		Be2 obj1=new Be2();
		obj1.m1();
		obj1.m2();
		obj.eat();
		
	}

}
