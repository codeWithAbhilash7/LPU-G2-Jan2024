package com.collections.list.stack;

import java.util.Stack;

public class Demo {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		//System.out.println("is empty ? = " + stack.empty());
		
		stack.push(5);
		stack.push(14);
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.push(97);
		stack.push(65);
		stack.push(11);
		System.out.println("peek = " + stack.peek());
		System.out.println(stack);
		stack.pop();		
		System.out.println(stack);
		
		System.out.println("peek = " + stack.peek());

	}

}
