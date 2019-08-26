package com.array;

public class MinCountOfSortedArray {

	public static void main(String[] args) {

		int[] a = { 3, 4, 1, 2 };

		int min = a[0], min_index=0;

		for (int i = 0; i < a.length; i++) {

			if (min > a[i]) {
				min = a[i];
				min_index = i;
			}
		}
		System.out.println(min_index);
	}

}
