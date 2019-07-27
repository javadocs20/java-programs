package com.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {
	static final long serialVersionUID = 1L;
	static String name;
	transient int legCount = 4;

	@Override
	public String toString() {
		return "Dog [name=" + name + ", legCount=" + legCount + "]";
	}

}

public class Serialization {

	public static void main(String[] args) throws Exception {
		Dog d1 = new Dog();
		Dog.name="tommay";
		
		FileOutputStream fos = new FileOutputStream("dog.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		oos.close();
		fos.close();

		FileInputStream fis = new FileInputStream("dog.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog dog = (Dog) ois.readObject();
		ois.close();
		fis.close();

		System.out.println(dog);

	}

}
