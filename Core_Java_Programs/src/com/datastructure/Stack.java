package com.datastructure;

public class Stack {

	protected static final int CAPACITY = 5;

	protected int top = -1;

	protected int[] stack;

	protected int capacity;

	public Stack() {
		this(CAPACITY);
	}

	public Stack(int cap) {
		capacity = cap;
		stack = new int[capacity];
	}

	public boolean isEmpty() {
		return (top < 0);
	}

	public int size() {
		return (top + 1);
	}

	public void push(int data) throws Exception {
		if (size() == CAPACITY) {
			throw new Exception("Stack is full");
		}
		stack[++top] = data;
	}

	public void pop() throws Exception {
		int data;
		if (isEmpty()) {
			throw new Exception("Stack is empty");
		}
		data = stack[top--];
		//return data;
		
		System.out.println(data);
	}
	
	public void printStackData() {
		System.out.println("--------:Printing stack elements:--------");
		if(size() > 0 ) {
			for(int i=top;i>=0;i--) {
				System.out.println(stack[i]);
			}
		}
		
	}
}
