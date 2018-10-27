package co.edureka;

interface Plan{
	void setPlan();
	void showPlan();
}
class Plan2G implements Plan{
	int data;
	int price;
	public void setPlan() {
		data = 3; // 3GB of 2G Data
		price = 200;
	}
	public void showPlan() {
		System.out.println(data+"GB 2G Data is available for \u20b9"+price);
	}
}
class Plan3G implements Plan{
	int data;
	int price;
	public void setPlan() {
		data = 5; // 5GB of 3G Data
		price = 300;
	}
	public void showPlan() {
		System.out.println(data+"GB 3G Data is available for \u20b9"+price);
	}
}
class Plan4G implements Plan{
	int data;
	int price;
	public void setPlan() {
		data = 10; // 10GB of 4G Data
		price = 500;
	}
	public void showPlan() {
		System.out.println(data+"GB 4G Data is available for \u20b9"+price);
	}
}

class PlanFactory{
	
	public static Plan getPlan(int type){
		Plan plan = null;
		
		switch (type) {
			case 2:
				plan = new Plan2G();
				break;
			case 3:
				plan = new Plan3G();
				break;
			case 4:
				plan = new Plan4G();
				break;	
		}
		plan.setPlan();
		return plan;
	}
	
}

public class Factory {

	public static void main(String[] args) {
		// Client or User
		Plan plan = PlanFactory.getPlan(4);
		plan.showPlan();

	}

}
