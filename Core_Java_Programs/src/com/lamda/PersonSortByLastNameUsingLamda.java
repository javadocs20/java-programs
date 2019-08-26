package com.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonSortByLastNameUsingLamda{

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("Pramod", "Kumar", 29), new Person("Amit", "Kumar", 30));

		// Step 1: Sorting
		Collections.sort(persons, (p1, p2) -> p1.getFname().compareTo(p2.getFname()));
		
		// Step 1: printing all
		printAllPersons(persons, p1 -> p1.getFname().startsWith("A"));

	}

	private static void printAllPersons(List<Person> persons, Condition condition) {
		for (Person p : persons) {
			if (condition.test(p)) {
				System.out.println(p);
			}
		}

	}

}
@FunctionalInterface
interface Condition {
	public boolean test(Person p);
}