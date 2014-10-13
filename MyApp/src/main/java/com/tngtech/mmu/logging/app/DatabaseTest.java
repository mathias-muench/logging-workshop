package com.tngtech.mmu.logging.app;

import org.junit.Test;

public class DatabaseTest {
	@Test
		public void testWrite() throws Exception {
			Database bar = new Database();
			bar.write("Bar");
		}
}
