package com.simple.program;

public class Array1 {

	public static void main(String[] args) {
		int[] intArray= {1,2,3};
		
		
		
		String str="";
		
		for(int i=0;i<intArray.length;i++) {
			//str=str+intArray[i];
			str=str+String.valueOf(intArray[i]);
		}
		System.out.println(str);
		
/*		String finalvalue=String.valueOf(intArray);
		System.out.println(finalvalue);*/
	}
	
	

}
