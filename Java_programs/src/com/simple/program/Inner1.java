package com.simple.program;

class Outer1 {

	private int i = 20;
	static int x = 10;

	class Inner {

		int y = 30;
		private int z = 40;

		public void m1() {

			System.out.println(x);
			System.out.println(i);
			System.out.println(y);

			class InnerM1 {

				public void m1() {
					System.out.println("**************");
					System.out.println(x);
					System.out.println(i);
					System.out.println(y);
					System.out.println(z);
				}
			}
			InnerM1 im = new InnerM1();
			im.m1();
		}
	}
}

public class Inner1 {

	public static void main(String[] args) {

		Outer1.Inner inner = new Outer1().new Inner();
		inner.m1();

	}

}
