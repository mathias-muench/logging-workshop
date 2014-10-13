package com.tngtech.mmu.logging.web;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;

public class HelloBean {
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger("HelloBean");
	private String input;

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getGreeting() throws IOException {
		Path path = Paths.get(System.getProperty("user.home"), "database.txt");
		LOG.info("Database File: " + path.toString());
		return Files.readAllLines(path, Charset.forName("utf-8")).get(0);
	}
}
