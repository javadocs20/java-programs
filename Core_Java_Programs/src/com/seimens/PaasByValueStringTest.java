package com.seimens;

public class PaasByValueStringTest {

	public static void main(String[] args) {
		
		StringBuffer str=new StringBuffer("pramod");
		System.out.println("Before method call:: " +str);
		ModifyValue(str);
		System.out.println("After method call:: " +str);

	}

	private static void ModifyValue(StringBuffer str) {
		str=new StringBuffer("dolly");
		
	}

}
