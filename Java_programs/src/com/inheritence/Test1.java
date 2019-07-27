package com.inheritence;

class A2{
	
	A2(){
		System.out.println("A default constructor");
	}
	
	public void m1() {
		System.out.println("A classs");
	}
	
	private void m3() {
		System.out.println("A private classs");
	}
	
	public static void m4() {
		System.out.println("parent-class");
	}
}

class B2 extends A2{
	
	B2(){
		System.out.println("B default constructor");
	}
	public void m2() {
		System.out.println("B classs");
	}
	
	public static void m4() {
		System.out.println("child-class");
	}
}

public class Test1 {
	
	public static void main(String[] args) {
		
		A2 aObj=new B2();
		aObj.m1();
		
		
		B2 bobj=new B2();
		bobj.m4();
	}

}
