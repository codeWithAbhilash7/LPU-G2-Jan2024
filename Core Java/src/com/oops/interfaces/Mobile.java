package com.oops.interfaces;

public interface Mobile {
	String RAM();
	String internalStorage();
	String brand();
	String camera();
	
	default String frontCamera() {
		return "NA";
	}
}
