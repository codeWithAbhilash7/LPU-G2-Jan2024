package com.oops.inheritance.day2;

public class Arts extends Student {
	private double history;
	private double geography;

	public Arts(String name) {
		this(name, "Undefined", "Undefined");
	}

	public Arts(String name, String city, String state) {
		super(name, city, state);
	}

	@Override
	public String toString() {
		return "Arts [id=" + getId() + ", name=" + getName() + ", history=" + history + ", geography=" + geography
				+ ", english=" + getEnglish() + ", hindi=" + getHindi() + ", total=" + getTotalMarks() + ", avg="
				+ getAverage() + "]";
	}

	@Override
	public double getTotalMarks() {
		return super.getEnglish() + super.getHindi() + this.geography + this.history;
	}

	@Override
	public double getAverage() {
		return this.getTotalMarks() / 4.0;
	}

	public double getHistory() {
		return history;
	}

	public void setHistory(double history) {
		this.history = history;
	}

	public double getGeography() {
		return geography;
	}

	public void setGeography(double geography) {
		this.geography = geography;
	}

}
