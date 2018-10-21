package co.edureka.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import co.edureka.model.Address;
import co.edureka.model.CB;
import co.edureka.model.Child;
import co.edureka.model.Connection;
import co.edureka.model.Father;
import co.edureka.model.Person;

/*
 Spring Procedure:
	1. Write a Bean which is Java Class with attributes constructors getters and setters
	2. Copy XML file in src directory and configure objects.
	3. Link all Spring Core Jar Files in our project
	4. Write a class with main method to test Spring IOC
 */

public class App {

	public static void main(String[] args) {
		
		// Object Construction:
		/*Connection con1 = new Connection();
		con1.setDriver("com.mysql.jdbc.Driver");
		con1.setUrl("jdbc:mysql://localhost/edureka");
		con1.setUsername("root");
		con1.setPassword("pass123");
		
		Connection con2 = new Connection("jdbc:mysql://localhost/students", "john", "john123", "com.mysql.jdbc.Driver");
		
		System.out.println(con1);
		System.out.println(con2);*/

		// Q. What can be disadvantage of writing objects like above ?
		// A. Lets say, we developed and have given the app to the customer. Now, database is suppose to be changed with above details !!
		//    We will have to recompile the source code and will again develop the app and give it to the customer !!
		//    If app is an enterprise app it will take lot of time to get compiled and deployed and re-tested for the same features
		
		// Spring FW: Inversion of Control
		// IOC states that you do not create objects. IOC container in the Spring FW will create Objects.
		// We will use XML file in our src directory, where we will configure the object's data. Anytime we can edit XML File.
		// IOC Container will be responsible to create and manage life cycle of Objects.
		// IOC Containers: 1. BeanFactory | 2. ApplicationContext 
		
		// 1. IOC Container : BeanFactory
		//Resource resource = new ClassPathResource("beans.xml"); // Parse beans.xml file
		//BeanFactory factory = new XmlBeanFactory(resource);		// IOC Container Creation

		// BeanFactory will not create objects till you do not request for them.
		// Requesting for the objects is by calling getBean method.
		
		/*Connection con1 = (Connection)factory.getBean("cRef1");
		Connection con2 = factory.getBean("cRef2",Connection.class);
		
		System.out.println(con1);
		System.out.println(con2);*/
		
		// 2. IOC Container : ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		// ApplicationContext will create objects before you request for them.
		
		/*Connection con1 = (Connection)context.getBean("cRef1");
		Connection con2 = context.getBean("cRef2",Connection.class);
		
		System.out.println(con1);
		System.out.println(con2);*/
		
		// We are requesting for the same bean id again
		// We will always get the reference to the same object
		// i.e. SingleTon which means only one object
		//Connection con1 = context.getBean("cRef1",Connection.class);
		//Connection con2 = context.getBean("cRef1",Connection.class);
		
		//System.out.println(con1);
		//System.out.println(con2);
		
		//Child child = context.getBean("cRef",Child.class);
		//System.out.println(child);
		
		// Run Time Polymorphism:
		// ref variable of Parent can point to child object !!
		//Father child = context.getBean("cRef",Child.class);
		//System.out.println(child);
		
		
		
		// When we create object of Person, Object of Address will be constructed
		// Address Object construction is dependent on Person object construction -> high coupling
		//Person person = new Person();
		
		//Address address = new Address();

		//Person person = new Person(address);
		
		//Person person = new Person();
		//person.setAddress(address);
		
		// HAS-A Relationship with Spring FW:
	
		/*Person person = context.getBean("pRef",Person.class);
		System.out.println(person);
		
		System.out.println("==Certifications for "+person.getName()+"==");
		System.out.println(person.getCertificates());*/
		
		CB cRef = context.getBean("cb",CB.class);
		cRef.hello("Fionna Flynn");
		cRef.show();
		
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		cxt.close(); // Close the IOC Container
		
	}

}
