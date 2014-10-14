package com.tngtech.mmu.logging.app;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Database {
	public void write(String value) throws IOException {
		Files.write(Paths.get("database.txt"), value.getBytes(Charset.forName("utf-8")));
	}
}