package com.bobbylough.MutationTestingDemo;

public class CrazyCode {

	public static boolean isAlgorithm(CrazyData data) {
		int mathFun = data.getPropertyInt() / 4;
		int moreMathFun = mathFun % 2;
		return moreMathFun == 0;
	}
	
	public static CrazyData createCrazyData() {
		CrazyData data = new CrazyData();
		
		data.setPropertyBool(true);
		data.setPropertyInt(5);
		return data;
	}
}
