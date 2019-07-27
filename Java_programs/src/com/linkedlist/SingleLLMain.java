package com.linkedlist;

import java.util.Scanner;

public class SingleLLMain {

	public static void main(String[] args) {

		Node first = null;
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("Please enter your choice:---");
			int choice = sc.nextInt();
			int info;
			switch (choice) {
			case 1:
				System.out.println("Please enter new node info:---");
				info = sc.nextInt();
				first = SingleLinkedList.addFront(first, info);

				break;

			case 2:
				first = SingleLinkedList.reverse(first);
				break;

			case 3:
				SingleLinkedList.display(first);
				break;

			default:
				System.exit(0);

			}

		}
	}

}
