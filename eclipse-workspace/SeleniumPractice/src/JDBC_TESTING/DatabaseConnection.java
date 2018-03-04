package JDBC_TESTING;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Register or Establish the connection
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		//create a variable for the database connection string
		String connectionUrl = "jdbc:sqlserver://localhost:1433;" +"+databaseName=System Database;integratedSecurity=true;";
		
		//Declare the connnection variables
				Connection con = null;
				Statement stmt = null;
				ResultSet rs = null;
				
				//connect to the database
				con = DriverManager.getConnection(connectionUrl);
				System.out.println("Connection Succesfully Established");
				
				
				//Create and execute an SQL statement the returns some data
				String SQL = "SELECT * FROM dbo.MSreplication_options";
					stmt = con.createStatement();
					rs = stmt.executeQuery(SQL);
					
					//iterate through the data in the resut set and display it
					while(rs.next()) {
						System.out.println(rs.getString(1)+" "+rs.getString(2));
						
					}
	
					//close the connection
					con.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
