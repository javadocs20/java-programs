package com.serialization.externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class User implements Externalizable {

	private String userName;
	private transient int age;
	private int phone;

	public User() {
	}

	public User(String userName, int age, int phone) {
		this.userName = userName;
		this.age = age;
		this.phone = phone;
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		userName = (String) in.readObject();
		age = in.readInt();
		phone = in.readInt();

	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(userName);
		out.writeInt(age);
		out.writeInt(phone);
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

	public void setAge(int age) {
		this.age = age;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

}
