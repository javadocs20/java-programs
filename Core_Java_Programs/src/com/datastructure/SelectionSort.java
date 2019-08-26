package com.datastructure;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] array= {2,9,8,6,5};
		int temp,pos;
		
		System.out.println("before sorting**********");
		for(int i:array) {
			System.out.println(i);
		}
		for(int i=0;i<array.length;i++) {
			pos=i;
			for(int j=i+1;j<array.length;j++) {
				
				if(array[pos]>array[j]) {
					pos=j;
				}
			}
			temp=array[i];
			array[i]=array[pos];
			array[pos]=temp;
		}
		System.out.println("After sorting**********");
		for(int i:array) {
			System.out.println(i);
		}

	}

}
