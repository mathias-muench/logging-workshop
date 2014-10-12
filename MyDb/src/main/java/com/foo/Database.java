package com.foo;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.apache.log4j.Logger;

public class Database {
	@SuppressWarnings("unused")
	private static final Logger logger = Logger.getLogger(Database.class);

	private static final String DATABASE_FILENAME = "./database.txt";
	private static final Charset cs = Charset.forName("utf-8");

	public void write(String value) throws IOException {
		Files.write(Paths.get(DATABASE_FILENAME), value.getBytes(cs));
	}

	public String read() throws IOException {
		String result;
		Path path = Paths.get(DATABASE_FILENAME);
		List<String> lines = Files.readAllLines(path, cs);
		if (lines.size() > 0) {
			result = lines.get(0);
		} else {
			result = "";
		}
		return result;
	}
}