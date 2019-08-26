package com.serialization.externalization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UserMain {

	public static void main(String[] args) throws Exception {
		File f = new File("ext.txt");
		User u = new User("Atul", 20, 912345);

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
		out.writeObject(u);

		ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
		u = (User) in.readObject();

		in.close();
		out.close();
		System.out.println("After  de externalizing user name: " + u.getUserName() + " , age is:" + u.getAge()
				+ " and phone is:" + u.getPhone());

	}

}
