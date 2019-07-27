package com.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer c1=new Customer(12, "Pra");
		Customer c2=new Customer(11, "Pramod");
		
		LinkedList<Customer> ll=new LinkedList<>();
		ll.add(c1);
		ll.add(c2);
		System.out.println(ll.size());
		
		Collections.sort(ll);
		System.out.println("****after sorting****");
		ll.forEach(System.out::println);
		
		System.out.println("*****************"); 
		HashSet<Customer> hs=new HashSet<>();
		hs.add(c1);
		hs.add(c2);
		System.out.println(hs.size());
		

	}

}
