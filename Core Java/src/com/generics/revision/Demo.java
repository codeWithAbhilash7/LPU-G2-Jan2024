package com.generics.revision;

public class Demo {
	public static void main(String[] args) {
		MyStack<Integer> stack = new MyStack<Integer>();
		stack.push(45);
		System.out.println("pop = " + stack.pop());
		stack.push(34);
		stack.push(23);
		System.out.println("peek = " + stack.peek());
		stack.push(12);
		stack.push(43);
		System.out.println(stack);
		
		MyStack<String> stringStack = new MyStack<String>();
		stringStack.push("ASDAS");
		stringStack.push("34563");
		stringStack.push("sadfgsdf");
		stringStack.push("fdgh3dfg");
		System.out.println(stringStack);
	}
}
