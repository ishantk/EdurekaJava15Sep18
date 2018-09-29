package co.edureka.exceptions;

public class App {

	// When we will execute our Java Program, main method will execute instructions one by one in a sequence
	public static void main(String[] args) {
		
		System.out.println("==main started==");
		
		// Array
		int[] arr = {10, 20, 30, 40, 50}; // indexing is from 0 to 4
		int a = 10, b = 0, c = 0;
		
		
		
		// No Compile Time Error as Syntax is correct, this is a logical error
		// Other than that array is created at run time
		// Error will occur at Run Time and this error is also known as Exception
		
		// In order to handle such error use try and catch block !!
		// Handling the error, program terminates gracefully !!
		try{
			c = a/b;
			System.out.println("arr[20] is:"+arr[20]); // 20 is out of index range
			// in the try block JVM will create an Object of ArrayIndexOutOfBoundsException class and will throw it
		}/*catch(ArrayIndexOutOfBoundsException aRef){ // aRef is ref variable which will catch th ref of thrown object by JVM
			//System.out.println("Some Error !!"+aRef); // a normal message when we will release the app to client
			aRef.printStackTrace(); // is for developer to debug where exception came
		}/*catch (ArithmeticException ae) {
			System.out.println("Some Exception: "+ae);
		}*/
		catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}finally{
			System.out.println("square of arr[0] is: "+(arr[0]*arr[0]));
		}
		
		
		System.out.println("c is: "+c);
		
		
		

		System.out.println("==main finished==");
		
		/*try{
			
			try{
				
			}catch (Exception e) {
				
			}finally{
				
			}
			
		}catch (Exception e) {
			
			try{
				
			}catch (Exception e) {
				
			}finally{
				
			}
				
		}finally{
			
			try{
				
			}catch (Exception e) {
				
			}finally{
				
			}
		}*/
		
	}

	// Normal Termination of Program
	// When main finishes, we say program or app has terminated gracefully !!
	
	// Abnormal Termination of Program
	// if exception comes, main will not finish, we say program or app has terminated dis-gracefully or app has CRASHED !!

	
	
}
