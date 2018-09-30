package co.edureka.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

class Employee{
	
	// Attributes of Employee Object
	int eid;
	String name;
	String email;
	
	Employee(){
		
	}

	public Employee(int eid, String name, String email) {
		this.eid = eid;
		this.name = name;
		this.email = email;
	}
	
	void showEmployee(){
		System.out.println(eid+" belongs to "+name+" and can be emailed at "+email);
	}
	
	String empDetailsToCSV(){
		return eid+","+name+","+email+"\n";
	}
}

public class FileIOOperations {
	
	void saveEmployeeInFile(Employee emp){
		
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/employees30Sep.csv");
			/*if(file.exists()){
				System.out.println(file.getName()+" exists !!");
			}else{
				System.out.println(file.getName()+" does not exists !!");
			}*/
			
			// API : FileOutputStream will write data in file in the form of bytes !!
			//FileOutputStream fos = new FileOutputStream(file);
			FileOutputStream fos = new FileOutputStream(file,true); // true is enable append mode
			String data = emp.empDetailsToCSV();
			fos.write(data.getBytes());
			fos.close(); // release the memory resources
			System.out.println("==Data Written in "+file.getName()+"==");
			
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
	}
	
	void saveEmployeeInFileAgain(Employee emp){
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/employees30Sep2018.csv");
			
			// API : FileWriter will write data in file in the in text !!
			//FileWriter fw = new FileWriter(file);
			FileWriter fw = new FileWriter(file,true); // true is enable append mode
			String data = emp.empDetailsToCSV();
			fw.write(data);
			fw.close(); // release the memory resources
			System.out.println("==Data Written in "+file.getName()+"==");
			
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
	}
	
	void readEmployees(){
		try {
			File file = new File("/Users/ishantkumar/Downloads/employees30Sep.csv");
			
			// API: FileInputStream, which reads file in the form of bytes
			FileInputStream fis = new FileInputStream(file);
			
			int i = 0;
			char ch = ' ';
			// Reading byte by byte
			while((i = fis.read()) != -1){
				ch = (char)i;
				System.out.print(ch);
			}
			fis.close();
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
	}
	
	void readEmployeesAgain(){
		try {
			File file = new File("/Users/ishantkumar/Downloads/employees30Sep2018.csv");
			
			// API: FileReader, which reads file in the form of text
			FileReader fr = new FileReader(file);
			BufferedReader buffer = new BufferedReader(fr); // Will Read the data line by line in the form of String i.e. text
			String line = "";
			
			while((line = buffer.readLine()) !=null){
				//System.out.println(line);
				
				// Lets convert the read line i.e. a csv line into an Employee Object:
				
				String[] strArr = line.split(",");
				//System.out.println(strArr[0]+"\t"+strArr[1]+"\t"+strArr[2]);
				int eid = Integer.parseInt(strArr[0]); // Using Wrapper Class to convert String into integer
				
				Employee emp = new Employee(eid,strArr[1],strArr[2]);
				emp.showEmployee();
			}
			
			fr.close();
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
	}

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.eid = 101;
		e1.name = "John";
		e1.email = "john@example.com";
		
		Employee e2 = new Employee(201,"Jennie","jennie@example.com");
		
		//e1.showEmployee();
		//e2.showEmployee();

		// Data in Object is temporary. When program finished data is LOST !!
		// We can persist i.e. save the data of an object in a file !! (PERSISTANCE)
		
		FileIOOperations io = new FileIOOperations();
		//io.saveEmployeeInFile(e1);
		//io.saveEmployeeInFileAgain(e1);
		//io.saveEmployeeInFileAgain(e2);
		
		//io.readEmployees();
		io.readEmployeesAgain();
	}

}
