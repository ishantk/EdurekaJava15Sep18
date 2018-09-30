
public class VarArgs {

	// int... -> VarArgs (Variable Arguments) | This is an Array
	static int addNumbers(int...nums){
		
		int sum = 0;
		
		for(int i=0;i<nums.length;i++){
			sum = sum + nums[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		int result = VarArgs.addNumbers(10,20);
		System.out.println("Result is: "+result);

		result = VarArgs.addNumbers(10,20, 30, 40, 50);
		System.out.println("Result is: "+result);
		
		result = VarArgs.addNumbers(10,20, 30, 40, 50, 60, 70, 80, 90, 100);
		System.out.println("Result is: "+result);
		
	}

}
