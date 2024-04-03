package com.exceptions.custom;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Demo {

	@Test
	void test() {
		Student s1 = new Student("ABCD");
		
		try {
			s1.setMarks(187);
		} catch (MarksOutOfBoundsExceptions e) {
			System.out.println(e.getMessage());
		}
		
		assertEquals(0, s1.getMarks());
		
	}

}
