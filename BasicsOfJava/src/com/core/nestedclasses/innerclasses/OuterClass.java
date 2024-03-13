package com.core.nestedclasses.innerclasses;

public class OuterClass {
	private int outerData;

	OuterClass() {
		this.outerData = 11;
	}

	static class InnerClass {
		private int innerData;

		InnerClass() {
			this.innerData = 22;
		}

		public int getInnerData() {
			return innerData;
		}

		public void setInnerData(int innerData) {
			this.innerData = innerData;
		}

		@Override
		public String toString() {
			return "InnerClass [innerData=" + innerData + "]";
		}

	}

	public void printInnerData() {
		// System.out.println("Inner Data = " + innerData);
	}

	public int getOuterData() {
		return outerData;
	}

	public void setOuterData(int outerData) {
		this.outerData = outerData;
	}

}
