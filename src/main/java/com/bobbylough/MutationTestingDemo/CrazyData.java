package com.bobbylough.MutationTestingDemo;

public class CrazyData {
	
	boolean propertyBool = false;
	int  propertyInt = 1;
	
	/**
	 * @return the propertyBool
	 */
	public boolean isPropertyBool() {
		return propertyBool;
	}
	/**
	 * @param propertyBool the propertyBool to set
	 */
	public void setPropertyBool(boolean propertyBool) {
		this.propertyBool = propertyBool;
	}
	/**
	 * @return the propertyInt
	 */
	public int getPropertyInt() {
		return propertyInt;
	}
	/**
	 * @param propertyInt the propertyInt to set
	 */
	public void setPropertyInt(int propertyInt) {
		this.propertyInt = propertyInt;
	}
}