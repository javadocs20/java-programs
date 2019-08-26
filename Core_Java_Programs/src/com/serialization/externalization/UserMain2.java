package com.serialization.externalization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UserMain2 {

	public static void main(String[] args) throws Exception {
		File f = new File("ext1.txt");
		//User1 u1 = new User1("Atul", 20, 912345);
		
		User1 u1 = new User1("Atul",912345);
	

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
		out.writeObject(u1);

		ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
		u1 = (User1) in.readObject();

		in.close();
		out.close();
		System.out.println("After  de serialization user name: " + u1.getUserName() + " , age is:" + u1.getAge()
				+ " and phone is:" + u1.getPhone());

	}

}
