package com.oops.inheritance;

public class ScienceClass extends Student {

	private double physics;
	private double chemistry;
	private double maths;
	private double biology;

	public ScienceClass(String name) {
		super(name);
	}

	public ScienceClass(String name, String address) {
		super(name, address);
	}

	@Override
	public String toString() {
		return super.toString() + "ScienceClass [physics=" + physics + ", chemistry=" + chemistry + ", maths=" + maths
				+ ", biology=" + biology + ", total=" + getTotalMarks() + ", avg=" + getAverage() + "]";
	}

	@Override
	public double getTotalMarks() {
		return this.physics + this.chemistry + this.maths + this.biology + super.getTotalMarks();
	}
	
	public double getAverage() {
		return this.getTotalMarks() / 6.0;
	}

	public double getPhysics() {
		return physics;
	}

	public void setPhysics(double physics) {
		this.physics = physics;
	}

	public double getChemistry() {
		return chemistry;
	}

	public void setChemistry(double chemistry) {
		this.chemistry = chemistry;
	}

	public double getMaths() {
		return maths;
	}

	public void setMaths(double maths) {
		this.maths = maths;
	}

	public double getBiology() {
		return biology;
	}

	public void setBiology(double biology) {
		this.biology = biology;
	}

}
