package com.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImpl {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();

		System.out.println(q);
		q.add(10);
		System.out.println(q);
		q.offer(20);
		System.out.println(q);
		q.offer(30);
		System.out.println(q);
		q.add(40);
		System.out.println(q);

		System.out.println("peek = " + q.peek());
		System.out.println("element = " + q.element());

		q.remove();
		System.out.println(q);
		System.out.println("peek = " + q.peek());

		q.poll();
		System.out.println(q);
		System.out.println("element = " + q.element());

	}

}
