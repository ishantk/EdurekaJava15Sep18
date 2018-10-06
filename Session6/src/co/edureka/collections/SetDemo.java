package co.edureka.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		//Set<String> set = new HashSet<String>();
		//HashSet<String> set = new HashSet<String>();
		
		TreeSet<String> set = new TreeSet<String>();
		
		list.add("John");
		list.add("Jennie");
		list.add("John");
		list.add("Jim");
		list.add("Jack");
		list.add("John");
		list.add("Mike");
		list.add("Leo");
		
		System.out.println("==list==");
		System.out.println(list);
		System.out.println();
		
		
		set.add("John");
		set.add("Jennie");
		set.add("John");
		set.add("Jim");
		set.add("Jack");
		set.add("John");
		set.add("Mike");
		set.add("Leo");
		
		System.out.println("==set==");
		System.out.println(set); // Output is unordered. Data is stored with unique hashCodes. HashSet uses Hashing technique !!
		
		// Fetch elements from Set, we cannot do so as we have no access to hashCodes
		// We dont have get method here the way we had in ArrayList to get from index
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			String nm = itr.next();
			System.out.println(nm);
		}
		
		System.out.println("size is: "+set.size());
		if(set.contains("Jennie")){
			System.out.println("Jennie is in the set");
		}
		
		set.remove("John");
		System.out.println("SET: "+set);

		//set.addAll();
		
	}

}
