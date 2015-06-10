package com.bobbylough.MutationTestingDemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CrazyDataTest {

	@Test
	public void testDefault() {
		CrazyData data = new CrazyData();
		assertFalse(data.isPropertyBool());
		assertEquals(1, data.getPropertyInt());
	}

}
