import com.tngtech.mmu.logging.app.Database;

public class MyApp {
	public static void main(String[] args) throws Throwable {
		Database database = new Database();
		database.write(args[0]);
	}
}