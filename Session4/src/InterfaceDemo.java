// Here in OOPS -> Class | Object | Interface

interface Inf1{
	
	// By Default all the attributes belongs to interface and is always final
	int i = 10; 	// -> public static final int i = 10;
	
	// By default methods are public and abstract -> Rule Book which must be implemented by the object which implements it !!
	void fun(); 	// -> public abstract void fun();
	void show();	// -> public abstract void show();
	
}

interface Inf2{
	
	void fun();
	void hello();
}

// -> Class to Class, Object to Object and Interface to Interface
// -> static		, non static 	   and no specifications required 
// Multiple Inheritance, Not Supported for Class to Class and Object to Object 
// Multiple Inheritance, But from Interface to Interface
interface Inf3 extends Inf1, Inf2{
	
}

// Do not confuse Multiple Extension i.e. inheritance with multiple implementation

class CC implements Inf3{//Inf1, Inf2{ // Multiple Implementation
	
	public void fun(){
		System.out.println("This is fun");
	}
	
	public void show(){
		System.out.println("This is show");
	}
	
	public void hello(){
		System.out.println("This is hello");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
	
		// Direct Object Construction of CC
		/*CC cc = new CC();
		cc.fun();
		cc.hello();
		cc.show();*/
		
		// Polymorphic Object Construction
		// Ref Variable of Interface can point to the object which implements it !!
		/*Inf1 iRef1 = new CC();
		
		iRef1.fun();
		iRef1.show();
		//iRef1.hello(); // error
		
		System.out.println();
		System.out.println("************");
		System.out.println();
		
		Inf2 iRef2 = new CC();
		
		// we can execute only those methods which are created as rules in interface !!
		iRef2.fun();
		iRef2.hello();
		
		//iRef2.show(); error
		
		// Interfaces have final and static variables which can be accessed with name of Interface
		System.out.println("i is: "+Inf1.i);*/
		
		Inf3 iRef3 = new CC();
		iRef3.fun();
		iRef3.show();
		iRef3.hello();
		
		System.out.println("i is: "+Inf3.i);

	}

}
