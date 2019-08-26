package com.exceptions;

public class Exception2 {

	public static void main(String[] args) {
		
		try {
			System.out.println("try");
		}
		/*catch(Throwable  e) {
			System.out.println(e);
		}*/
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(Throwable e) {
			System.out.println(e);
		}

	}

}
