package com.oops.accessmodifiers.pkg2;

import com.oops.accessmodifiers.pkg1.Student;

public class App extends Student {

	void testMethod() {
		// System.out.println(super.privateData);
		//System.out.println(super.defaultData);
		System.out.println(super.protectedData);
		System.out.println(super.publicData);

		//super.privateMethod();
		//super.defaultMethod();
		super.protectedMethod();
		super.publicMethod();
	}

	public static void main(String[] args) {
		Student s = new Student();

		// System.out.println(s.privateData);
		// System.out.println(s.defaultData);
		// System.out.println(s.protectedData);
		System.out.println(s.publicData);

		// s.privateMethod();
		// s.defaultMethod();
		// s.protectedMethod();
		s.publicMethod();

	}

}
