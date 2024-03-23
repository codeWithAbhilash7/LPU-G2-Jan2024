package com.exceptions.custom;

public class MarksOutOfBoundsExceptions extends Exception {

	private static final long serialVersionUID = 1L;

	public MarksOutOfBoundsExceptions() {

	}

	public MarksOutOfBoundsExceptions(String msg) {
		super(msg);
	}

}
