package co.edureka.model;

import java.util.List;

public class Manager {
	
	// Attributes
	Integer mid;
	String name;
	String email;
	Integer exp;
	String dept;
	
	List<Project> projects; // Has-A Relationship | 1 to many
	
	public Manager() {
	
	}

	public Manager(Integer mid, String name, String email, Integer exp, String dept, List<Project> projects) {
		this.mid = mid;
		this.name = name;
		this.email = email;
		this.exp = exp;
		this.dept = dept;
		this.projects = projects;
	}

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
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

	public Integer getExp() {
		return exp;
	}

	public void setExp(Integer exp) {
		this.exp = exp;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Manager [mid=" + mid + ", name=" + name + ", email=" + email + ", exp=" + exp + ", dept=" + dept
				+ ", projects=" + projects + "]";
	}

}
