package com.simple.program;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadDataFromUserFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		StringBuffer sb=new StringBuffer();
		//reading file data 
		Scanner sc=new Scanner(new File("user.txt"));
		while(sc.hasNextLine()) {
			for(String str : sc.nextLine().split(","))
			sb.append(str).append(" ");
		}
		sc.close();
		System.out.println(sb.toString().trim());
		
		// Reading file data using Files Api
		List<String> str=Collections.emptyList();
		try {
			str=Files.readAllLines(Paths.get("user.txt"));
			str.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Reading fila data using Files API
		System.out.println("*******************************");
		try {
			Stream<String> streams=Files.lines(Paths.get("user.txt"));
			String[] strArray=streams.toArray(String[]::new);
			System.out.println(strArray.length);
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
