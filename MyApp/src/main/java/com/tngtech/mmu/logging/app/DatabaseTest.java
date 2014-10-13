package com.tngtech.mmu.logging.app;

import org.junit.Test;

public class DatabaseTest {
	@Test
	public void testDoIt() throws Exception {
		Database bar = new Database();
		bar.doIt("Bar");
	}
}
