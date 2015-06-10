package com.bobbylough.MutationTestingDemo;

import static org.junit.Assert.*;

import org.junit.Test;


public class CrazyCodeTest {

	@Test
	public void testAlgorithm() throws Exception {
		CrazyData data = new CrazyData();
		data.setPropertyInt(16);
		assertTrue(CrazyCode.isAlgorithm(data));
	}
	
	@Test
	public void testCreateCrazyData() throws Exception {
		CrazyData data = CrazyCode.createCrazyData();
		assertTrue(data.isPropertyBool());
		// forget to test the other property value
		//assertEquals(5, data.getPropertyInt());
	}

}
