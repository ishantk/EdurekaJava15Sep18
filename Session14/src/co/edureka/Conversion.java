package co.edureka;

import java.util.Date;

// Web Service !!
public class Conversion {

	// Web Methods
	public String sayHello(String name){
		Date date = new Date();
		String response = "Hello, "+name+" Its "+date;
		return response;
	}
	
	public int feetToInches(int feet){
		int inches = feet * 12;
		return inches;
	}
	
	public int dollarToRupee(int dollar){
		int rupee = dollar * 70;
		return rupee;
	}
	
	public int mtrsToCms(int mtrs){
		int cms = mtrs * 100;
		return cms;
	}
	
	public String addCustomer(String name, String phone, String email){
		// JDBC/Hibernate Operation Goes Here
		return name+" added in the System";
	}
}
