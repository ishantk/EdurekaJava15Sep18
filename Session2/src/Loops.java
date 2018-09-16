
public class Loops {

	public static void main(String[] args) {
		
		/*int num = 5;
		int i = 1;  // initial point, from where we begin
		
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i : 2
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));*/
		
		System.out.println(">>>>>>For Loop<<<<<<");
		
		//for(int num=5,i=1;i<=10;i++){
		//	System.out.println(num+" "+i+"'s are "+(num*i));
		//}
		
		int num=5, i=1;
		
		for(;i<=10;i++){ // Declarations Supported in Loop
			System.out.println(num+" "+i+"'s are "+(num*i)); // will be executed 10 times from 1 to 10	
		}
		
		// infinite loop
		/*for(;;){ // where is the ending point? not known | how to reach to ending point? not known
			
		}*/
		
		System.out.println(">>>>>>While Loop<<<<<<"); 
		// Updating the values of Storage Containers
		num = 7;
		i = 121;
		
		// Condition Checking is at Entry
		while(i<=10){ // No Declaration Supported. Only Condition i.e. expression supported
			System.out.println(num+" "+i+"'s are "+(num*i)); // will be executed 10 times from 1 to 10
			i++;
		}
		
		System.out.println(">>>>>>Do While Loop<<<<<<"); 
		num = 9;
		i = 151;
		
		// Condition Checking is at Exit. So even condition is false, do while will execute once !!
		do{
			System.out.println(num+" "+i+"'s are "+(num*i)); // will be executed 10 times from 1 to 10
			i++;
		}while(i<=10);
		
		
	}

}
