package co.edureka.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Manager;
import co.edureka.model.Project;

public class OneToManyApp {

	public static void main(String[] args) {
		
		/*Project project1 = new Project(null, "Galaxy Note", "Android", 6);
		Project project2 = new Project(null, "Galaxy S3", "Android", 8);
		Project project3 = new Project(null, "Galaxy Tab", "Android", 4);
		
		Project project4 = new Project(null, "Apple iPhoneX", "iOS", 7);
		Project project5 = new Project(null, "Apple iPhone", "iOS", 5);
		
		List<Project> projects1 = new ArrayList<Project>();
		projects1.add(project1); // 0
		projects1.add(project2); // 1
		projects1.add(project3); // 2
		
		List<Project> projects2 = new ArrayList<Project>();
		projects2.add(project4); // 0
		projects2.add(project5); // 1
		
		Manager mgr1 = new Manager();
		mgr1.setName("John Watson");
		mgr1.setDept("R&D");
		mgr1.setEmail("john@example.com");
		mgr1.setExp(10);
		mgr1.setProjects(projects1);
		
		Manager mgr2 = new Manager();
		mgr2.setName("Fionna Flynn");
		mgr2.setDept("Sales");
		mgr2.setEmail("fionna@example.com");
		mgr2.setExp(12);
		mgr2.setProjects(projects2);*/
		
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
			
			//session.save(mgr2); // Saving Manager will also save Projects !!
			
			// Fetching the data !!
			Manager mgr = (Manager)session.get(Manager.class, 2);
			System.out.println("=="+mgr.getName()+" handles below Projects==");
			List<Project> list = mgr.getProjects();
			for(Project p : list){
				System.out.println(p);
			}
			
			
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
