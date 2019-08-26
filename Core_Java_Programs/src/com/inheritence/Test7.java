package com.inheritence;

class Atest{
	
	Atest(){
		System.out.println("Default constructor");
	}
	static {
		System.out.println("Inside Static block");
	}
	
	{
		System.out.println("Inside Instance block");
	}
}

public class Test7 {
	
	//static final 
	static final Atest obj=new Atest();
	
	
	static {
		System.out.println("Inside Test2 Static block");
	}

	public static void main(String[] args) {
		
		System.out.println("main is started");
		
		//Test2 obj=new Test2();
		
		System.out.println("main is ended");
	}

}
