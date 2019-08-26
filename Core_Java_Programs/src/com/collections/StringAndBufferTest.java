package com.collections;

public class StringAndBufferTest {

	public static void main(String[] args) {
		
		String s="pramod";
		char[] array=s.toCharArray();
		StringBuffer sb=new StringBuffer(String.valueOf(array));
		System.out.println(sb);
		// insert() and delete() methods are not available in  String class.
		System.out.println(sb.insert(1, 'P'));
		System.out.println(sb.deleteCharAt(1));
		

	}

}
