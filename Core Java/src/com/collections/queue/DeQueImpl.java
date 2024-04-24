package com.collections.queue;

import java.util.Deque;
import java.util.LinkedList;

public class DeQueImpl {

	public static void main(String[] args) {
		Deque<Integer> q = new LinkedList<Integer>();

		System.out.println(q);
		q.addFirst(10);
		System.out.println(q);
		q.addFirst(20);
		System.out.println(q);
		q.addLast(30);
		System.out.println(q);
		q.addFirst(40);
		System.out.println(q);

		System.out.println("peek first = " + q.peekFirst());
		System.out.println("peek last = " + q.peekLast());
		System.out.println("element = " + q.element());

		q.removeLast();
		System.out.println(q);
		System.out.println("peek first = " + q.peekFirst());
		System.out.println("peek last = " + q.peekLast());

		q.removeFirst();
		System.out.println(q);
		System.out.println("peek first = " + q.peekFirst());
		System.out.println("peek last = " + q.peekLast());

	}

}
