package com.simple.program;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringLastUpperCaseCharFind {

	public static void main(String[] args) {

		String str = "PramOd";
		Pattern p = Pattern.compile("[A-Z]");
		Matcher m = p.matcher(str);
		// String finalstr="";
		int lastIndex = 0;
		while (m.find()) {
			// finalstr=finalstr+str.charAt(m.start());
			lastIndex = m.start();

		}
		// System.out.println(finalstr.charAt(finalstr.length()-1));

		System.out.println(str.charAt(lastIndex));

		String str1 = "String    With Multiple      Spaces. ";
		StringTokenizer st = new StringTokenizer(str1, " ");
		StringBuffer sb = new StringBuffer();
		while (st.hasMoreElements()) {
			sb.append(st.nextElement()).append(" ");
		}
		System.out.println(sb.toString().trim());

		StringBuffer sb1 = new StringBuffer();
		sb1.append('A').append('B');
		System.out.println(sb1.charAt(0));

	}

}
