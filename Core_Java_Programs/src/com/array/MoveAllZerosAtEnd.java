package com.array;

public class MoveAllZerosAtEnd {

	public static void main(String[] args) {
		
		int[] intAry= {0,1,2};
		
		int count=0,temp;
		
		for(int i=0;i<intAry.length;i++) {
			
			if(intAry[i]!=0) {
				temp=intAry[i];
				intAry[i]=intAry[count];
				intAry[count]=temp;
				count++;
			}
		}

		for(int i=0;i< intAry.length;i++)
			System.out.println(intAry[i]);
	}

}
