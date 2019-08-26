package com.datastructure;

public class StackMain {

	public static void main(String[] args) throws Exception {
		
		Stack s=new Stack();
		
		//pushing item in Stack
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		
		//printing all stack elements
		
		s.printStackData();
		
		//Poping up item in Stack
		System.out.println("Poping stack elements");
		s.pop();
		s.printStackData();
		

	}

}
