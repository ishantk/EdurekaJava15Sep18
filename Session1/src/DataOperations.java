
public class DataOperations {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		// Solving a basic addition problem !!
		int num3 = num1 + num2;
		int num4 = num1 * num2;
		
		System.out.println(num1+" and "+num2+" addition is: "+num3);
		System.out.println(num1+" and "+num2+" multiplication is: "+num4);
		
		// Increment Value By 1
		num1++; //-> num1 = num1 + 1 
		++num2; //-> num2 = num2 + 1
		
		// Trick : int newNum = num1++;  or int newNum = ++num1; // Try it and see it !!
		
		System.out.println("num1 is: "+num1);
		System.out.println("num2 is: "+num2);
		
		System.out.println("Is num1 > num2: "+(num1>num2));
		System.out.println("Is num1 < num2: "+(num1<num2));
		
		System.out.println("Is num3 greater than num1 and num2 both? "+(num3>num1 && num3>num2));
		
	}

}
