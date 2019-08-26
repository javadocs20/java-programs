package com.datastructure;

public class QueueMain {

	public static void main(String[] args) throws Exception {

		Queue q = new Queue();
		q.insertRear(10);
		q.insertRear(20);

		q.printAllElement();

		System.out.println("**************************");

		q.deleteFront();

	    q.printAllElement();
	    
	    System.out.println("**************************");

	    q.deleteFront();

	    q.printAllElement();

	}

}
