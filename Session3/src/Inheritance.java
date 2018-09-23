class Product{
	
	// Attributes: Non Static: Property Of Object
	int pid;
	String name;
	int price;
	
	// Attributes: Static: Property Of Class
	static String appName;
	
	// Methods: Non Static: Property Of Object
	// Constructor
	//Gets Executed when Object is constructed in the RAM. Kind of 1st Method which automatically gets executed !!
	// So that we can define some initial values to attributes
	Product(){ 
		pid = 101;
		name = "NA";
		price = 100;
		System.out.println(">> Product Object Constrcuted");
	}
	
	void setProductDetails(int pid, String name, int price){ // Input List int pid, String name, int price belongs to method
		//LHS this.pid is property of Object and RHS pid is property of method
		this.pid = pid;
		this.name = name;
		this.price = price;
		System.out.println(">> Product Details Written");
	}
	
	void showProductDetails(){
		System.out.println("----------------------------------");
		System.out.println("PID\tNAME\t\tPRICE");
		System.out.println(pid+"\t"+name+"\t\t"+price);
		System.out.println("----------------------------------");
	}
	
	static void setAppName(String appName){
		//LHS User.appName is property of Class and RHS appName is property of method
		Product.appName = appName;
	}
	
	static void showAppName(){
		System.out.println("** "+appName+" **");
	}
}

class LEDTV extends Product{ // LEDTV IS A Product
	
	// Attributes: Non Static : Property of LEDTV Object
	String brand;
	int screenSize;
	String technology;
	
	// Attributes: Static : Property of LEDTV Class
	static String color;
	
	LEDTV(){
		System.out.println(">> LEDTV Object Constrcuted");
	}
	
	// 1. Overloading : Use the same method with different inputs and hence a different definition
	// setProductDetails is now Overloaded
	void setProductDetails(int pid, String name, int price, String brand, int screenSize, String technology){
		//LHS this.pid is property of Object and RHS pid is property of method
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.screenSize = screenSize;
		this.technology = technology;
		System.out.println(">> Product Details Written");
	}
	
	//2. Overriding : Use the same method with different inputs(if any) but only in Parent Child Relationship
	void showProductDetails(){
		
		// Accessing Parent Object's Properties, we can use super as a keyword
		super.showProductDetails();
		
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("PID\tNAME\t\tPRICE\t\tBRAND\t\tSCREEN\t\tTECHNOLOGY");
		System.out.println(pid+"\t"+name+"\t\t"+price+"\t\t"+brand+"\t\t"+screenSize+"\t\t"+technology);
		System.out.println("---------------------------------------------------------------------------");
	}
	
	// Overloading in Class Level Methods
	static void setAppName(String appName, String color){
		//LHS User.appName is property of Class and RHS appName is property of method
		LEDTV.appName = appName;
		LEDTV.color = color;
	}
	
	// Hiding in Class to Class Inheritance | As Overiding in Object to Object
	static void showAppName(){
		System.out.println("** "+appName+" **");
		System.out.println("** Product Color is "+color+" **");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		
		/*Product pRef = new Product();
		pRef.showProductDetails();
		pRef.setProductDetails(1001, "Cookies", 20);
		pRef.showProductDetails();*/
		
		// LEDTV is a Product
		// We are requesting for the Object of LEDTV !!
		// Rule of Inheritance says Parent Object is Constructed and then the Child Object is Constructed
		// Parent's Objects Properties(Attributes/Methods) are inherited into the Child Object
		// Constructor and private things are not inherited !!
		LEDTV tv = new LEDTV(); 
		//tv.showProductDetails();
		//tv.setProductDetails(2001, "Box", 300);
		//tv.showProductDetails();
		
		//tv.setProductDetails(2001, "CurvLED", 50000);
		tv.setProductDetails(2001, "CurvLED", 50000, "Samsung", 50 ,"OLED");
		tv.showProductDetails(); // which showProductDetails ? Parent or Child | Ans: Child ? Why -> tv is Ref Variable to LEDTV Object
		
		LEDTV.setAppName("eCOM","BLACK");
		LEDTV.showAppName();
	}

}
