// Import log4j classes.
 import org.apache.log4j.Logger;

import com.foo.Database;

 public class MyDb {

   // Define a static logger variable so that it references the
   // Logger instance named "MyDb".
   static Logger logger = Logger.getLogger(MyDb.class);

   public static void main(String[] args) {

     // Set up a simple configuration that logs on the console.
//     BasicConfigurator.configure();

     logger.info("Entering application.");
     Database bar = new Database();
     logger.info("Exiting application.");
   }
 }
