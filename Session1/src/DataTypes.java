
public class DataTypes {

	public static void main(String[] args) {
		
		// byte is a single value container with 8 bits of size for data
		// age is the name of container
		// 10 is value i.e. literal i.e. data
		// byte's range > 8bits > 2pow8 > 256 > -128 to 0 to 127
		// Write Operation : Writing data in container
		
		byte age = 10;
		int johnsAge = 30; // int is 4 bytes i.e. 32 bits > can store more data
		//int jenniesAge = 30,40; // error > We cannot store more than one value in SVC
		
		// Update Operation
		// Changing the value and hence we can say age is a variable
		age = 20;
		johnsAge = 40;
		
		short s = 100; // 16 bits
		// 64bits
		long l = 1000000000000l; // we can put l or L in the end to show it as a long value
		
		System.out.println(">>>>>>>>>Integral<<<<<<<<<");
		// Read Operation
		System.out.println("Age is "+age);
		System.out.println("John is "+johnsAge+" years old");
		
		
		System.out.println(">>>>>>>>>Floating Points<<<<<<<<<");
		float f = 3.14f; // 32 bits
		double d = 3.14; // 64 bits
		
		f = 3.14354f;
		d = 6.78;
		System.out.println("f is: "+f);
		System.out.println("d is: "+d);
		
		System.out.println(">>>>>>>>>Characters<<<<<<<<<");
		char ch = 'A';
		ch = '$';
		System.out.println(ch);
		System.out.println("ch is: "+ch);
		
		ch = '\u20b9'; // backslash u -> unicode 20b9 is a 4 digit hexadecimal code for characters
		ch = '\u0D95';
		System.out.println("ch is: "+ch);
		
		System.out.println(">>>>>>>>>Boolean<<<<<<<<<");
		boolean gpsStatus = true;
		gpsStatus = false;
		
		System.out.println("GPS is On/Off: "+gpsStatus);
		

	}

}
