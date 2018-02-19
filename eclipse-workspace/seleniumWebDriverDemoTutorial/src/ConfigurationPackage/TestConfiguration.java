package ConfigurationPackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class TestConfiguration {
	
	
  @Test
  public void testCongfig() throws Exception {
	  
	  File src = new File("./ConfigurationFile/Config.property");
	  FileInputStream fis = new FileInputStream(src);
	  
	  //Create an object from the Properties java class
	  Properties pro = new Properties();
	  pro.load(fis);
	  String chromePath = pro.getProperty("ChromeDriver");
	  System.out.println("The property is:==>"+ chromePath);
  }
}
