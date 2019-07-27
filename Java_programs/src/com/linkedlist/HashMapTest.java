package com.linkedlist;

import java.util.HashMap;

class Customer{
	private int custId;
	private String fname;
	private String lname;
	private int age;
	public Customer(int custId, String fname, String lname, int age) {
		super();
		this.custId = custId;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + custId;
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
		Customer other = (Customer) obj;
		if (age != other.age)
			return false;
		if (custId != other.custId)
			return false;
		return true;
	}
	
	
	
}

public class HashMapTest {

	public static void main(String[] args) {
		Customer cust1=new Customer(111, "pramod", "kr", 25);
		Customer cust2=new Customer(222, "rahul", "kr", 25);
		
		HashMap<Customer,Customer> custMap= new HashMap<>();
		custMap.put(cust1, cust2);
		

	}

}
