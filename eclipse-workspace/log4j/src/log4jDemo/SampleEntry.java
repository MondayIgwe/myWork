package log4jDemo;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;




public class SampleEntry {
	
	//mainLogger is a logger object that we got from LogManager. All loggers are 
	//using this method only. We can consider LogManager as a factory to create
    //Logger objects

	static Logger mainLogger = LogManager.getLogger(SampleEntry.class.getName());
			public static void main(String[] args) {
		
				BasicConfigurator.configure();
				mainLogger.info("This is just a logger");
				System.out.println("================================================");
				
					
				
				//Create a CONSOLE apender and attach it to our mainLogger
				ConsoleAppender appender = new ConsoleAppender();
				
				mainLogger.addAppender(appender);
				mainLogger.info("This is my first LOGGER Script");
				
			
				
			//How the layout should appear on the output
				appender.activateOptions();
				PatternLayout layoutHelper = new PatternLayout();
				layoutHelper.setConversionPattern("%-5p [%t]: %m%n");
				layoutHelper.activateOptions();
				
				//mainLogger.getAppender("ConsoleAppender").setLayout(layoutHelper
				appender.setLayout(layoutHelper);
				mainLogger.addAppender(appender);
				
				//Create a console appender and attach it to our mainLogger
				mainLogger.info("Patter 1 is displayed like this ");
				layoutHelper.setConversionPattern("%C %m%n");
				mainLogger.info("Pattern 2 is displayed like this");
			}

}
