package com.simple.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ThirdHighestinArrayTest {

	public static void main(String[] args) {

		int[] a = { 1, 4, 3, 50, 50, 6, 70, 10, 40, 40, 60, 50, 40, 40 };

		int f = a[0];
		int s = a[0];
		int t = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] > f) {
				s = f;
				f = a[i];
			} else if (a[i] < f && a[i] > s) {
				t = s;
				s = a[i];
			}
		}

		System.out.println(f + ":::" + s + ":::" + t);
		System.out.println("*************************");
		System.out.println(t);

		ArrayList<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);

		for (int i = 0; i < l.size(); i++) {
			if (i == 2) {
				l.remove(i);
			}
		}

		Iterator<Integer> it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			l.remove(1);

		}

		System.out.println(l);
	}

}
