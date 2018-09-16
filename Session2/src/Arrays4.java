
public class Arrays4 {

	public static void main(String[] args) {
		
		// Array : 1-D
		int[] arr1 = {10, 20, 30, 40, 50};

		// Array of Arrays : 2-D Array
		// arr2 is basically collection of so many 1-D Arrays
		int[][] arr2 = {
							{10,20}, 			// 0
							{10,20,30,40},		// 1
							{10,20,30},			// 2
							{10},				// 3
							{10,20,30,40,50}	// 4
					   };
		
		System.out.println("arr1 is: "+arr1);
		System.out.println("arr1 length is: "+arr1.length);
		
		System.out.println("***************************");
		
		System.out.println("arr2 is: "+arr2);
		System.out.println("arr2 length is: "+arr2.length);
		
		System.out.println("***************************");
		
		System.out.println("arr2[1] is: "+arr2[1]);
		System.out.println("arr2[1] length is: "+arr2[1].length);
		System.out.println("***************************");
		
		for(int i=0;i<arr2.length;i++){
			System.out.println("arr2["+i+"] is: "+arr2[i]+" and length is: "+arr2[i].length);
		}
		
		System.out.println(arr2[0][0]); // arr2's 0th Arrays's 0th index -> 10
		System.out.println(arr2[4][3]); // arr2's 4th Arrays's 3rd index -> ?
		
		System.out.println("===========================");
		// Read All the elements in 2-D Array
		for(int i=0;i<arr2.length;i++){ // length of arr2
			for(int j=0;j<arr2[i].length;j++){ // length of arr2's ith index arr2[0].length -> arr2[1].length .. arr2[4].length 
				System.out.print(arr2[i][j]+"  "); // Printing arr2's ith Array's jth index
			}
			System.out.println();
		}
		System.out.println("===========================");
		
		// Explore : Enhanced For loop on 2-D Array
		
		// Another Syntax for 2D Array
		int[][] arr3 = new int[3][4]; // 3 1-D Arrays with each 1-D Array having 4 elements
		
		// Another Syntax for 2D Array
		int[][] arr4 = new int[4][];  // 4 1-D Arrays with each 1-D Array having no size defined yet !!
		arr4[0] = new int[3];  // arr4's 0th array is having 3 elements
		arr4[1] = new int[5];  // arr4's 1th array is having 5 elements
		arr4[2] = new int[9];  // arr4's 2th array is having 9 elements
		arr4[3] = new int[12]; // arr4's 3rd array is having 11 elements
		
		// In both the above Syntaxes all the elements are by default ZERO i.e. 0 Value
		
		// Array of Array of Arrays > 3-D Array
		int[][][] arr5 = {
							{
								{10,20}, 			// 0
								{10,20,30,40},		// 1
								{10,20,30},			// 2 				//0
								{10},				// 3
								{10,20,30,40,50}	// 4
						   },
						   {
								{10,20}, 			// 0
								{10,20,30,40},		// 1				//1
								{10,20,30},			// 2
						   }
						 };
		
		System.out.println("arr5 is: "+arr5+" and length is: "+arr5.length); // ?
		System.out.println(arr5[0][2][1]); //?
		
		
		//HW:
		/*
		  	Cyclic Rotation:
			A = [3, 8, 9, 7, 6]
			K = 3
			Output = [9, 7, 6, 3, 8]
			
			Three rotations were made:
			[3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
			[6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
			[7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
			
			Permutation Check:
			A permutation is a sequence containing each element from 1 to N once, and only once.
			
			For example, List A such that:
			    A[0] = 4
			    A[1] = 1
			    A[2] = 3
			    A[3] = 2
			is a permutation, but List A such that:
			    A[0] = 4
			    A[1] = 1
			    A[2] = 3
			is not a permutation, because value 2 is missing.
			
		 */
		
		
		
		
	}

}
