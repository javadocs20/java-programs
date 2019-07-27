package com.linkedlist;

public class SingleLinkedList {

	/**
	 * This method uses to add new node from front end.
	 * 
	 * @param first
	 *            first node of linked list
	 * @param info
	 *            info of linked list
	 * @return first node of linked list
	 */
	public static Node addFront(Node first, int info) {

		Node temp = new Node();
		temp.info = info;
		temp.next = first;
		return temp;

	}

	/**
	 * This method uses to display Linked List info
	 * 
	 * @param first
	 *            first node of linked list
	 */
	public static void display(Node first) {
		Node cur;

		cur = first;
		System.out.println("**********************Display elemrnt of Linked List**************************");
		while (cur != null) {
			System.out.print(cur.info + "\t");
			cur = cur.next;
		}
		System.out.println();
		System.out.println("************************************************");

	}

	public static Node reverse(Node first) {

		Node temp = null;
		
		Node cur;

		cur = first;
		while (cur != null) {
			first = first.next;
			cur.next = temp;
			temp = cur;
			cur = first;
			
		}
		return temp;
	}

}
