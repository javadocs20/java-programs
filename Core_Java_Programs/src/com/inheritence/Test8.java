package com.inheritence;

public class Test8 {

	public static void main(String[] args) {
		//m1(Integer.valueOf(1));
		//m1(1);
	}

	static void m1(int...x ) {

		System.out.println("int... x");
	}

	static void m1(Integer... x) {
		System.out.println("Integer... x");
	}
}
