package com.datastructure;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] array= {2,2,8,6,5};
		int temp;
		
		System.out.println("before sorting**********");
		for(int i:array) {
			System.out.println(i);
		}
		for(int i=0;i<array.length;i++) {
			
			for(int j=i+1;j<array.length;j++) {
				
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("After sorting**********");
		for(int i:array) {
			System.out.println(i);
		}
	}

}
