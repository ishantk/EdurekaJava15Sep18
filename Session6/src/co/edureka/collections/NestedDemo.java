package co.edureka.collections;

class Outer{

	void show(){
		System.out.println("This is show of Outer");
	}

	class Inner{
		void show(){
			System.out.println("This is show of Inner");
		}
	}
	
	private class CA{
		
	}
	
	protected class CB{
		
	}
	
	public class CC{
		
	}
	
}

/* error
private class A{
	
}

protected class B{
	
}
*/

public class NestedDemo {

	public static void main(String[] args) {
		
		Outer out = new Outer();
		out.show();
		
		Outer.Inner inner = out.new Inner();
		inner.show();		

	}

}
