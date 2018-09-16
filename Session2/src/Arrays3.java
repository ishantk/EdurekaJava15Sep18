
public class Arrays3 {

	public static void main(String[] args) {
	
		int[] demVotes = {126, 32, 230, 21, 200};
		int[] repVotes = {152, 85, 121, 215, 13};
		
		// Copying the Address
		int[] votes = demVotes; // Reference Copy
		
		System.out.println("demVotes is: "+demVotes);
		System.out.println("repVotes is: "+repVotes);
		System.out.println("votes is: "+votes);

		// demVotes and votes are not 2 different Arrays.
		// They are 2 different Reference Variables !! And Are Pointing to the Same Array !!
	
		// Update Operation in votes
		votes[3] = 333;
		
		for(int elm : demVotes){
			System.out.print(elm+"  ");
		}
		System.out.println();
		for(int elm : votes){
			System.out.print(elm+"  ");
		}
		
		// eg: For WhatsApp Group Title. Any one can change it !!
		
	}

}
