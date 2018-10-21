package co.edureka.model;

import java.util.List;

public class Person {

	String name;
	String phone;
	String email;

	Address address; 			// HAS-A Relation (1 to 1)    -> Dependency
	List<String> certificates;	// HAS-A Relation (1 to many) -> Dependency
	
	public Person() {
		System.out.println(">> Person Object with Default Constructor");
		//address = new Address(); // WRONG -> HIGH COUPLING
	}
	
	// Through Constructor we have resolved dependency issue i.e. coupling goes low
	public Person(Address address) {
		System.out.println(">> Person Object with Person(Address address) Constructor");
		this.address = address;	  // RIGHT -> LOW COUPLING
	}

	public Person(String name, String phone, String email, Address address) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	// Through Setter Method we have resolved dependency issue i.e. coupling goes low
	public void setAddress(Address address) {
		System.out.println(">> Person Object with setAddress(Address address) Method");
		this.address = address;  // RIGHT -> LOW COUPLING
	}
	
	
	public List<String> getCertificates() {
		return certificates;
	}

	public void setCertificates(List<String> certificates) {
		this.certificates = certificates;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + ", email=" + email + ", address=" + address + "]";
	}
	
}
