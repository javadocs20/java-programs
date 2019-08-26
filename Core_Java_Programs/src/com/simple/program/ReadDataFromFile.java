package com.simple.program;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReadDataFromFile {

	static ArrayList<User> al = new ArrayList<>();

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("user.txt");
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			String str = sc.nextLine();
			setThePropertyOfClass(str);
		}
		
		

	}

	static void setThePropertyOfClass(String str) throws NumberFormatException {

		String[] strArray = str.split(",");

		/*User u1 = new User(strArray[0], Integer.parseInt(strArray[1]), strArray[2]);
		al.add(u1);*/

	}

	static class User {

		private String name;
		private int age;
		private String city;

		public User(String name, int age, String city) {
			super();
			this.name = name;
			this.age = age;
			this.city = city;
		}

	}

}
