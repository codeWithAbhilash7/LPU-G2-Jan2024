package com.oops.inheritance.day2;

public class ScienceStudent extends Student {

	private double physics;
	private double chemistry;
	private double maths;

	public ScienceStudent(String name) {
		this(name, "Undefined", "Undefined");
	}

	public ScienceStudent(String name, String city, String state) {
		super(name, city, state);
	}

	@Override
	public String toString() {
		return "Science [id=" + getId() + ", name=" + getName() + ", physics=" + physics + ", chemistry="
				+ chemistry + ", maths=" + maths + ", english=" + getEnglish() + ", hindi=" + getHindi() + ", total="
				+ getTotalMarks() + ", avg=" + getAverage() + "]";
	}
	
	@Override
	public double getTotalMarks() {
		return super.getEnglish() + super.getHindi() + this.physics + this.chemistry + this.maths; 
	}

	@Override
	public double getAverage() {
		return this.getTotalMarks() / 5.0;
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

}
