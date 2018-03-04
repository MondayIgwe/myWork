package testNg;


/*
 * This class print the message on the console
 * 
 */

public class MessageUtil {
	
	public String message;
	
	//constructor
	//@param message to be printed
	public MessageUtil (String message)
	{
		this.message = message;
	}
	
	//print the message
	public String printMessage()
	{
		System.out.println("please print"+ message);
		return message;
	}

}
