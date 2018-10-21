package co.edureka.model;

import java.util.Date;

public class CA {

	public void sayHello(String name){
		Date date = new Date();
		String hello = "Welcome, "+name+"\nIts: "+date;
		System.out.println(hello);
	}
	
}
