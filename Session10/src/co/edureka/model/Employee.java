package co.edureka.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// Model or Bean or POJO
@Entity
@Table(name="EMPLOYEES")
public class Employee {

	// Attributes
	@Id @GeneratedValue
	@Column(name="EID")
	Integer eid;
	
	@Column(name="NAME")
	String name;
	
	@Column(name="EMAIL")
	String email;
	
	@Column(name="DEPT")
	String dept;
	
	@Column(name="SALARY")
	Integer salary;
	
	public Employee() {
	
	}

	public Employee(Integer eid, String name, String email, String dept, Integer salary) {
		this.eid = eid;
		this.name = name;
		this.email = email;
		this.dept = dept;
		this.salary = salary;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", email=" + email + ", dept=" + dept + ", salary=" + salary
				+ "]";
	}
	
	
	
}
