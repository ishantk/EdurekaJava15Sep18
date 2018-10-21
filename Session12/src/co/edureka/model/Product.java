package co.edureka.model;

// Bean
public class Product {
	
	// Product Attributes
	int pid;
	String name;
	String price;
	
	boolean isProductAvailable;
	boolean isAutoPaymentEnabled;
	
	public Product() {
	
	}

	public Product(int pid, String name, String price, boolean isProductAvailable, boolean isAutoPaymentEnabled) {
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.isProductAvailable = isProductAvailable;
		this.isAutoPaymentEnabled = isAutoPaymentEnabled;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public boolean isProductAvailable() {
		return isProductAvailable;
	}

	public void setProductAvailable(boolean isProductAvailable) {
		this.isProductAvailable = isProductAvailable;
	}

	public boolean isAutoPaymentEnabled() {
		return isAutoPaymentEnabled;
	}

	public void setAutoPaymentEnabled(boolean isAutoPaymentEnabled) {
		this.isAutoPaymentEnabled = isAutoPaymentEnabled;
	}
	
	// Business Method with Logic
	public void processProductPurchase(String time, String where){
		
		// 1. Check product stock and payment methods to buy product 		 -> Before
		//    This will be implemented using AOP Advice API: MethodBeforeAdvice
		
		// 2. Save the details in DB										 -> Actual
		//    We will write logic here
		// 	  Use JDBC/Hibernate to save the data in DB
		
		System.out.println();
		System.out.println("======= Core Logic ======");
		
		if(isProductAvailable){
			System.out.println("Order Created for Product "+pid+" "+name+" with Price "+price);
			
			if(time.equals("morning")){
				System.out.println("Deliver the product between 10 AM to 12 PM at "+where);
			}else{
				System.out.println("Deliver the product between 5 PM to 7 PM at "+where);
			}
		}else{
			System.out.println("Sorry!! "+name+" is out of Stock. Please try Later !!");
		}
		
		System.out.println("=========================");
		System.out.println();
		
		// 3. Notify Logistics or Shipment Department to ship the product	 -> After
		//    This will be implemented using AOP Advice API: AfterReturingAdvice
		
	}
	

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + ", isProductAvailable="
				+ isProductAvailable + ", isAutoPaymentEnabled=" + isAutoPaymentEnabled + "]";
	}

}
