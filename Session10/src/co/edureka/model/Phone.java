package co.edureka.model;

public class Phone extends Product{
	
	// Attributes
	Integer simSlots;
	String os;
	
	public Phone() {

	}
	
	public Phone(Integer simSlots, String os) {
		this.simSlots = simSlots;
		this.os = os;
	}
	
	public Integer getSimSlots() {
		return simSlots;
	}
	public void setSimSlots(Integer simSlots) {
		this.simSlots = simSlots;
	}
	
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	
	@Override
	public String toString() {
		return "Phone [simSlots=" + simSlots + ", os=" + os + ", pid=" + pid + ", name=" + name + ", price=" + price
				+ "]";
	}
}
