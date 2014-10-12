package com.foo;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.log4j.Logger;

public class Database {
	static Logger logger = Logger.getLogger(Database.class);

	public void doIt(String value) throws IOException {
		Files.write(Paths.get("./database.txt"), value.getBytes(Charset.forName("utf-8")));
		logger.debug("Did it again!");
	}
}