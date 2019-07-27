package com.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {

	public static void main(String[] args) {
		
		Employee em1= new Employee(1,"pramod","p@gmail.com");
		Employee em2= new Employee(3,"ravi","p@gmail.com");
		Employee em3= new Employee(4,"ajay","p@gmail.com");
		Employee em4= new Employee(2,"shah","p@gmail.com");
		
		List<Employee> al=new ArrayList<>();
		al.add(em1);
		al.add(em2);
		al.add(em3);
		al.add(em4);
		System.out.println("Before sorting...........");
		System.out.println(al);
		System.out.println("After sorting............");
		Collections.sort(al,new EmployeeNameComparator());
		
		Collections.sort(al,(e1,e2)->e1.name.compareTo(e2.name));
	
		System.out.println(al);

	}

}
