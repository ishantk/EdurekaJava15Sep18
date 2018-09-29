package co.edureka.exceptions;

import java.io.IOException; // IMPORTING A BUILT IN CHECKED EXCEPTION

// User Defined UnChecked Exception
class MyBankingException extends RuntimeException{
	MyBankingException(String message){
		super(message);
	}
}

//User Defined Checked Exception
class YourBankingException extends Exception{
	YourBankingException(String message){
		super(message);
	}
}

class Banking{
	
	int balance = 10000;
	int transactionCount = 0;
	int minBalance = 2000;
	int attempts = 0;
	
	void withdraw(int amt){
		transactionCount++;
		balance = balance - amt;
		
		if(balance<=2000){
			attempts++;
			balance = balance + amt; // Redo the amount
			System.out.println("-----------------Transaction:"+transactionCount+"--------------");
			System.out.println(">> Withdrawing \u20b9"+amt);
			System.out.println(">> Withdrawl Failed !! Balance is LOW \u20b9"+balance);
			System.out.println("------------------------------------------------");
			
			// Lets give 3 successful attempts to the User
			if(attempts == 3){
				// We are explicitly throwing an Exception and Crashing the App !!
				// Here, UNCHECKED EXCEPTION is THROWN !!
				ArithmeticException aRef = new ArithmeticException("Illegal Attempts for Withdrawl !!");
				throw aRef;
			}
			
		}else{
			System.out.println("-----------------Transaction:"+transactionCount+"--------------");
			System.out.println(">> Withdrawing \u20b9"+amt);
			System.out.println(">> Withdrawl Success !! New Balance is \u20b9"+balance);
			System.out.println("------------------------------------------------");
		}
	}
	
	void withdrawAgain(int amt) throws IOException, YourBankingException{
		transactionCount++;
		balance = balance - amt;
		
		if(balance<=2000){
			attempts++;
			balance = balance + amt; // Redo the amount
			System.out.println("-----------------Transaction:"+transactionCount+"--------------");
			System.out.println(">> Withdrawing \u20b9"+amt);
			System.out.println(">> Withdrawl Failed !! Balance is LOW \u20b9"+balance);
			System.out.println("------------------------------------------------");
			
			// Lets give 3 successful attempts to the User
			if(attempts == 3){
				// We are explicitly throwing an Exception and Crashing the App !!
				// Here, CHECKED EXCEPTION is THROWN !!
				//IOException io = new IOException("Illegal Attempts for Withdrawl !!");
				//throw io; // Compiler will give error here, so we will use throws keyword in method signature
				
				YourBankingException yb = new YourBankingException("Illegal Attempts for Withdrawl !!");
				throw yb;
			}
			
		}else{
			System.out.println("-----------------Transaction:"+transactionCount+"--------------");
			System.out.println(">> Withdrawing \u20b9"+amt);
			System.out.println(">> Withdrawl Success !! New Balance is \u20b9"+balance);
			System.out.println("------------------------------------------------");
		}
	}
}

public class ThrowThrowsDemo {

	public static void main(String[] args) {
		System.out.println(">> Banking Started");
		
		Banking bRef = new Banking();
		
		// Having such high frequency of transactions will always fail and will make Bank's resource busy !!
//		for(int i=1;i<=1000;i++){
//			bRef.withdraw(3000);
//		}
		
		try{
			for(int i=1;i<=1000;i++){
				bRef.withdrawAgain(3000);
			}
		}catch(Exception e){
			System.out.println(">> Some Exception "+e);
		}

		System.out.println(">> Banking Finished");
	}

}
