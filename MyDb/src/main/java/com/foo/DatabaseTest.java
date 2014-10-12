package com.foo;

import org.junit.Assert;
import org.junit.Test;


public class DatabaseTest {
	@Test
	public void writeDatabase() throws Exception {
		Database database = new Database();
		database.write("Bla");
		String actual = database.read();
		Assert.assertEquals("Bla", actual);
	}

}
