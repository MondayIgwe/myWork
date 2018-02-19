package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigurationReader {
	Properties pro;
	
	
	public ConfigurationReader() throws Exception {
		File src = new File("./ConfigurationFile/Config.property");
		  FileInputStream fis = new FileInputStream(src);
		  
		  pro = new Properties();
		  pro.load(fis);
		 
	}
	
	public String getChrome() {
		String chromePath = pro.getProperty("ChromeDriver");
		return chromePath;
	}

}
