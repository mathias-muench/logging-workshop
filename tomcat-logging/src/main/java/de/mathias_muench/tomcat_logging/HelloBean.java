package de.mathias_muench.tomcat_logging;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
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
		String dir = System.getProperty("user.dir");
		LOG.fine(dir);
		return Files.readAllLines(Paths.get("./database.txt"),
				Charset.forName("utf-8")).get(0);
	}
}
