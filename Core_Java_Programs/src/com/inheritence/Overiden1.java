package com.inheritence;

class Sample {

	public void m1() {
		System.out.println("Sample class method");
	}
}

class Sample1 extends Sample {

	public final void m1(){
		System.out.println("Sample1 class method");
	}
}

public class Overiden1 {

	public static void main(String[] args){
		
		Sample s=new Sample1();
		s.m1();
		
		String str="abbdb m,mklk    jk";
		
		str=str.replaceAll("\\s", "");
		System.out.println(str);
		
		String finalStr="";
		
		for(int i=0;i<str.length();i++) {
			
			char c=str.charAt(i);
			if (!String.valueOf(c).equals(" ")) {
				finalStr=finalStr+c;
		
			}

	}
		System.out.println(finalStr);
}
}
