package com.tngtech.mmu.logging.web;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.log4j.Logger;

public class Database {
	private static final Logger LOG = Logger.getLogger(Database.class);
	private final Path path;

	public Database() {
		path = Paths.get("database.txt");
		LOG.info(path.toString());
	}

	public String read() throws IOException {
		return Files.readAllLines(path, Charset.forName("utf-8")).get(0);
	}

}
