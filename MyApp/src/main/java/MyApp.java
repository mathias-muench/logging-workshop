import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.tngtech.mmu.logging.app.Database;

public class MyApp {

	private static final Logger LOG = Logger.getLogger(MyApp.class);

	public static void main(String[] args) throws Throwable {

		BasicConfigurator.configure();

		LOG.info("Entering application.");
		Database bar = new Database();
		bar.doIt(args[0]);
		LOG.info("Exiting application.");
	}
}