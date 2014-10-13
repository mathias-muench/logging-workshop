import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.tngtech.mmu.logging.app.Database;

public class MyApp {

	private static final Logger LOG = Logger.getLogger(MyApp.class);

	public static void main(String[] args) throws Throwable {
		LOG.info("Entering application.");
		Database database = new Database();
		database.write(args[0]);
		LOG.info("Exiting application.");
	}
}