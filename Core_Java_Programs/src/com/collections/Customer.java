package com.collections;

public class Customer implements Comparable<Customer>{

	private int age;
	private String cname;
	
	public Customer(int age, String cname) {
		super();
		this.age = age;
		this.cname = cname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((cname == null) ? 0 : cname.hashCode());
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
		if (cname == null) {
			if (other.cname != null)
				return false;
		} else if (!cname.equals(other.cname))
			return false;
		return true;
	}

	@Override
	public int compareTo(Customer o) {
		
		return this.cname.compareTo(o.cname);
	}

	@Override
	public String toString() {
		return "Customer [age=" + age + ", cname=" + cname + "]";
	}
	
	
		
}
