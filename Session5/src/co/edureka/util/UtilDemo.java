package co.edureka.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class UtilDemo {

	public static void main(String[] args) {
		
		// If you wish to read data form console by User
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Enter Num1:");
		int num1 = scanner.nextInt();
		System.out.println("Enter Num2:");
		int num2 = scanner.nextInt();
		int num3 = num1+num2;
		System.out.println("Sum is: "+num3);
		scanner.close();
		
		// Date API
		Date date = new Date();
		System.out.println("Today is: "+date);
		System.out.println("Today is: "+date.toString());
		
		//SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
		String date1 = format1.format(date);
		System.out.println(date1);
		
		SimpleDateFormat format2 = new SimpleDateFormat("hh:mm");
		String time = format2.format(date);
		System.out.println(time);
		
		// Explore !!
		//Calendar calendar = Calendar.getInstance();

	}

}
