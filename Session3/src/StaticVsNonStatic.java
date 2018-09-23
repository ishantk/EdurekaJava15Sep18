/* 
   Class and Object
   
   Object : is a Multi Value Container which can hold data
    		So, its just a box containing data
    		It can be homogeneous or hetrogeneous
    		
    		As a Container, Object can hold attributes and methods
    		
   Class : is a textual representation how an object will look like in the memory !! 		
          
*/

// How to create an Object ??
// Start writing a textual description that what you want in your object !!

class User{ // We are writing here what shall be within my object !!
	
	// Attributes: Belongs to Object and Not to Class
	String name;
	String phone;
	String email;
	int age;
	char gender;
	String address;
	
	// Attributes: Belongs to Class and Not to Object
	static String appName;
	
	// Methods : Belongs to Object (Non Static)
	// To Perform Write Operation
	void setUserDetails(String name, int a, String e){
		// this.name is object's attribute and name is method's local variable
		this.name = name; // this is a ref variable which will point to current object in use
		age = a;
		email = e;
	}
	
	// To Perform Read Operation
	void showUserDetails(){
		System.out.println("*****************");
		// Rule : Non Static can access static !!
		// Why No Error: Because appName is only 1 which belongs to only 1 class i.e. User Class !!
		System.out.println(name+" is using "+User.appName);
		System.out.println(name+" is "+age+" years old and can be emailed at "+email);
		System.out.println("*****************");
	}
	
	// Methods : Belong to Class (Static)
	
	// To Perform Write Operation
	static void setAppName(String a){
		appName = a;
	}
	
	// To Perform Write Operation
	static void showAppName(){
		System.out.println("App Name is: "+appName);
		
		// Rule : Cannot Access Non Static from Static Context !!
		// error: // name belongs to object and we cannot access it here
		// Since we dont know which object's name we are talking here !!
		// System.out.println("Name is: "+name);  
	}
		
}


public class StaticVsNonStatic {

	// main is executed 1stly !! and main frame will be created in Stack area !!
	public static void main(String[] args) {
	
		int i = 10; // create a Single Value Container i.e. i and write the value 10 in it !!
		
		// Read and Write Operations for Object and Class !!
		
		// 1. Object Construction Statement
		// new operator creates an object when application will run !!
		// user1 is a reference variable which holds the hashCode of the Object. hashCode is a way to reach to the Object
		User user1 = new User();
		User user2 = new User();

		User user3 = user1; // Reference Copy !!
		
		System.out.println("i is "+i);
		System.out.println("user1 is "+user1);
		System.out.println("user2 is "+user2);
		System.out.println("user3 is "+user3);
		
		// Write Operation in Object, using the reference variable
		// user1 or user3 means the same object
		user1.name = "John";
		user3.phone = "+91 99999 88888";
		user1.email = "john@example.com";
		user1.age = 20;
		user1.gender = 'M';
		user3.address = "Redwood Shores";
		
		user2.name = "Jennie";
		user2.phone = "+91 99999 77777";
		user2.email = "jennie@example.com";
		user2.age = 22;
		user2.gender = 'F';
		user2.address = "Southern Shores";
		
		// Write Data in Class
		User.appName = "Edureka";
		
		// Data in Class Container can be also accessed by Object's Reference
		user1.appName = "Edureka.co"; // But this isn't recommended !! (Here Data Updation Happened in Class Container)
		
		// Reading the data from Object
		System.out.println(user3.name+" is "+user1.age+" years old and lives in "+user1.address);
		System.out.println(user2.name+" is "+user2.age+" years old and lives in "+user2.address);
		
		User.appName = "Edureka App";
		
		// Read Operation from Class
		System.out.println("App Name is: "+User.appName);
		
		// manipulate data for Object using a Method
		user1.setUserDetails("John Watson", 33, "john.w@example.com");
		
		// Access Object's Methods
		user1.showUserDetails();
		user2.showUserDetails();
		
		User.setAppName("Edureka LMS App");
		User.showAppName();

	}

}
