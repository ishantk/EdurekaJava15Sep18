
public class Arrays1 {

	public static void main(String[] args) {

		// Model: Store the data for 2 different parties  Single Value Container !!
		
		// Democratic Party Votes
		int demArizonaVotes = 126;
		int demFloridaVotes = 32;
		int demVermontVotes = 230;
		int demTexasVotes = 21;
		int demGeorgiaVotes = 200;

		// Republican Party Votes
		int repArizonaVotes = 152;
		int repFloridaVotes = 85;
		int repVermontVotes = 121;
		int repTexasVotes = 215;
		int repGeorgiaVotes = 13;
		
		// Model : Store the data for 2 different parties using Multi Value Container !!
		// Array : Homogeneous
		int[] demVotes = {126, 32, 230, 21, 200};
		int[] repVotes = {152, 85, 121, 215, 13};
		
		// Most Effective Way to Store the data !!
		int[][] allVotes = {
								{126, 32, 230, 21, 200},
								{152, 85, 121, 215, 13}
						   };
		
		// Problem ? Who Won ??
		// Controller: Apply Logic
		
		int demVoteCount = 0;
		int repVoteCount = 0;
		
		/*demVoteCount = demArizonaVotes + demFloridaVotes + demVermontVotes + demTexasVotes + demGeorgiaVotes;
		repVoteCount = repArizonaVotes + repFloridaVotes + repVermontVotes + repTexasVotes + repGeorgiaVotes;
		
		// Logic Cont..
		if(demVoteCount > repVoteCount){
			System.out.println("Democratic Party won by "+(demVoteCount - repVoteCount)+" votes !!");
		}else{
			System.out.println("Republic Party won by "+(repVoteCount - demVoteCount)+" votes !!");
		}*/

		// demVotes and repVotes are not arrays. They are reference variables which holds the addresses of the Arrays
		// Array is a Multi value Container which gets created in the RAM in Heap Area 
		System.out.println("demVotes is "+demVotes);
		System.out.println("repVotes is "+repVotes);
		
		// Read elements in array
		System.out.println("demVotes[0] is "+demVotes[0]);
		System.out.println("repVotes[0] is "+repVotes[0]);
		
		for(int i=0;i<demVotes.length;i++){ // 0 till less than 5 which is 0 to 4
			demVoteCount = demVoteCount + demVotes[i];
		}
		
		for(int i=0;i<repVotes.length;i++){ // 0 till less than 5 which is 0 to 4
			repVoteCount = repVoteCount + repVotes[i];
		}
		
		// Logic Cont..
		if(demVoteCount > repVoteCount){
			System.out.println("Democratic Party won by "+(demVoteCount - repVoteCount)+" votes !!");
		}else{
			System.out.println("Republic Party won by "+(repVoteCount - demVoteCount)+" votes !!");
		}
		
	}

}
