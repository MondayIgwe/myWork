package programmingKnowledeg;

public class MessageUtil {
	private String message;
	
	//Constructor 
	public MessageUtil(String message)
	{
		this.message= message;
	}
	
	//prints the message
	public String printMessage()
	{
	System.out.println(message);
	return message;
}
}
