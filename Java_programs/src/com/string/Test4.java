package com.string;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class Test4 {

	static final int x;
	static final int y = 20;

	static {
		System.out.println("Y::" + y);
		// System.out.println("x::" +x);
		x = 10;
		System.out.println("x::" + x);
	}

	public static void main(String[] args) throws FileNotFoundException {

		System.out.println(args.length);
		 URL url = Test4.class.getClassLoader().getResource("file.txt");
		    System.out.println(url.getPath());
		Scanner sc=new Scanner(new File("/C:/Users/pkuma140/eclipse-workspace/ObjectString/bin/file.txt"));
		while (sc.hasNextLine())
		      System.out.println(sc.nextLine());
			String[] str=sc.nextLine().split(" ");
		  }
		
	}

