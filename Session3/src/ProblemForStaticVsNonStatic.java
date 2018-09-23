// Representation how an object as a container or class as a container will look like in the RAM !!
class Counter{

	int count;
	static int scount;
	
	// Constructor: is executed when object is constructed in the Heap
	Counter(){
		count = 1;
		scount = 1;
	}
	
	// Method : Non Static
	void incrementCount(){
		count++;  // count = count + 1;
		scount++; // scount = scount + 1;
	}
	
	void showCounts(){
		System.out.println("count is: "+count+" and scount is: "+scount);
	}
}


public class ProblemForStaticVsNonStatic {

	public static void main(String[] args) {
		
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = c1; // 2 different references will point to the same object !
		
		c1.incrementCount();  //C: 2   SC: 2
		c2.incrementCount();  //C: 2   SC: 3
		c3.incrementCount();  //C: 3   SC: 4
		
		c3.incrementCount();  //C: 4   SC: 5
		c2.incrementCount();  //C: 3   SC: 6
		
		c1.showCounts(); // C:4   SC:6
		c2.showCounts(); // C:3   SC:6
		c3.showCounts(); // C:4   SC:6
		
	}

}
