// Problem !!
// A train running at 60km/hr crosses a pole in 9 secs. What is the length of train ?

public class Problem {

	public static void main(String[] args) {
		
		// Model
		double speed = 60;
		double time = 9;
		
		// Controller
		// Convert from kmph to mps
		speed = (speed * 5) / 18;
		double length = speed * time;
		
		// View
		System.out.println("Speed is: "+speed);
		System.out.println("Length of Train is "+length);
				

	}

}
