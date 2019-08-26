package com.simple.program;

class FinalT {

	private final int i = 10;
	 String str="p";

	public int getI() {
		return i;
	}
	
	public String getS() {
		return str+"jjk";
	}


	public void setI(int x) {
		System.out.println(i+x);
	}

}

public class FinalKeywordTesting {

	public static void main(String[] args) {
		FinalT f=new FinalT();
		f.setI(5);
		System.out.println(f.getI());
		
		System.out.println(f.getS());

	}

}
