// final class cannot be extended
final class CA{
	
	// final method is a method which cannot be overrided by child
	final void fun(){
		System.out.println("This is fun from CA");
	}
}

class CB { //extends CA{ -> error
	
	// err: as fun is final in CA
	/*void fun(){
		System.out.println("This is fun from CB");
	}*/
}

public class FinalDemo {

	public static void main(String[] args) {
		
		int x = 10;
		x = 20; // x can be modified to a new value
		
		final int y = 10; // final variable
		// y = 20; // error : final variable is the one whose value cannot be modified | Serves as a Constant 
		
	}

}
