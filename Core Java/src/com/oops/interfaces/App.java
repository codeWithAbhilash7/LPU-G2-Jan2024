package com.oops.interfaces;

public class App {

	public static void main(String[] args) {
		
//		Programmer p = new Programmer();
//		p.collectDocuments();
//		p.enrollForInduction();
//		p.getPayrollDetails();
//		p.defaultMethod();
		
//		Mobile mobile = new Samsung();
		
		Samsung s = new Samsung();
		System.out.println(s.brand());
		System.out.println(s.RAM());
		System.out.println(s.internalStorage());
		System.out.println(s.camera());
		System.out.println(s.frontCamera());
		
		OnePlus o = new OnePlus();
		System.out.println(o.brand());
		System.out.println(o.RAM());
		System.out.println(o.internalStorage());
		System.out.println(o.camera());
		System.out.println(o.frontCamera());
		
	}

}
