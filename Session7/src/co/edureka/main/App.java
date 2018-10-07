package co.edureka.main;

import java.util.ArrayList;

import co.edureka.db.JDBCHelper;
import co.edureka.model.Employee;

public class App {

	public static void main(String[] args) {
		
		System.out.println("==App Started==");
		
		// Data in Object is temporary. It shall be lost when program is finished !!
		Employee emp1 = new Employee(1, "Avni", "+91 99999 88888", "avni@exmaple.com", 50000, "Redwood Shores");
		Employee emp2 = new Employee(4, "Fionna Flynn", "+91 77777 77777", "fionna.fl@exmaple.com", 90000, "Country Homes North");
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		// DB Connectivity -> OOPS
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		//helper.insertEmployee(emp2);
		//helper.updateEmployee(emp2);
		//helper.deleteEmployee(4);
		
		/*ArrayList<Employee> employees = helper.getEmployees();
		
		for(Employee e : employees){
			System.out.println(e);
			System.out.println("***********");
		}*/
		
		//helper.executeProcedure(emp1);
		
		helper.processBatchTransaction();
		
		helper.closeConnection();
		
		System.out.println("==App Finished==");

	}

}
