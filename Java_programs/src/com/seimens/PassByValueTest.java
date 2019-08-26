package com.seimens;

public class PassByValueTest {

	public static void main(String[] args) {

		int x = 1;
		int y = 2;
		
		Integer a=new Integer(1);
		Integer b=new Integer(2);

		//System.out.println("Before method call:: " + x + " --- " + y);
		
		System.out.println("Before method call:: " + a + " --- " + b);

		//modifyValue(x, y);
		
		modifyValue(a, b);

		//System.out.println("After method call:: " + x + " --- " + y);
		
		System.out.println("After method call:: " + a + " --- " + b);

	}

	/*private static void modifyValue(int x, int y) {
		x = 3;
		y = 4;

	}*/
	private static void modifyValue(Integer x, Integer y) {
		x = Integer.valueOf(3);
		y = Integer.valueOf(4);

	}

}
