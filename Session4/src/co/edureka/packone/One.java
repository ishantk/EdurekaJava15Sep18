package co.edureka.packone;

// public class
public class One {

	private void pvtShow(){
		System.out.println("This is private show of One");
	}
	
	void defShow(){
		System.out.println("This is default show of One");
	}
	
	protected void protShow(){
		System.out.println("This is protected show of One");
	}
	
	public void pubShow(){
		System.out.println("This is public show of One");
	}
	
}

// default class
class Two{
	
	private void pvtShow(){
		System.out.println("This is private show of Two");
	}
	
	void defShow(){
		System.out.println("This is default show of Two");
	}
	
	protected void protShow(){
		System.out.println("This is protected show of Two");
	}
	
	public void pubShow(){
		System.out.println("This is public show of Two");
	}
}

// error : class cannot be private
/*private class Three{
	
}*/

// error : class cannot be protected
/*protected class Four{
	
}*/

// In 1 source file only 1 public class is allowed with a condition that name of source file should be same name as that of class name
/*public class Five{
	
}*/

// n number of default classes can be created in the same source file
class Six{
	
}
