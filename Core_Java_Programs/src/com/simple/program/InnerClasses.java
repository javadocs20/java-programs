package com.simple.program;

class Outer{
	
	private int x;
	static int y=5;
	
	public void m1() {
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("*************************");
		/*Inner inner=new Inner();
		inner.m2();*/
	}
	
	static class Inner{
		int y=100;
		public void m2() {
			Outer outer=new Outer();
			System.out.println(outer.x);
			System.out.println(y);
			class A{
				int z;
				
				public void m2() {
					System.out.println(z);
				}
			}
		}
	}
}

public class InnerClasses {

	public static void main(String[] args) {
		Outer outer=new Outer();
		outer.m1();
		
		Outer.Inner inner=new Outer.Inner();
		inner.m2();

	}

}
