package com.simple.program;

import java.util.Arrays;

public class AnagramProgram {

	public static void main(String[] args) {
		String str1="abcf";
		String str2="bac";
		int len1=str1.length();
		int len2=str2.length();
		if(len1!=len2) {
			System.out.println(">>>String are not anagram>>>");
			return;
		}
		// 1. Using Arrays functions
		char[] str1Array=str1.toCharArray();
		char[] str2Array=str2.toCharArray();
		Arrays.sort(str1Array);
		Arrays.sort(str2Array);
		boolean flag=Arrays.equals(str1Array, str2Array);
		if(flag) {
			System.out.println(">>>String are anagram>>>");
		}else {
			System.out.println(">>>String are not anagram>>>");
		}
		
		//2. using for loop 
		boolean isAnagram=true;
		for(int i=0,j=0; i<len1;i++,j++) {
			
			if(str1Array[i]==str2Array[j]) {
			}else {
				isAnagram=false;
			}
			
		}		
		if (isAnagram) {
			System.out.println(">>>String are anagram>>>");
		}else {
			System.out.println(">>>String are not anagram>>>");
		}
	}

}
