package com.generics.revision;

import java.util.ArrayList;

public class MyStack<MYData> {
	private ArrayList<MYData> stack;

	public MyStack() {
		stack = new ArrayList<MYData>();
	}

	public void push(MYData data) {
		stack.add(data);
	}

	public MYData pop() {
		return stack.remove(stack.size() - 1);
	}

	public MYData peek() {
		return stack.get(stack.size() - 1);
	}

	@Override
	public String toString() {
		return "" + stack + "";
	}

}
