package co.edureka;

// We want a limit that thr must be only 1 connection
class Connection{
	// We created Object internally i.e. within the boundary of Class
	private static Connection con = new Connection();
	
	// Limiting User not to create Objects outside
	private Connection(){
		System.out.println("==Connection Object Constructed==");
	}
	
	public static Connection getConnection(){
		return con;
	}
}
public class SingleTon {

	public static void main(String[] args) {
		/*
		Connection con1 = new Connection(); // First  Object
		Connection con2 = new Connection(); // Second Object

		System.out.println("con1 is: "+con1); // 7852e922
		System.out.println("con2 is: "+con2); // 4e25154f
		*/
		Connection con1 = Connection.getConnection(); // First  Object
		Connection con2 = Connection.getConnection(); // Forst Object

		System.out.println("con1 is: "+con1); // 7852e922
		System.out.println("con2 is: "+con2); // 7852e922
	}
}
