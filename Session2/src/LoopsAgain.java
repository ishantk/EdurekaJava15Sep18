
public class LoopsAgain {

	public static void main(String[] args) {
		
		// Nesting of Loops
		
		// Loop for i will run from 1 to 5
		for(int i=1;i<=5;i++){
			
			System.out.println("For i: "+i);
			
			// Loop for j will run from 1 to 3
			for(int j=1;j<=3;j++){
				System.out.print(j+"  "); // print prints in the same line
			}
			
			System.out.println(); // empty println for a new line
		}
		
		// for every single iteration of i, j loop works 3 times
		
		System.out.println("==================");
		// What is the Output for below ?
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("==================");
		
		
		System.out.println("=============");
		// Loop runs from 1 to 10
		for(int i=1;i<=10;i++){
			System.out.println(i);
			if(i>5){
				break; // break is to terminate the loop
			}
		}
		System.out.println("=============");
		
		System.out.println("********");
		// Loop runs from 1 to 10
		for(int i=1;i<=10;i++){
			
			if(i<5){
				continue; // continue skips below statements in the loop and takes the loop to next iteration
			}
			
			System.out.println(i);
		}
		System.out.println("********");
		
		// break/continue is majorly used when we are performing some search operation !!
		
		// Exploration : search for label usage with break and continue in java
		
		
		int userChoice = 5;
		
		// Switch Case in Java. Replacement to Ladder if/else. Optimized !!
		switch (userChoice) {
			case 1:
				System.out.println("UberGo Booked !!");
				break;
	
			case 2:
				System.out.println("UberX Booked !!");
				break;
				
			case 3:
				System.out.println("UberMoto Booked !!");
				break;
				
			default:
				System.out.println("Nothing Booked !!");
				break;
		}
		
	}

}
