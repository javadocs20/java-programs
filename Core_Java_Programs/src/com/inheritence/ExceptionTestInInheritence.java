package com.inheritence;

import java.sql.SQLException;

class Inheritence {

	public void m1() throws NullPointerException {
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
		
		Inheritence inheritence=new InheritenceSub();
		try {
			inheritence.m1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
