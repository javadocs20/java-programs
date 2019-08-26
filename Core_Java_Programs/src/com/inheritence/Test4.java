package com.inheritence;

class T4a{
	
	void m1() {
		
		System.out.println("T4a-m1");
	}
	
	void m2(int x,int y) {
		System.out.println("T4a-m2-->"+x);
	}
}

class T4b extends T4a{
	
	void m2(int x,int y) {
		System.out.println("T4b-m2-->"+ x +"::"+y);
		
	}
}

public class Test4 {

	public static void main(String[] args) {
		T4a o1=new T4b();
		o1.m1();
		o1.m2(10,5);
		System.out.println("***************************");
		T4b o2=new T4b();
		o2.m1();
		o2.m2(15,25);
		o2.m2(20, 30);
	}

}
