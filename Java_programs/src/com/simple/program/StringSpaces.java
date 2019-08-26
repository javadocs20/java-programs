package com.simple.program;

import java.util.HashSet;

public class StringSpaces {

	public static void main(String[] args) {
		String str="I amm       pramod";
		
		//str=str.replaceAll("\\s", "");
		String[] str2=str.split("\\s");
		StringBuffer sb=new StringBuffer();
		for(String str3:str2) {
			if(str3.length()>0)
				sb.append(str3).append(" ");
		}
		System.out.println(sb.toString().trim());
		//System.out.println(str);
		
		
		System.out.println("Print repeted char from string");
		
		String str1="praamodd";
		char[] allChar=str1.toCharArray();
		HashSet<Character> hs=new HashSet<>();
		for(char c: allChar) {
			boolean flag=hs.add(c);
			if(!flag) {
				System.out.println(c);
			}
		}

	}

}
