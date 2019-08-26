package com.exceptions;

class Test {

	public void m1() throws Exception {
		try {
			
			System.out.println("In try block");
			int x=10/0;
			 throw new ArithmeticException();
		} catch (Exception e) {
			System.out.println("In catch block");
			//System.out.println(e);
			throw new ArithmeticException();
		} finally {
			System.out.println("In finally block");
			throw new Exception();
		}
		//System.out.println("before closing ending brace of the class");
	}
}

public class Excption3 {

	public static void main(String[] args) throws Exception {
		Test t=new Test();
		t.m1();
		//test();
		
	}
	private static void test(){
		  try{
		   System.out.println("In try");
		   throw new ArithmeticException();
		  } catch(Exception e){
		   System.out.println("In catch");
		   throw new ArrayIndexOutOfBoundsException();
		  } finally{
		   System.out.println("In finally");
		   throw new NullPointerException();
		  }
		 }
}
