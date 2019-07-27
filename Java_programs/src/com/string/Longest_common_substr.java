package com.string;

import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_ADDPeer;

public class Longest_common_substr {

	static SortedMap<String, Integer> sm = new TreeMap<>();
	static SortedSet<Integer> ss = new TreeSet<>();

	/*
	 * function to find and print the longest common substring of X[0..m-1] and
	 * Y[0..n-1]
	 */
	static void printLCSubStr(String X, String Y, int m, int n) {
		// Create a table to store lengths of longest common
		// suffixes of substrings. Note that LCSuff[i][j]
		// contains length of longest common suffix of X[0..i-1]
		// and Y[0..j-1]. The first row and first column entries
		// have no logical meaning, they are used only for
		// simplicity of program
		int[][] LCSuff = new int[m + 1][n + 1];

		// To store length of the longest common substring
		int len = 0;

		// To store the index of the cell which contains the
		// maximum value. This cell's index helps in building
		// up the longest common substring from right to left.
		int row = 0, col = 0;

		/*
		 * Following steps build LCSuff[m+1][n+1] in bottom up fashion.
		 */
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0)
					LCSuff[i][j] = 0;

				else if (X.charAt(i - 1) == Y.charAt(j - 1)) {
					LCSuff[i][j] = LCSuff[i - 1][j - 1] + 1;
					if (len < LCSuff[i][j]) {
						len = LCSuff[i][j];
						row = i;
						col = j;
					}
				} else
					LCSuff[i][j] = 0;
			}
		}

		// if true, then no common substring exists
		if (len == 0) {
			System.out.println("No Common Substring");
			return;
		}

		// allocate space for the longest common substring
		String resultStr = "";

		// traverse up diagonally form the (row, col) cell
		// until LCSuff[row][col] != 0
		while (LCSuff[row][col] != 0) {
			resultStr = X.charAt(row - 1) + resultStr; // or Y[col-1]
			--len;

			// move diagonally up to previous cell
			row--;
			col--;

		}
		
		ss.add(resultStr.length());
		// System.out.println(ss.size());
		// ss.remove(ss.last());
		// required longest common substring
		// System.out.println(resultStr);
		// return resultStr.length();
		// sm.put(X, ss.last());
	}

	/* Driver program to test above function */
	public static void main(String args[]) {
		// String X = "abcd8625";
		// String[] str = { "abcd8625", "abcide","zabe","yhajcde Rama is good Rama"};
		String[] str = { "abc", "12abc","xyz456","xyz2","45xyz","z2","abc"};
		// { "abcd8625", "zxabce" ,"abcide","yhabjcde Rama is good Rama"}
		/*
		 * String str1="abcide"; String str2="zxabcde"; String
		 * str3="yhabjcde Rama is good Rama";
		 */
		// String Y = String.join(" ", str1,str2,str3);
		// System.out.println(Y);
		// String h= " Rama is good Rama";
		// sm.put(X, 0);
		int m = 0;
		int n = 0;
		int length = 0;
		for (int i = 0; i < str.length; i++) {
			String X = str[i];

			for (int j = 0; j < str.length; j++) {
				String Y = str[j];
				
				if(!X.equals(Y))
				printLCSubStr(X, Y, X.length(), Y.length());

			}
			// ss.remove(ss.last());
			System.out.println(ss.size());
			sm.put(X, ss.last());
			// sm.forEach((key, value) -> System.out.println(key + " : " + value));
			
			ss.clear();
		}
		// sm.put(str[str.length-1], 0);
		System.out.println("***********************");
		sm.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
				.forEach(System.out::println);
	}
}