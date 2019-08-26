package com.exceptions;

public class Exception1 {

	public static void main(String[] args) {
		try {
			
			System.out.println("try");
			return;
			//throw new NullPointerException();
		} catch (Exception e) {
			System.out.println("catch");
			//throw new ArithmeticException();
			//return; Unreachable code
		}
		
		finally {
			System.out.println("finally");
			//throw new ArithmeticException();
			//return; //Unreachable code
		}
		
		//Any return; OR throw; inside catch() & finally make the below stmt unreachable
		
		System.out.println("after finally block");
	}

}
