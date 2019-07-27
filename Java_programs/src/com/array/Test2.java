package com.array;

public class Test2 {

	public static void main(String[] args) {

		int[] array = { 4, 2, 1, 5, 8 };
		int big = 0;

		for (int i : array) {
			if (i > big) {
				big = i;
			}
		}

		System.out.println(big);

	}

}
