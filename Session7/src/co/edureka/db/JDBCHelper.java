package co.edureka.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import co.edureka.model.Employee;

// Design Pattern -> DAO i.e. Data Access Object
// Its an Object by which we are accessing DB
public class JDBCHelper {
	
	Connection con;
	
	Statement stmt;
	PreparedStatement pStmt;
	
	CallableStatement cStmt;
	
	//1. Load the Driver
	public JDBCHelper() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println(">> Driver Loaded");
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	// 2. Create Connection to DB 
	public void createConnection(){
		try {
			
			// URL will be different for diff DB's or for diff servers
			String url = "jdbc:mysql://localhost/edureka";
			String user = "root";
			String password = "";
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println(">> Connection Created");
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	// 3. Write SQL Statement
	// 4. Execute SQL Statement
	public void insertEmployee(Employee emp){
		try {
			//3.
			//String sql = "insert into Employee values(null,'"+emp.name+"','"+emp.phone+"','"+emp.email+"',"+emp.salary+",'"+emp.address+"')"; 
			
			//4.
			//stmt = con.createStatement();
			//int i = stmt.executeUpdate(sql); // executeUpdate will execute insert update and delete SQL commands
			
			
			// ? is a wild card character -> they will start from index as 1
			String sql = "insert into Employee values(null, ?, ?, ?, ?, ?)";
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, emp.name);
			pStmt.setString(2, emp.phone);
			pStmt.setString(3, emp.email);
			pStmt.setInt(4, emp.salary);
			pStmt.setString(5, emp.address);
			int i = pStmt.executeUpdate();  // executeUpdate will execute insert, update and delete SQL commands
			if(i>0){
				System.out.println(">> "+emp.name+" inserted");
			}else{
				System.out.println(">> "+emp.name+" not inserted");
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	public void updateEmployee(Employee emp){
		try {
			
			// ? is a wild card character -> they will start from index as 1
			String sql = "update Employee set name = ?, phone = ?, email = ?, salary = ?, address = ? where eid = ?";
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, emp.name);
			pStmt.setString(2, emp.phone);
			pStmt.setString(3, emp.email);
			pStmt.setInt(4, emp.salary);
			pStmt.setString(5, emp.address);
			pStmt.setInt(6, emp.eid);
			int i = pStmt.executeUpdate();  // executeUpdate will execute insert, update and delete SQL commands
			if(i>0){
				System.out.println(">> "+emp.name+" updated");
			}else{
				System.out.println(">> "+emp.name+" not updated");
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	public void deleteEmployee(int eid){
		try {
			
			// ? is a wild card character -> they will start from index as 1
			String sql = "delete from Employee where eid = ?";
			pStmt = con.prepareStatement(sql);
			pStmt.setInt(1, eid);
			int i = pStmt.executeUpdate();  // executeUpdate will execute insert, update and delete SQL commands
			if(i>0){
				System.out.println(">> "+eid+" deleted");
			}else{
				System.out.println(">> "+eid+" not deleted");
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	public ArrayList<Employee> getEmployees(){
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		try {
			
			String sql = "select * from Employee";
			pStmt = con.prepareStatement(sql);
			
			ResultSet rs = pStmt.executeQuery(); //executeQuery will be used to retrieve i.e. fetch the data from DB
			
			while(rs.next()){
				
				Employee emp = new Employee();
				emp.eid = rs.getInt(1);
				emp.name = rs.getString(2);
				emp.phone = rs.getString(3);
				emp.email = rs.getString(4);
				emp.salary = rs.getInt(5);
				emp.address = rs.getString(6);
				
				//System.out.println(emp);
				//System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
				
				employees.add(emp);
			}
			
			rs.close();
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
		
		return employees;
	}
	
	public void executeProcedure(Employee emp){
		try {
			String sql = "{ call addEmployee(?, ?, ?, ?, ?) }";
			
			cStmt = con.prepareCall(sql);
			cStmt.setString(1, emp.name);
			cStmt.setString(2, emp.phone);
			cStmt.setString(3, emp.email);
			cStmt.setInt(4, emp.salary);
			cStmt.setString(5, emp.address);
			
			cStmt.execute();
			
			System.out.println(">> Sored Procedure Executed");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	public void processBatchTransaction(){
		try {
			
			String sql1 = "delete from Employee where eid = 2";
			String sql2 = "update Employee set ename = 'Fionna Frank', salary = 89000 where eid = 5";
			
			stmt = con.createStatement();
			con.setAutoCommit(false);
			
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			
			stmt.executeBatch();
			con.commit(); // Fire batch as a transaction !!
			
			System.out.println(">> Transaction Committed");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
			
			try {
				con.rollback();
				System.out.println(">> Transaction RollBacked");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}
	}
	
	public void closeConnection(){
		try {
			con.close();
			System.out.println(">> Connection Closed");
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}

}
