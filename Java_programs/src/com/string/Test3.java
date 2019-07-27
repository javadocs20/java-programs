package com.string;

public class Test3 {

	public static void main(String[] args) {
		String rev = reverseMe("abc");
		System.out.println(rev);
		int no=addMe(5);
		System.out.println(no );
		
	}

	static String reverseMe(String s) {
		if (s.length() == 0)
			return "";
		return s.charAt(s.length() - 1) + reverseMe(s.substring(0, s.length() - 1));
	}
	
	static int addMe(int n) {
		if (n== 0)
			return 0;
		return n+addMe(n-1);
	}

}

