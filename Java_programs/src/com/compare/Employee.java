package com.compare;

public class Employee{

	int id;
	String name;
	String emailId;

	public Employee(int id, String name, String emailId) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
	}

	/*@Override
	public int compareTo(Employee o) {

		return this.id - o.id;
	}*/

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", emailId=" + emailId + "]";
	}

}
