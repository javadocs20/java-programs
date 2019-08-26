package com.simple.program;

public class StringWordRevers {

	public static void main(String[] args) {

		String str = "Pramod  is java.                      expert";

		String str1[] = str.split("\\s"); //str.split("\\s");
		String finalStr = "";
		for (int i = str1.length - 1; i >= 0; i--) {

			char[] chArray = str1[i].toCharArray();
			
			if(chArray.length>0 && chArray[chArray.length - 1]!='.') {
			char temp = chArray[0];
			chArray[0] = chArray[chArray.length - 1];
			chArray[chArray.length - 1] = temp;
			}
			else if(chArray.length>0){
				char temp = chArray[0];
				chArray[0] = chArray[chArray.length - 2];
				chArray[chArray.length - 2] = temp;
			}

			

			finalStr = finalStr +finalStr.valueOf(chArray) + " ";
		}
		// finalStr=finalStr.substring(0, finalStr.length()-1);
		finalStr = finalStr.trim();
		System.out.println(finalStr);
	}

}
