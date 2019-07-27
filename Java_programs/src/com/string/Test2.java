package com.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Test2 {

	public static void main(String[] args) {
		String[] strArray= {"pramod","priya","prem"};
		//List<String> list=new ArrayList<>(Arrays.asList(strArray));
		//System.out.println(list);
		SortedSet<String> ss=new TreeSet<>(Arrays.asList(strArray));
		System.out.println(ss);

	}

}
