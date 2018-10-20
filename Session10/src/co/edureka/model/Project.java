package co.edureka.model;

// Is Existing as an Independent Object
public class Project {

	Integer pid;
	String name;
	String technology;
	Integer timeLine; // In Months
	
	public Project() {
	
	}

	public Project(Integer pid, String name, String technology, Integer timeLine) {
		this.pid = pid;
		this.name = name;
		this.technology = technology;
		this.timeLine = timeLine;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public Integer getTimeLine() {
		return timeLine;
	}

	public void setTimeLine(Integer timeLine) {
		this.timeLine = timeLine;
	}

	@Override
	public String toString() {
		return "Project [pid=" + pid + ", name=" + name + ", technology=" + technology + ", timeLine=" + timeLine + "]";
	}
	
}
