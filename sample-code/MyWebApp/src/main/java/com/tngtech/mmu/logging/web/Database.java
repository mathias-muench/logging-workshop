package com.tngtech.mmu.logging.web;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Database {
	private final Path path;

	public Database() {
		path = Paths.get("database.txt");
	}

	public String read() throws IOException {
		return Files.readAllLines(path, Charset.forName("utf-8")).get(0);
	}

}
