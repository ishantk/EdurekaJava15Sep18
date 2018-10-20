package co.edureka.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import co.edureka.model.Employee;

public class AnnotationApp {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setName("George");
		emp1.setEmail("george@example.com");
		emp1.setDept("Administration");
		emp1.setSalary(60000);
		
		Employee emp2 = new Employee(null, "Jennie", "jennie@example.com", "R&D", 90000);
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		
		AnnotationConfiguration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		

		try {
			
			config = new AnnotationConfiguration();
			config.configure(); // Read i.e. Parse XMl File -> hibernate.cfg.xml
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession(); // Create Connection with DB
			
			transaction = session.beginTransaction();
			
			// 1. Insert Operation in DB
			// SQL Statements will be fired automatically !!
			//session.save(emp1);
			//session.save(emp2);
			
			//session.createSQLQuery();
		
			// Executing 100 SQL Statements:
			for(int i=1;i<=100;i++){
				Employee emp = new Employee(null, "Employee"+i, "employee"+i+"@example.com", "R&D", 50000+i);
				session.save(emp);
			}
			
			transaction.commit();
			
			System.out.println(">> Transaction Done");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
			e.printStackTrace();
		}finally{
			session.close(); // closing connection
		}

	}

}
