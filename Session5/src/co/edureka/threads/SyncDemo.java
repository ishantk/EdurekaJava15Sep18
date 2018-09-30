package co.edureka.threads;

class Table{
	
	//void printTable(int num){ -> Normal Method
	
	// Having Synchronized keyword with the method will make Thread acquire a lock !!
	// Lock is a kind of a flag if its thr with a thread no other thread can access this method till its not released !!
	//synchronized void printTable(int num){ // -> Synchronized
	
	void printTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}
	}
	
	void fun(){
		System.out.println("This is fun !!");
	}
	
}

class MyThread extends Thread{
	
	Table t; // Reference to the Table Object
	
	MyThread(Table s){
		t = s; // Ref Copy
	}
	
	public void run() {
		
		synchronized (t) {
			t.printTable(5);
			t.fun();
		}
		
	}
	
}

// Synchronization is required when multiple threads in our program are working on the Same Object !!

class YourThread extends Thread{
	
	Table t; // Reference to the Table Object
	
	YourThread(Table s){
		t = s; // Ref Copy
	}
	
	public void run() {
		
		synchronized (t) {
			t.printTable(7);
			t.fun();
		}
	}
	
}

public class SyncDemo {

	public static void main(String[] args) {
		System.out.println(">> main started");
		
		Table t = new Table(); // t is a ref var pointing to the object of Table
		
		// 2 different threads are working on the same object of Table !! 
		MyThread mRef = new MyThread(t);
		YourThread yRef = new YourThread(t);
		
		
		// Outputs shall be mixed as in parallel execution or concurrent execution or Asynchronous Execution !!
		// Now, when multiple threads are working on the same object, they must not run parallely !!
		mRef.start();
		yRef.start();
		
		System.out.println(">> main finished");
	}

}
