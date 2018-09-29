package co.edureka.packtwo;

import co.edureka.packone.One; // One was public
//import co.edureka.packone.Two; // Two was default


// Inheritance Across the Packages !!
// private and default will not inherited
// public will be inherited
// protected will also be inherited, but after inheritance it will behave as private
class Three extends One{
	
	void hello(){
		protShow();
		//pvtShow();  // not inherited
		//defShow();  // not inherited
	}
}

public class App {

	public static void main(String[] args) {
		
		//One oRef = new One();
		// errors
		//oRef.pvtShow();
		//oRef.defShow();
		//oRef.protShow();
		
		//oRef.pubShow(); // Accessible
		
		Three tRef = new Three();
		tRef.pubShow();
		//tRef.protShow(); // behaving as private and hence cannot be accessed outside directly

		tRef.hello();
	}

}
