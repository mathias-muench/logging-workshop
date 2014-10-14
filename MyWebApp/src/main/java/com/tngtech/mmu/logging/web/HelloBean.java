package com.tngtech.mmu.logging.web;

import java.io.IOException;

import org.apache.log4j.Logger;

public class HelloBean {
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger("HelloBean");
	
	private Database db;
	private String input;
	
	public Database getDb() {
		return db;
	}

	public void setDb(Database db) {
		this.db = db;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getGreeting() throws IOException {
		return db.read();
	}
}
