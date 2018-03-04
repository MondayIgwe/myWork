package log4jDemo;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Level;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.jdbc.JDBCAppender;



public class SampleLog4jDemo {

	public static void main(String[] args) {
		//Create Configuration
		BasicConfigurator.configure();
		
		
		//Create Logger Object
		Logger mylogger = LogManager.getLogger("OurLogger");
		
		
		//TEST 1
		
		//CREATE A FILE APPENDER OBJECT and associate the file name you want the logs to be directed to
		FileAppender fileAppender = new FileAppender();
		
		fileAppender.setFile("logfile1.txt");
		
		//set a layout
		fileAppender.setLayout(new SimpleLayout());
		
		 //Add the appender to our Logger Object. 
	     //from now onwards all the logs will be directed
	     //to file mentioned by FileAppender
		
		  mylogger.addAppender(fileAppender);
		
		//Let print some log 10 times using a while loop
			int x =0;
			while(x<11) {
				mylogger.debug("This is just a log i want to print");
				x++;
			}
		//=========================================================
		
		//TEST 2
		
		//CREATE A CONSOLE APPENDER OBJECT
		ConsoleAppender consoleAppender = new ConsoleAppender();
		
		//set a layout
		consoleAppender.setLayout(new SimpleLayout());

	     //Add the appender to our Logger Object. 
	     //from now onwards all the logs will be directed
	     //to file mentioned by FileAppender
		
		mylogger.addAppender(consoleAppender);
		consoleAppender.activateOptions(); //beacause of the changes made
		
		mylogger.info("=======================================================================");
		//Let print some log 10 times using a while loop
		int f =0;
		while(f<11) {
			mylogger.error("This is just a log i want to print");
			f++;
		}

		
		
		//======================================================================================
		//TEST 3 (Databse)
		
		//Create a JDBCAppender class instance
		JDBCAppender databaseAppender = new JDBCAppender();
		
		//Provide the connection details to the Database appendeer
		databaseAppender.setURL("jdbc:mysql://localhost/test"); //Connection Url
		databaseAppender.setUser("testuser_1"); //Username for the DB connection
		databaseAppender.setPassword("Test@123"); //Password for the DB connection
		
		//Drivers to use to connect to DB
		databaseAppender.setDriver("com.mysql.jdbc.Driver");
		
		//set the sql insert statement that you want to use
		databaseAppender.setSql("INSERT INTO LOGS VALUES('%x', now() ,'%C','%p','%m'");
		
		
		//activate the new options
		databaseAppender.activateOptions();
		
		mylogger.info("================================================================");
		
		//attach your logger
		mylogger.addAppender(databaseAppender);
		
		//while loop
		int z = 0;
		while(z<11) {
			mylogger.debug("This just a log that want to print");
			
			z++;
		}
		
	}

}
