package com.array;

import java.util.Arrays;

public class StoreSmallLargestAlernatively {

	public static void main(String[] args) {
		int[] array= {2,1,3,5,4,6,7};
		
		int[] tempArray=new int[array.length];
		
		//Sort the 1st array
		Arrays.sort(array);

		int tempIndex=0;
	
		int len=array.length;
		
		for(int i=0,j=len-1;i<=len/2||j>=i;i++,j--) {
			
			if(tempIndex<len) {
				tempArray[tempIndex++]=array[i];
				
			}
			if(tempIndex<len) {
				tempArray[tempIndex++]=array[j];
			}
			
		}
		
		 for (int i = 0; i < tempArray.length; i++)
	            System.out.print(tempArray[i]+" ");
	    }

	

}
