package co.edureka.model;

public class SmartPhone extends Phone{

	// Attributes
	Integer ram;
	Integer memory;
	Integer screenSize;
	
	public SmartPhone() {
	
	}

	public SmartPhone(Integer ram, Integer memory, Integer screenSize) {
		this.ram = ram;
		this.memory = memory;
		this.screenSize = screenSize;
	}

	public Integer getRam() {
		return ram;
	}

	public void setRam(Integer ram) {
		this.ram = ram;
	}

	public Integer getMemory() {
		return memory;
	}

	public void setMemory(Integer memory) {
		this.memory = memory;
	}

	public Integer getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(Integer screenSize) {
		this.screenSize = screenSize;
	}

	@Override
	public String toString() {
		return "SmartPhone [ram=" + ram + ", memory=" + memory + ", screenSize=" + screenSize + ", simSlots=" + simSlots
				+ ", os=" + os + ", pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}
}
