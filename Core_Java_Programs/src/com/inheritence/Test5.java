package com.inheritence;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

class Person {

	String name;
	int age;
	String city;

	public Person(String name, int age, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", city=" + city + "]";
	}
/*
	@Override
	public int compareTo(Person o) {
		return this.age - o.age;
	}
*/
}

class ComparatorUsingName implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {

		return o1.name.compareTo(o2.name);
	}

}

public class Test5 {

	public static void main(String[] args) {
		// Using Comparator  
		// TreeSet<Person> ts = new TreeSet<>(new ComparatorUsingName());  
		
		//Using Lamda
		TreeSet<Person> ts = new TreeSet<>((o1, o2) -> {
			return o1.name.compareTo(o2.name);
		});

		Person p1 = new Person("p2", 11, "blore1");
		Person p2 = new Person("p1", 12, "blore2");
		Person p3 = new Person("p3", 13, "blore3");
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.forEach(System.out::println);
		
		TreeMap<Person,Integer> tm=new TreeMap<>(new ComparatorUsingName());
		tm.put(p1, 1);
		
		System.out.println(tm);
		
		System.out.println("****************************");
		
		Integer i=new Integer(011);
		System.out.println(i);

	}

}
