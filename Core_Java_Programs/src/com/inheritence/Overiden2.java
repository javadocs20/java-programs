package com.inheritence;

class Prson{
	
	public void m1() throws Exception{
		System.out.println("Prson class-m1");
	}
	
	public static void sMethod() {
		System.out.println("Prson class-sMethod");
	}
}

class prson1 extends Prson{
	
	public void m1() throws NullPointerException{
		System.out.println("Prson1 class-m1");
	}
	
	public void m2() {
		System.out.println("Prson1 class-m2");
	}
	
	/*public static void sMethod() {
		System.out.println("Prson1 class-sMethod");
	}*/
}
public class Overiden2 {

	public static void main(String[] args) throws Exception{
		
		Prson pson=new prson1();
		pson.m1();
		//pson.m2(); The method m2() is undefined for the type Prson
		pson.sMethod();
		//pson.m2(); super class not aware of subclass newly added method
		System.out.println("***************************");
		prson1 pson1=new prson1();
		pson1.m1();
		pson1.m2();
		pson1.sMethod();
	}

}
