package com.seimens;

import java.util.HashSet;

class Employee{
	
	private String ename;

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
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
		Employee other = (Employee) obj;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		return true;
	}
	
	
	
	
}
public class PassByValueBusinessObjectTest {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.setEname("pramod");
		Employee e2=new Employee();
		e2.setEname("pramod");
		System.out.println("Before method call:: " +e1);
		//modifyValue(e1);
		System.out.println("after method call:: " +e1);
		
		HashSet<Employee> hs=new HashSet<>();
		hs.add(e1);
		hs.add(e2);
		System.out.println(hs.size());
		}

	private static void modifyValue(Employee e1) {
		
		//e1=new Employee();
		e1.setEname("guddu");
		
	}

}
