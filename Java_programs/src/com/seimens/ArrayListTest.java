package com.seimens;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Student {

	private String sname;

	public Student() {

	}

	public Student(String sname) {
		this.sname = sname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + "]";
	}
	
	

}

public class ArrayListTest {

	public static void main(String[] args) {
		
		//program 1.
		List<String> al=new ArrayList<>();
		al.add("pramod");
		al.add("kumar");
		addMore(al);
		al.forEach(System.out::println);
		
		System.out.println("*******************");
		
		//Program 2.
		HashSet<String> hs=new HashSet<>();
		hs.add(new String("india"));
		hs.add("india");
		hs.forEach(System.out::println);
		
		System.out.println("*******************");
		//program 3.
		
		Student s1=new Student("pramod");
		Student s2=new Student("kumar");
		List<Student> als=new ArrayList<>();
		als.add(s1);
		als.add(s2);
		s2.setSname("dolly");
		
		als.forEach(System.out::println);
		
		System.out.println("*******************");
		//program 4.
	
		modify(s1);
		System.out.println(s1);
		System.out.println("*******************");
		//program 5.
		
		ArrayList<Integer> it=new ArrayList<>();
		it.add(1);
		it.add(2);
		it.add(3);
		it.add(4);
		it.remove(2);// if passed value is integer , then remove at index.
		it.remove(Integer.valueOf(4)); // if passed value is object,  then remove that object.
		
		System.out.println(it);

	}

	public static void addMore(List<String> al) {
		al.add("pramod1");
		al.add("kumar1");
		al = null;
	}
	
	public static void modify(Student s1) {
		//s1=new Student();
		s1.setSname("modify");
	}
	
	
}
