package com.inheritence;

interface I1{
	public void m1();
}

interface I2{
	public void m1();
}


public class Test2 implements I1,I2{

	public static void main(String[] args) {
		I1 i1=new Test2();
		i1.m1();

	}

	@Override
	public void m1() {
		System.out.println("Impl-m1");
		
	}

}
