package com.tutorialpoint;

import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;



public class WebServiceTester {
	
	private Client client;
	
	private String REST_SERVICE_URL = "http://localhost:8080/UserManagement/rest/UserService/users";
	
	private static final String PASS = "pass";
	private static final String FAIL = "fail";
	

	public void initialize() {
		this.client = ClientBuilder.newClient();
	}
	
	
	public static void main(String[] args) {
		WebServiceTester tester = new WebServiceTester();
		
		//initualize the tester
		tester.initialize();
		
		//test get all users web services Method
		
		
		
		
		//Test: Get list of all users
		//Test: Check if list is not empty
	}
	
	
		private void testGetAllUsers() {
			GenericType<List<User>>List = new GenericType<List<User>>() {};
			List<User> users = client
					.target(REST_SERVICE_URL)
					.request(MediaType.APPLICATION_XML)
					.get(List);
			
			String result = PASS;
			if(result.isEmpty()) {
				result = FAIL;
			}
			System.out.println("Test case name: testGetAllUsers, Result: " + result);
			
		}
		
		//Test: Get User of id 1
		//Test: Check if user is same as sample userm, 
		
	}
}
