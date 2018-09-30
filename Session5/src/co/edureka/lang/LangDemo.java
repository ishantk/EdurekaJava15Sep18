package co.edureka.lang;

// Object is a Super Class in Java. Each and Every class is child of Object !!
class CA{	// extends Object{
	
	public String toString(){
		return "This is Awesome";
	}	
}

public class LangDemo {

	public static void main(String[] args) {
		
		System.out.println("Square Root of a Number is: "+Math.sqrt(25));
		System.out.println("Cos of a Number is: "+Math.cos(90));

		CA ca = new CA();
		System.out.println("ca hashCode is "+ca.hashCode());
		System.out.println("ca class is "+ca.getClass());
		System.out.println("ca toString is "+ca.toString());
		System.out.println("ca is "+ca);
		
		String str = new String("Hello");
		
		
	}

}
