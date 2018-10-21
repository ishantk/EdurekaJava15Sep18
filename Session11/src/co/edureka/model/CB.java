package co.edureka.model;

import org.springframework.beans.factory.annotation.Autowired;

public class CB implements Inf{

	CA ca; // Has-A Relation | 1 to 1 (Dependency)

	public CB() {
		System.out.println("==Object with Default Constructor==");
	}

	//@Autowired
	public CB(CA ca) {
		System.out.println("==DI with Constructor==");
		this.ca = ca;
	}

	public CA getCa() {
		return ca;
	}

	@Autowired
	public void setCa(CA ca) {
		System.out.println("==DI with Setter==");
		this.ca = ca;
	}
	
	public void hello(String name){
		ca.sayHello(name);
	}

	@Override
	public void show() {
		System.out.println("This is show");
	}
	
}
