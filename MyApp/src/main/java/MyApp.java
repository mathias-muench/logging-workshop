import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.tngtech.mmu.logging.app.Database;

public class MyApp {
	private static final Logger LOG = Logger.getLogger(MyApp.class);

	public static void main(String[] args) throws Throwable {
		System.out.println(Logger.getRootLogger().getAllAppenders().hasMoreElements());
		System.out.println(LOG.getAllAppenders().hasMoreElements());
		BasicConfigurator.configure();
		Database database = new Database();
		LOG.info(database.toString());
		database.write(args[0]);
	}
}