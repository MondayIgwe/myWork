package log4jDemo;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
import java.util.Enumeration;


public class SampleEntry2 {

	public static void main(String[] args) {
		// This is how we create a logger object
		
		Logger logger1 = LogManager.getLogger("logger1");
		Logger logger2 = LogManager.getLogger("logger2");
		Logger logger3 = LogManager.getLogger("logger3");
		
		BasicConfigurator.configure();
		
		logger1.info("This logger 1");
		logger2.info("This is logger 2");
		logger3.info("This is logger 3");
		
		
		//Retrieve all logger objects in the LoggManager using the instance
		Enumeration loggers = LogManager.getCurrentLoggers();
		
		while (loggers.hasMoreElements()) {
			
			logger3.info("Logger name is :==>" + loggers.nextElement());
			
			//It does not create duplicate loggers
			Logger logger1_2 = LogManager.getLogger("logger1_2");			
			Logger logger1_3 = LogManager.getLogger("logger2_2");
			
			logger1_2.info("This is logger1_2"+ logger1_2.getName());
			
			if(logger1_3.equals(logger1)) {
				logger1_3.info("Both Objects are thesame");
			}else {
				logger1_3.info("Logger1 and Logger1_2 are different object");
			}
			//Get the root of all Loggers
			Logger rootLogger =LogManager.getRootLogger();
			Logger rootOf1 = Logger.getRootLogger();
			
			if (rootLogger.equals(rootLogger)) {
				rootOf1.info("Both rootlogger and rootOf1 are same Object"+" And the NAME of the Root IS:==>"+  rootOf1.getName());
			}else {
				rootOf1.info("Both rootLogger and rootOf1 are different");
			}
			
		}
		
				

	}

}
