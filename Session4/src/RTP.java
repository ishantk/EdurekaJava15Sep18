/*class Cab{
	
	Cab(){
		System.out.println("== Cab Object Constructed ==");
	}
	
	void bookCab(){
		System.out.println("== Cab Booked !! Arriving Soon !! ==");
	}
}*/

// Optimizing RTP Technique !!
// What kind of Optimization -> Restricted the user to create objects of Cab !!
//							 -> bookCab method will now have no definition !!

// abstract class is the one for which you cannot create objects !!
// But as a rule of Inheritance, JVM will create Parent Object and then the Child Object will be created !!
/*abstract class Cab{
	
	Cab(){
		System.out.println("== Cab Object Constructed ==");
	}
	
	// having bookCab method is not logical. As we are more interested in getting the child's output.
	// We will convert bookCab method into an abstract method
	//void bookCab(){
	//	System.out.println("== Cab Booked !! Arriving Soon !! ==");
	//}
	
	// abstract method is a rule by the parent which child must define !!
	// it has no definition. Why? -> Since, its not required
	abstract void bookCab();
	// If you create n number of abstract methods, children must define all those abstract methods
	
	void fun(){
		System.out.println("This is fun");
	}
}*/

// Lets refine RTP in the best possible way !!
// interface is also a rule book !!
interface Cab{
	
	// We cannot create Constructors in interfaces !!
	// Why we cannot ? -> They cannot have objects !! Neither we nor JVM can create its objects
	// As a rule to inheritance this guy will not support it !!
	/*Cab(){
		System.out.println("== Cab Object Constructed ==");
	}*/
	
	// By default book cab method will be marked as public abstract
	//void bookCab(){
	//	System.out.println("== Cab Booked !! Arriving Soon !! ==");
	//}
	
	void bookCab(); // -> public abstract void bookCab(); 
}


class UberGo implements Cab{ //extends Cab{
	
	UberGo(){
		System.out.println("== UberGo Object Constructed ==");
	}
	
	// Overriding
	public void bookCab(){
		System.out.println("== UberGo Booked !! Arriving Soon !! ==");
	}
}

class UberX implements Cab{ //extends Cab{
	
	UberX(){
		System.out.println("== UberX Object Constructed ==");
	}
	
	// Overriding
	public void bookCab(){
		System.out.println("== UberX Booked !! Arriving Soon !! ==");
	}
}

class UberMoto implements Cab{ //extends Cab{
	
	UberMoto(){
		System.out.println("== UberMoto Object Constructed ==");
	}
	
	// Overriding
	public void bookCab(){
		//super.bookCab(); // executing parent's definition
		System.out.println("== UberMoto Booked !! Arriving Soon !! ==");
	}
}

// Hierarichal Relation -> Cab has 3 children i.e. UberGo, UberX and UberMoto


public class RTP {

	public static void main(String[] args) {
		
		/*Cab cab;
		cab = new Cab();
		
		cab.bookCab();*/
		
	
		//UberGo uberGo = new UberGo();
		//uberGo.bookCab();

		// Polymorphic Statement
		Cab cab; // Reference Variable of Parent i.e. Cab | if Cab is interface
		cab = new UberGo(); // Ref Variable of Parent (Interface) is pointing to the object of Child (which implements it) 
		cab.bookCab();
		
		System.out.println("cab is: "+cab);
		
		System.out.println("==============");
		System.out.println();
		
		cab = new UberX(); // Ref Variable of Parent is pointing to the object of Child
		cab.bookCab();
		
		System.out.println("cab is: "+cab);
		
		System.out.println("==============");
		System.out.println();
		
		cab = new UberMoto(); // Ref Variable of Parent is pointing to the object of Child
		cab.bookCab();
		
		System.out.println("cab is: "+cab);
		
		// Polymorphism - More than 1 forms | RUN TIME POLYMORPHISM as this is happening at run time
		// cab as ref variable of parent Cab, can point to any child object i.e. UberGo, UberX or UberMoto
		// the same method bookCab() is producing different different outputs
		
		System.out.println("==============");
		System.out.println();
		
		// Is the below statement Logical ??
		/*cab = new Cab(); // error now -> Cab is abstract
		cab.bookCab();*/
	}

}
