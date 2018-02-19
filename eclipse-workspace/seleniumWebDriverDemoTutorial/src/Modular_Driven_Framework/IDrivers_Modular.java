package Modular_Driven_Framework;

/**
 * @author Administrator
 *ALL THE ACTIONS YOU CAN THINK OFF THAT IS PERFORMED ON THE APPLICATION
 *Action that take arguements or parameters
 */
public interface IDrivers_Modular {

	
	void openBrowser(String Url) throws Exception;
	
	public void closeBrowser() throws Exception;
	
	public void getCurrentUrl() throws Exception;
	
	public void getTitle() throws Exception;
	
	public void setPageLoadTime() throws Exception;
	
	public void setImplicitWait() throws Exception;
	
	public void  getUrl() throws Exception;



	
}
