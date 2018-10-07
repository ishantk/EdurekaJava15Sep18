package co.edureka.model;
/*
 * 
 * SQL Commands:
 * 
 * create table Employee(
 * 	eid int primary key auto_increment,
 * 	name varchar(256),
 * 	phone varchar(256),
 * 	email varchar(256),
 * 	salary int,
 * 	address varchar(256)
 * )
 * 
 * insert into Employee values(null,'Mike','+91 99999 55555','mike@example.com',60000,'Pristine Magnum')
 * 
 * update Employee set name = 'Mike Watson', email = 'mike.w@example.com', salary = 90000 where eid = 1
 * 
 * select * from Employee
 * 
 * delete from Employee where eid = 1
 * 
 */


public class Employee {

	// Attributes
	public int eid;
	public String name;
	public String phone;
	public String email;
	public int salary;
	public String address;
	
	public Employee(){
		
	}
	
	public Employee(int eid, String name, String phone, String email, int salary, String address) {
		this.eid = eid;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.salary = salary;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", phone=" + phone + ", email=" + email + ", salary="
				+ salary + ", address=" + address + "]";
	}
	
}
