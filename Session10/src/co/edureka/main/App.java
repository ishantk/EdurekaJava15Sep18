package co.edureka.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import co.edureka.model.Employee;


/*
 Hibernate Procedure:
	1. Link all Hibernate Jar Files
	2. Copy hibernate.cfg.xml file in src directory of our project
	3. Create a Java Class i.e. Model or Bean or POJO
	4. Copy anyname.hbm.xml file in src directory of our project and edit it to map class with table
	5. Create a client class with main method and test Hibernate Code
 */

public class App {

	public static void main(String[] args) {
		
		/*Employee emp1 = new Employee();
		emp1.setName("George");
		emp1.setEmail("george@example.com");
		emp1.setDept("Administration");
		emp1.setSalary(60000);
		
		Employee emp2 = new Employee(null, "Jennie", "jennie@example.com", "R&D", 90000);
		
		System.out.println(emp1);
		System.out.println(emp2);*/
		
		// Objects contain data which is temporary.
		// We need to save the data in DB
		// We will use Hibernate API's to save the data in DB !!
		
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		

		try {
			
			config = new Configuration();
			config.configure(); // Read i.e. Parse XMl File -> hibernate.cfg.xml
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession(); // Create Connection with DB
			//session1 = factory.openSession(); // we can have multiple sessions !!
			
			transaction = session.beginTransaction();
			
			// 1. Insert Operation in DB
			// SQL Statements will be fired automatically !!
			//session.save(emp1);
			//session.save(emp2);
			
			
			// 2. Fetch Operation from DB
			// Converts Fetched data into Object directly !!
			//Employee emp = (Employee)session.get(Employee.class, 3);
			//System.out.println(emp);
			
			// 3. Update Operation in DB
			// You get the Employee Object first and then change the data
			//Employee emp = (Employee)session.get(Employee.class, 3); // where eid = 3
			//emp.setName("George Watson");
			//emp.setEmail("g.watson@example.com");
			//emp.setSalary(77980);
			
			//session.update(emp);
			
			// 4. Delete Operation in DB
			//Employee emp = new Employee();
			//emp.setEid(3);
			
			//session.delete(emp);
			
			// 5. Fetch all records
			// 5.1 HQL
			//String hql = "From Employee"; // Hibernate Query Language
			/*String hql = "From Employee where salary > 60000";
			List<Employee> employees = session.createQuery(hql).list();
			//session.createSQLQuery("any sql query goes here"); // Raw SQL Query execution
			for(Employee emp : employees){
				System.out.println(emp);
			}*/
			
			// 5.2 Criteria API
			/*Criteria criteria = session.createCriteria(Employee.class);
			criteria.add(Restrictions.gt("salary", 60000));
			List<Employee> employees = criteria.list();
			for(Employee emp : employees){
				System.out.println(emp);
			}*/
			
			Employee emp1 = (Employee)session.get(Employee.class, 1);
			System.out.println(emp1);
			
			Employee emp2 = (Employee)session.get(Employee.class, 2);
			System.out.println(emp2);
			
			System.out.println("==Re Fetching the same Records==");
			Employee emp3 = (Employee)session.get(Employee.class, 1);
			System.out.println(emp3);
		
			Employee emp4 = (Employee)session.get(Employee.class, 2);
			System.out.println(emp4);
			
			transaction.commit();
			
			System.out.println(">> Transaction Done");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
			e.printStackTrace();
		}finally{
			// Till Time session is not closed, data remains in the cache !!
			session.close(); // close connection
			factory.close();
			
		}
		
	}

}
