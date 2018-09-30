package co.edureka.lang;

public class WrapperDemo {

	public static void main(String[] args) {
		
		// EXPLICIT
		int i = 10; 					// Primitive Type
		
		// Converting Primitive to Reference -> BOXING
		Integer iRef = new Integer(i); 	// Reference Type
		
		// Converting Reference to Primitive -> UNBOXING
		int j = iRef.intValue();

		char c = 'A';
		Character cRef = new Character(c);  // BOXING
		char d = cRef.charValue();			// UNBOXING
		
		long l = 10000000l;
		Long lRef = new Long(l);			// BOXING
		long m = lRef.longValue();			// UNBOXING
		
		
		
		// IMPLICIT
		int x = 10;

		// AUTO BOXING
		Integer xRef = x; 	// Translated to -> Integer xRef = new Integer(x);
		
		// AUTO UNBOXING
		int y = xRef; 		// Translated to -> int y = xRef.intValue();
		
		System.out.println("x is: "+x);			//10
		System.out.println("xRef is: "+xRef);	//10 -> why 10 rather than hashCode -> Since, toString() is overrided
		System.out.println("xRef.toString() is: "+xRef.toString());	//10 -> why 10 rather than hashCode -> Since, toString() is overrided
		System.out.println("y is: "+y);			//10
		
	}

}
