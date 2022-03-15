package com.jbk;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void test01() {
		Assert.assertEquals(1, 1);
	}

	@Test
	public void test02() {
		Assert.assertTrue(true);
	}
}
