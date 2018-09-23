// Method or Function or Routine !!
// can be non static
// or can be static

public class MethodsDemo {
	
	// non static
	void calculateArea(int side){
		// area and side belongs to calculateArea method as they are created in the calculateArea block
		int area = side * side; 
		System.out.println("Area of Square is: "+area);
	}
	
	// static
	static void squareOfNum(int num){
		System.out.println("Square of "+num+" is "+(num*num));
	}
	
	// Methods can be Overloaded !! Based on Inputs !!
	// Overloading ? is having same name of the method but with different inputs !!
	// 1. Method Name is Same
	// 2. Inputs should be Different
	//    2.1 Number of Inputs
	// 	  2.2 Type of Inputs
	// 	  2.3 Sequence of Inputs 	
	// 3. Return Type has no role to play 
	
	// PS: Method Signature is always unique where return type shouldnt have any role
	
	// Type
	void calculateArea(double side){
		// area and side belongs to calculateArea method as they are created in the calculateArea block
		double area = side * side; 
		System.out.println("Area of Square is: "+area);
	}
	
	// We cannot overload on the basis of Retuen Type.
	/*double calculateArea(double side){
		// area and side belongs to calculateArea method as they are created in the calculateArea block
		double area = side * side; 
		return area;
	}*/
	
	// Number
	void calculateArea(int length, int breadth){ // 2 inputs
		double area = length * breadth; 
		System.out.println("Area of Rectangle is: "+area);
	}
	
	// Sequence
	void calculateArea(int length, double breadth){
		double area = length * breadth; 
		System.out.println("Area of Rectangle is: "+area);
	}
	
	void calculateArea(double length, int breadth){
		double area = length * breadth; 
		System.out.println("Area of Rectangle is: "+area);
	}
	
	

	// Executed Automatically when we run the application
	// This is the 1st method to be executed !!
	public static void main(String[] args) {
		
		int i = 10; // i is the property of main, because it is created in the main block { }
		
		// Object Construction Statement
		MethodsDemo mRef = new MethodsDemo(); // Why Object ? To access non static methods !!
		mRef.calculateArea(33);
		mRef.calculateArea(33.45);
		mRef.calculateArea(33,45);
		mRef.calculateArea(33.33,45);
		
		MethodsDemo.squareOfNum(9);
		
		System.out.println("i is: "+i);
		
	}

}

// Every Method in Java, whenever it is executed a Method Frame is created on stack !!
// Method Frame isn't a permanent memory storage !! Since its in the RAM. Further, storage is temporary and automatic.
// i.e. when method execution begins Frame is created and once method execution is finished Frame shall be terminated !!
