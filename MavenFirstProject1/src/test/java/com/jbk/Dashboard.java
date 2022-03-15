package com.jbk;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dashboard {
	@Test
	public void dash1() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void dash2() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void dash3() {
		Assert.assertEquals(2, 1);
	}
}
