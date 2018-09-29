package co.edureka.packone;

public class App {

	public static void main(String[] args) {
		
		// In the same package we can create objects of one class in other
		One oRef = new One();
		Two tRef = new Two();
		
		// oRef.pvtShow(); // error
		// tRef.pvtShow(); // error
		
		oRef.defShow();
		oRef.protShow();
		oRef.pubShow();
		
		System.out.println();
		
		tRef.defShow();
		tRef.protShow();
		tRef.pubShow();

	}

}
