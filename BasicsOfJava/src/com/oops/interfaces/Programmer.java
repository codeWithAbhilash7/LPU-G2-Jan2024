package com.oops.interfaces;

public class Programmer extends App implements OnboardingProcess, TaxPayer  {
	@Override
	public void collectDocuments() {
		System.out.println("Collecting documents...");
	}

	@Override
	public void getPayrollDetails() {
		System.out.println("Collecting payroll information");
	}

	@Override
	public void enrollForInduction() {
		System.out.println("Enrolling for induction program");
	}

	@Override
	public void applyTaxes() {
	}

	@Override
	public void print() {
	}

}
