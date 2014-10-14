package com.tngtech.mmu.logging.web;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.log4j.Logger;

public class Database {
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger("Database");
	private final Path path;

	public Database() {
		path = Paths.get(System.getProperty("user.home"), "database.txt");
		LOG.info("Connect string: " + path.toString());
	}

	public String read() throws IOException {
		String value = Files.readAllLines(path, Charset.forName("utf-8")).get(0);
		LOG.debug("Value read: " + value);
		return value;
	}

}
