
public class Conditions {

	public static void main(String[] args) {
		
		// Query !!
		// i++ and ++i
		//int i = 10;
		//i++;  // i = i+1; | incremented by 1 | Postfix notation
		//++i;    // i = i+1; | incremented by 1 | Prefix notation
		//System.out.println("i is: "+i); // 11
		
		//int j = i++; 	// Assignment and Increment
		//int j = ++i; 	// Increment and Assignment
		//System.out.println("j is: "+j); // 1. -> 10 2. -> 11
		//System.out.println("i is: "+i); // 11
		
		//int i = 1;
		//System.out.println("the i++ value is " + i++); // PostFix
		//System.out.println("the i++ value is " + ++i); // PreFix
		
		int num1 = 10;
		int num2 = 20;
		
		if(num1>num2){
			System.out.println("num1 is greater than num2");
		}else{
			System.out.println("num2 is greater than num1");
		}
		
		int priceForCab = 100;
		
		if(priceForCab>=50 && priceForCab<=70){
			System.out.println("I will book a Cab");
		}else{
			System.out.println("Lets board a bus !!");
		}
		
		// Three Different Types of Uber Cabs, which a user can book
		int uberGo = 1;
		int uberX = 2;
		int uberMoto = 3;
		
		int userChoice = uberGo; // User chooses UberGo
		
		// Ladder if/else
		if(userChoice == uberGo){
			System.out.println("UberGo has been Booked!! Cab Arriving Soon !!");
		}else if(userChoice == uberX){
			System.out.println("UberX has been Booked!! Cab Arriving Soon !!");
		}else if(userChoice == uberMoto){
			System.out.println("UbreMoto has been Booked!! Cab Arriving Soon !!");
		}else{
			System.out.println("Invalid Choice !!");
		}
		
		int physicsMarks = 50;
		int mathsMarks = 70;
		int chemistryMarks = 75;
		
		int average = (physicsMarks + mathsMarks + chemistryMarks)/3;
		
		if(average>=90){
			System.out.println("You got a Grade A "+average);
		}else if(average>=75 && average<90){
			System.out.println("You got a Grade B "+average);
		}else if(average>=60 && average<75){
			System.out.println("You got a Grade C "+average);
		}else{
			System.out.println("No Grade Awarded !! "+average);
		}
			
		// Nested if/else
		boolean internetEnabled = false;
		boolean gpsEnabled = false;
		
		if(internetEnabled){
			if(gpsEnabled){
				System.out.println("You can access Google Maps");
			}else{
				System.out.println("Please Enable GPS and Try Again !!");
			}
		}else{
			System.out.println("Please enable Internet and try Again !!");
		}
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		if(a>b){
			if(a>c){
				System.out.println("a is greatest");
			}else{
				System.out.println("c is greatest");
			}
		}else{
			if(b>c){
				System.out.println("b is greatest");
			}else{
				System.out.println("c is greatest");
			}
		}
	
		
		// if/else > Condition Checking and Making a decision of what to do !! Thats like Choices !!
		
		
	}

}
