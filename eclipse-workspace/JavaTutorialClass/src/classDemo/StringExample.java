package classDemo;

public class StringExample {

	public static void main(String[] args) {
		
		String name = "Selenium Automation Testing";
		  char[] webSiteName = {'T','O','O','L'};
		  
		  //new keyword and a constructor
		    String web = new String(webSiteName);
		    System.out.println(web +" is used for "+ name);
		    
		    //print the string lenght
		    int iLength = name.length();
		    System.out.println(iLength);
		    
		    //coompare method for  two strings
		    boolean bComp = name.equals(web);
		    System.out.println(bComp);
		    
		    //CharacterAt method
		    char cIndex = name.charAt(5);
		    System.out.println(cIndex);
		    
			  //Contains: This would return 'true' if the passed string is contained in the another String
		     boolean bContainString = name.contains("Testing");
		     System.out.println(bContainString);
		    
		   //Index of: This would return the starting index of the passed string
		     int iIndex = name.indexOf("Selenium");
		     System.out.println(iIndex);
		     
		   //Sub String First index: This would return the sub string of the string from the passed index 
		     String sSubString = name.substring(2, 7);
		     System.out.println(sSubString+"  "+ sSubString);
		    
		     //To Lower Case: It would return the complete string in the lower case
		     String sLowerCase = name.toLowerCase();
		     String sUpperCase = name.toUpperCase();
		     System.out.println(sLowerCase);
		     System.out.println(sUpperCase);
		     
		   //Split: It breaks the string in to two parts from the passed argument and store it in to array
		     String[] aSplit = name.split("Selenium");
		     System.out.println("first split"+"" +aSplit[0]);
		     System.out.println("Second split " +" "+aSplit[1]);
		 
		     
		     
		     
	}

}
