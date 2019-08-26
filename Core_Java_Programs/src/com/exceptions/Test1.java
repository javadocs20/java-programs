package com.exceptions;

public class Test1 {

	public static void main(String[] args) {

		Test1 t1 = new Test1();
	//	t1.m1(null);

	}

	public void m1(String str) {
		System.out.println("String :" + str);

	}

	public void m1(Object obj) {
		System.out.println(obj);

	}

	public void m1(StringBuffer obj) {
		System.out.println(obj);

	}
}
