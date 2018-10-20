package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Phone;
import co.edureka.model.Product;
import co.edureka.model.SmartPhone;

public class InheritanceApp {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.setName("Samsung LED TV");
		product.setPrice(60000);
		
		Phone phone = new Phone();
		phone.setName("Samsung Note");
		phone.setPrice(50000);
		phone.setOs("Android");
		phone.setSimSlots(2);
		
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.setName("iPhone X");
		smartPhone.setPrice(80000);
		smartPhone.setOs("iOS");
		smartPhone.setSimSlots(1);
		smartPhone.setRam(2);
		smartPhone.setMemory(64);
		smartPhone.setScreenSize(5);
		
		
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
			
			session.save(product);
			session.save(phone);
			session.save(smartPhone);
			
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
