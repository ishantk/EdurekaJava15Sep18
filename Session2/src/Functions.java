
public class Functions {
	
	// Function or a Method which has no ack as it is void
	// It is having no input
	// sayHello is non static
	void sayHello(){
		System.out.println("Hello, This is Hello from Java !!");
	}
	
	// Function or a Method which has no ack as it is void
	// It is having no input
	// sayBye is static
	static void sayBye(){
		System.out.println("Hello, This is Bye from Java !!");
	}
	
	// Function or a Method which has no ack as it is void
	// It is having 2 inputs a and b which are both integers
	// addNumbers is non static
	void addNumbers(int a, int b){
		int c = a + b;
		System.out.println("sum of "+a+" and "+b+" is "+c);
	}
	
	
	// Function or a Method which has int as ack. So we need to return an integer in the END
	// It is having 2 inputs a and b which are both integers
	// addNumbers is non static
	int addNumbersAgain(int a, int b){
		int c = a + b;
		return c; // Must return some integer in the end else it would be an error
	}
	
	// Function or a Method which has no ack as it is void
	// It is having 2 inputs a and b which are both integers
	// multiplyNumbers is non static
	static void multiplyNumbers(int a, int b){
		int c = a * b;
		System.out.println("multiplication of "+a+" and "+b+" is "+c);
	}
	
	// Function or a Method which has int as ack. So we need to return an integer in the END
	// It is having 2 inputs a and b which are both integers
	// multiplyNumbers is non static
	static int multiplyNumbersAgain(int a, int b){
		int c = a * b;
		return c; // Must return some integer in the end else it would be an error
	}

	public static void main(String[] args) {
		
		// How to Execute Methods? Making the method run its statements in a sequence
		// We will execute the methods in main over here...
		
		// 1. Execution of non static methods
		// Create an Object of Functions !! // We will discuss object later
		Functions fRef = new Functions(); // Object Construction statement. fRef can be any name of your choice
		fRef.addNumbers(10, 20);
		fRef.addNumbers(11, 33);
		
		int result = 0;
		result = fRef.addNumbersAgain(12, 12);
		System.out.println("Result is: "+result);
		
		fRef.sayHello();
		
		System.out.println("==================");
		
		//2. Execution of static methods
		// Use class name
		Functions.multiplyNumbers(12, 15);
		Functions.multiplyNumbers(15, 17);
		
		result = Functions.multiplyNumbersAgain(14, 19);
		System.out.println("Result is: "+result);
		
		Functions.sayBye();
	}

}
