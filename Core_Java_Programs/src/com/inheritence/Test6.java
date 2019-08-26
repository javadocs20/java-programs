package com.inheritence;

class At{
	
	At(){
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

class Bt extends At{
	
	Bt(){
		System.out.println("B default constructor");
	}
	public void m2() {
		System.out.println("B classs");
	}
	
	public static void m4() {
		System.out.println("child-class");
	}
}

public class Test6 {
	
	public static void main(String[] args) {
		
		At aObj=new Bt();
		aObj.m1();
		
		
		Bt bobj=new Bt();
		bobj.m4();
	}

}
