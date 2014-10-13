package com.tngtech.mmu.logging.app;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.log4j.Logger;

public class Database {
	private final static Logger LOG = Logger.getLogger(Database.class);

	public void write(String value) throws IOException {
		Path path = Paths.get(System.getProperty("user.home"), "database.txt");
		LOG.info("Database File: " + path.toString());
		Files.write(path, value.getBytes(Charset.forName("utf-8")));
	}
}