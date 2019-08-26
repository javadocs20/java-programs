package com.simple.program;

public class StringReverseAllWords {

	public static void main(String[] args) {

		String str = "pramod is java expert";
		//String finalReverseString = "";
		StringBuffer sb=new StringBuffer();
		String[] strArray = str.split(" ");

		for (String strNew : strArray) {

			//finalReverseString = finalReverseString + reverseMe(strNew) + " ";
			sb.append(reverseMe(strNew)).append(" ");
		}

		//System.out.println(finalReverseString.trim());
		System.out.println(sb.toString().trim());
		
		System.out.println(str.substring(0, 0));
	}

	static String reverseMe(String str) {
		
		if(str==null || str.length()==0) {
			return "";
		}

		return str.charAt(str.length() - 1) + reverseMe(str.substring(0, str.length() - 1));
	}
}
