package com.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;



public class Test6 {

	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<>();
		ls.add(5);
		ls.add(4);
		ls.add(3);
		
	//	ls.stream().sorted((i1,i2)-> i1.compareTo(i2)).forEach(System.out::println);
		//System.out.println(ls.stream().findFirst().get().intValue());
	//	ls.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		ListIterator<Integer> li=ls.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
			
			//ls.add(10);
		}
		//li.add(20);
		li.remove();
		
		System.out.println(ls);
		String s=new String("ab");
		StringBuffer sb=new StringBuffer("ab");
		//s.equals(sb);
		System.out.println(sb.equals(s));
		
		ArrayList al=new ArrayList<Integer>();
		al.trimToSize();
		

	}

}
