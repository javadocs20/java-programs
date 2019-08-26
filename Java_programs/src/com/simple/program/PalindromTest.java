package com.simple.program;

public class PalindromTest {

	public static void main(String[] args) {

		String str = "madam";

		if (palindromCheck(str)) {
			System.out.println(str + " --> is palindrom!!");
		} else {
			System.out.println(str + " --> is NOT palindrom!!");
		}
	}

	public static boolean palindromCheck(String str) {
		int len = str.length() - 1;
		boolean flag = false;
		for (int i = 0, j = len; i <= len || j >= i; i++, j--) {

			if (str.charAt(i) == str.charAt(j)) {
				flag = true;
			} else {
				return false;
			}
		}
		return flag;
	}
}
