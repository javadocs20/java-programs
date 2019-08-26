package com.string;

public class String1 {

	public static void main(String[] args) {
		String a = "abc";
		String b = "PRAM";
		int m;

		int lenOfa = a.length();
		int lenOfb = b.length();
		String extraStr="";
		if (lenOfa < lenOfb) {
			m = lenOfa;
			extraStr = b.substring(lenOfa, lenOfb);
		} else if (lenOfa > lenOfb) {
			m = lenOfb;
			extraStr = a.substring(lenOfb, lenOfa);
		} else {
			m = lenOfa;
		}
		String finalStr = "";
		for (int i = 0; i < m; i++) {
			finalStr=finalStr+a.charAt(i)+b.charAt(i);
		}
		finalStr=finalStr+extraStr;
		
		System.out.println(finalStr);
		
	}

}
