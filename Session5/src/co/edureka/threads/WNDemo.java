package co.edureka.threads;

class Message{
	
	String message = ">> No Message Available";
	
	void writeMessage(String m){
		message = m;
		System.out.println(">> Message Written");
	}
	
	void readMessage(){
		System.out.println(">> Message is: "+message);
	}
	
}

class ReaderThread extends Thread{
	
	Message m;
	
	ReaderThread(Message n){
		m = n;
	}
	
	public void run(){
		synchronized (m) {
			
			try {
				m.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			m.readMessage();
		}
	}
}

class WriterThread extends Thread{
	
	Message m;
	
	WriterThread(Message n){
		m = n;
	}
	
	public void run(){
		synchronized (m) {
			m.writeMessage("Be Exceptional !!");
			
			//m.notify(); // notify thread waiting on m
			m.notifyAll();
		}
	}
}

public class WNDemo {

	public static void main(String[] args) {
		
		System.out.println(">> Main Started");
		
		Message m = new Message(); // Message Object Constructed with m as ref var to Message Object
		
		// We have a Use Case, where 2 different threads shall be working on the same object !!
		ReaderThread rt1 = new ReaderThread(m);
		ReaderThread rt2 = new ReaderThread(m);
		
		WriterThread wt = new WriterThread(m);
		
		// When Reader and Writer Threads will start, 100 perc chance of Reader Thread will be to run firstly
		rt1.start();
		rt2.start();
		wt.start();
		
		System.out.println(">> Main Finished");
	}

}
