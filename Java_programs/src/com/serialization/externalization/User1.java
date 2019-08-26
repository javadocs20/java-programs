package com.serialization.externalization;

import java.io.Serializable;

class User2{
	
	int age = 23;
	
	public User2() {
		System.out.println("User2:--- constructor");
	}
}

public class User1 extends User2 implements Serializable {

	private String userName;
	int age = 20;
	private static int phone;

	public User1() {

	}

	/*
	 * public User1(String userName, int age, int phone) { this.userName = userName;
	 * 
	 * this.phone = phone; }
	 */

	public User1(String userName, int phone) {
		this.userName = userName;
		this.phone = phone;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
}
