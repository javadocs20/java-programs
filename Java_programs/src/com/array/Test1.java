package com.array;

public class Test1 {

	public static void main(String[] args) {

		int[] ar = { -1, 1, -2, 2 };
		int[] ar1= new int[4];
		for (int x : ar) {
			System.out.print(x + " ");
		}

		int[] neg = new int[2];
		int[] pos = new int[2];
		int j = 0;
		int k = 0;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < 0) {
				neg[j++] = ar[i];

			} else {
				pos[k++] = ar[i];
			}
		}
		System.out.println();
		System.out.println("*****************");
		for (int x : neg) {
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println("*****************");
		for (int x : pos) {
			System.out.print(x + " ");
		}
		System.arraycopy(neg, 0, ar1, 0, neg.length);
		System.arraycopy(pos, 0, ar1, neg.length, pos.length);
		
		System.out.println();
		System.out.println("*****************");
		for (int x : ar1) {
			System.out.print(x + " ");
		}
	}

}
