package log4jDemo;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class rootLog4Sample {

	public static void main(String[] args) {

Logger GrandFather = LogManager.getLogger( rootLog4Sample.class.getName());
Logger logger1 = LogManager.getLogger("Child1");
Logger logger1Child = LogManager.getLogger("Child1.ChildofLogger1");
Logger loggerGrandChild = LogManager.getLogger("Child1.ChildofLogger1.GrandChild");	
		
	System.out.println("Logger's full name is:==>"+ logger1.getParent().getName());
	System.out.println("Logger1Child's full name is:==>"+logger1Child.getParent().getName());
	System.out.println("The Logger GrandChild's full name is:==>"+ loggerGrandChild.getParent().getName());
	
	
	//Log Levels
	Logger Mylogger = LogManager.getLogger("DeugLogger");
	Logger LoggerParent = LogManager.getLogger("LoggerParent");
    Logger LoggerChild = LogManager.getLogger("LoggerParent.Child");

	
	//Setting the log levels
	Mylogger.setLevel(Level.DEBUG);
	
	Mylogger.trace("The is the trace log - DEBUG");
	Mylogger.debug("The is the debug log - DEBUG");
	Mylogger.info("This is info log- DEBUG");
	Mylogger.warn("The is the warn log- DEBUG");
	Mylogger.error("This is the error log - DEBUG");
	Mylogger.fatal("The is the fatal log - DEBUG");
	
	
	//Second set of levels

    Mylogger.setLevel(Level.WARN);
    Mylogger.trace("This is the trace log - WARN");
    Mylogger.debug("This is debug log - WARN");
    Mylogger.info("This is info log - WARN");
    Mylogger.warn("This is Warn log - WARN");
    Mylogger.error("This is error log - WARN");
    Mylogger.fatal("This is Fatal log - WARN");     
    
    
  //Setting up the log level of both loggers
    LoggerParent.setLevel(Level.WARN);      
   LoggerParent.trace("This is the trace log - PARENT");
   LoggerParent.debug("This is debug log - PARENT");
   LoggerParent.info("This is info log - PARENT");
   LoggerParent.warn("This is Warn log - PARENT");
   LoggerParent.error("This is error log - PARENT");
   LoggerParent.fatal("This is Fatal log - PARENT");
   LoggerChild.trace("This is the trace log - CHILD");
   LoggerChild.debug("This is debug log - CHILD");
   LoggerChild.info("This is info log - CHILD");
   LoggerChild.warn("This is Warn log - CHILD");
   LoggerChild.error("This is error log - CHILD");
   LoggerChild.fatal("This is Fatal log - CHILD");  
   
   try {
	 int  x = 200/0;
   }
   catch(Exception exp) {
	  LoggerParent.warn("The following Exception was raised", exp);
	   
   }


	}

}
