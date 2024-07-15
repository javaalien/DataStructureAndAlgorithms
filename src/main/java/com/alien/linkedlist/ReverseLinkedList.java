package com.alien.linkedlist;

import java.awt.geom.CubicCurve2D;

// Write a Java program to reverse a singly linked list

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = next;
	}
}

public class ReverseLinkedList {

	static Node head;

	public static void main(String[] args) {

		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);

		System.out.println("Original Linked List:");
		printLinkedList(head);

		head = reverseLinkedList(head);

		System.out.println("\nReversed Linked List:");
		printLinkedList(head);

	}

	private static Node reverseLinkedList(Node current) {

		Node prev = null;
		Node next = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		return prev;
	}

	private static void printLinkedList(Node node) {
		while (node != null) {
			System.out.print(node.data + " -> ");
			node = node.next;
		}
		System.out.print("null");
	}
}
