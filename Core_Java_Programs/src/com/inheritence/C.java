package com.inheritence;

class A1 {
	A1() {

	}

	public void m1() throws Exception {
		System.out.println("A1--m1");
		try {
			m2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// this method only can call inside class member variable , not with the object
	// of same class OR using dynamic dispatch
	private void m2() throws Exception {
		System.out.println("A1--m2");
	}
}

class B1 extends A1 {

	public void m1() throws Exception {
		System.out.println("B1--m1");
	}
}

public class C {

	public static void main(String[] args) throws Exception {

		A1 aobj = new A1();
		aobj.m1();

	}

}
