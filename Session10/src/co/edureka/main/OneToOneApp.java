package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Address;
import co.edureka.model.Customer;

public class OneToOneApp {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setName("Mia");
		customer.setEmail("mia@example.com");
		customer.setPhone("+91 99999 77777");
		
		Address address = new Address();
		address.setAddressLine("Pristine Magnum");
		address.setCity("Bengaluru");
		address.setState("Karnataka");
		address.setZipCode(520001);
		
		 // One to One Mapping | 1 C with 1 A and vice versa
		customer.setAddress(address);
		address.setCustomer(customer);
		
		
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;

		try {
			
			config = new Configuration();
			config.configure(); // Read i.e. Parse XMl File -> hibernate.cfg.xml
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession(); // Create Connection with DB
			
			transaction = session.beginTransaction();
			
			session.save(customer); // Saving customer will also save Address -> cascade = all
			
			transaction.commit();
			
			System.out.println(">> Transaction Done");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
			e.printStackTrace();
		}finally{
			session.close(); // close connection
		}
	
	}

}
