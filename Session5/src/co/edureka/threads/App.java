package co.edureka.threads;

/*class MyTask{
	// MyTask can be a long running task
	// If its a long running task, jobs in the main thread shall be blocked till time this task is not finished !!
	void executeTask(){
		for(int i=1;i<=100;i++){
			System.out.println(">> ##MyTask## "+i);
		}
	}
}*/

// Lets convert MyTask into a Thread !!
class MyTask extends Thread{
	
	// MyTask if is a long running task, now this will be executed along the main thread
	// run is a method from Thread class which we are redefining i.e. overriding !!
	public void run(){
		for(int i=1;i<=10;i++){
			// which will pause the thread for 1 sec and will resume it later
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			System.out.println(">> ##MyTask## "+i);
		}
	}
}

class CA{
	
}

//class YourTask extends CA,Thread{ // Java does not supports Multiple Inheritance !!
	
//}

class YourTask extends CA implements Runnable{
	public void run(){
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			System.out.println(">> @@YourTask@@ "+i);
		}
	}
}

// After converting MyTask to a Thread, we observe mixed outputs, which is a proof that both are running parallely !!
// Its responsibility of JVM to manage them together !! And hence we cannot predict outputs !!

public class App {

	// main method is executed when we run our program
	// this is referred to as main thread also
	public static void main(String[] args) {
		
		//1.
		System.out.println(">> main started");

		MyTask mRef = new MyTask();
		System.out.println("mRef State 1 "+mRef.getState());
		//mRef.executeTask();
		
		Runnable r = new YourTask(); // Polymorphic Statement
		Thread yRef = new Thread(r); // Create a Thread Object and Pass Runnable ref
		
		mRef.setName("John");
		yRef.setName("Mike");
		Thread.currentThread().setName("Sia");
		
		mRef.setPriority(Thread.MAX_PRIORITY);					  // 10
		yRef.setPriority(Thread.MIN_PRIORITY); 					  // 1
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY); //5
		
		mRef.start(); // -> start is a method of Thread Class, which internally calls run method.
		// Since, Thread has states associated, we cannot directly execute run method.
		System.out.println("mRef State 2 "+mRef.getState());
		// Immediately after mRef.start() we will execute join method on mRef
		try {
			// Command, let me finish my jobs and till time other threads must wait !!
			mRef.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("mRef State 3 "+mRef.getState());
		
		yRef.start();
		
		// You process others, i may wait !!
		yRef.yield();
		
		// Statements 2 and 3 shall be blocked till time MyTask is not finished !!
		//2.
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			System.out.println(">> **main thread** "+i);
		}
		
		//3.
		System.out.println(">> main ended");
		
		// Execution Sequence 1 > MyTask > 2 > 3
		
		System.out.println("mRef ID: "+mRef.getId()+" mRef Name: "+mRef.getName()+" mRef Priority: "+mRef.getPriority());
		System.out.println("yRef ID: "+yRef.getId()+" yRef Name: "+yRef.getName()+" yRef Priority: "+yRef.getPriority());
		System.out.println("main ID: "+Thread.currentThread().getId()+" Main Name: "+Thread.currentThread().getName()+" main Priority: "+Thread.currentThread().getPriority());
				
	}

}
