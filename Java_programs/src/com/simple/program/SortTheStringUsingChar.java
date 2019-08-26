package com.simple.program;

import java.util.Arrays;

public class SortTheStringUsingChar {

	public static void main(String[] args) {

		String str = "pramod";
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		StringBuffer sb = new StringBuffer();
		for (char c : ch) {
			sb.append(c);
		}
		System.out.println(sb);
	}

}
