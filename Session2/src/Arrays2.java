
public class Arrays2 {

	public static void main(String[] args) {
		
		// Limitations:
		// 1. Homogeneous i.e. only same type of data can be accommodated !!
		// 2. Size i.e. It is Fixed. Once Created Cannot be Changed at Run Time !!
		
		// Syntax1 : Implicit
		int[] a1 = {10, 20, 30, 40, 50}; // Translated by Compiler -> int[] a1 = new int[]{10,20,30,40,50};
		
		// Syntax2 : Explicit
		int[] a2 = new int[]{10, 20, 30, 40, 50};
		
		// new operator which creates Arrays dynamically i.e. at Run Time. in the Heap Area of RAM
		// Syntax1 and Syntax2 are same and they have values to the indexes created in Array
		
		// Syntax3: Bracket After
		int a3[] = {12, 13, 14, 15, 16, 17};
		int a4[] = new int[]{12, 13, 14, 15, 16, 17};
		
		// Syntax4: With Size
		int[] a5 = new int[5]; // a5 is having 5 elements with all the elements as 0. 

		System.out.println("a1 length is: "+a1.length);
		System.out.println("a4 length is: "+a4.length);
		System.out.println("a5 length is: "+a5.length);
		
		// Read Single Element of Array
		System.out.println("a1[2] is: "+a1[2]);
		System.out.println("a4[2] is: "+a4[2]);
		System.out.println("a5[2] is: "+a5[2]);
		
		// Write/Update data in Array
		a1[2] = 67;
		a4[2] = 123;
		a5[2] = 99;
		
		System.out.println("==Re-Reading the same indexes after update");
		
		System.out.println("a1[2] is: "+a1[2]);
		System.out.println("a4[2] is: "+a4[2]);
		System.out.println("a5[2] is: "+a5[2]);
		
		// Read All Elements
		for(int i=0;i<a1.length;i++){
			System.out.print(a1[i]+"  ");
		}
		System.out.println();
		for(int i=0;i<a4.length;i++){
			System.out.print(a4[i]+"  ");
		}
		System.out.println();
		for(int i=0;i<a5.length;i++){
			System.out.print(a5[i]+"  ");
		}
		System.out.println();
		
		
		System.out.println("==Enhanced For Loop=="); // Can be Used With Arrays
		for(int anyName : a5){ // Loop Automatically starts from 0 index and goes till the length of Array. Extract element value into anyName !!
			System.out.print(anyName+"  ");
			// anyName shall contain the value at index 0 to n-1
		}
		
		System.out.println();
		
		char[] chArr = {'A','E','I','O','U'};
		for(char ch : chArr){
			System.out.print(ch+" - ");
		}
		System.out.println();
		
		// Bracket Before
		int[] a6,a7;
		a6 = new int[5];
		a7 = new int[10];
		
		// Bracket After
		int a8[], a9;
		a8 = new int[20];
		a9 = 10;
		
	}

}
