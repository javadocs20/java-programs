package com.datastructure;

public class Queue {

	protected static final int CAPACITY = 5;

	protected int r = -1, f = 0, size = 0;

	protected int[] queue;

	public Queue() {
		queue = new int[CAPACITY];
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public boolean isFull() {
		return (size() == CAPACITY);
	}

	public int size() {
		return (size + 1);
	}

	public void insertRear(int data) throws Exception {

		if (isFull()) {
			throw new Exception("Queue is full : overflow");
		}
		queue[++r] = data;
		size++;
	}

	public void deleteFront() throws Exception {
		int data;
		if (isEmpty()) {
			throw new Exception("Queue is full : overflow");
		}
		data = queue[f++];
		System.out.println(data);
		size--;
	}

	public void printAllElement() {

		System.out.println("Printing all element");
		if (size() > 0) {

			for (int i = f; i <= r; i++) {
				System.out.println(queue[i]);
			}
		}

	}

}
