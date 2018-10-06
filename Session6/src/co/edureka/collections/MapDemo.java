
package co.edureka.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		//Map<Integer, String> map = new HashMap<Integer, String>();   // Polymorphic
		       // Key,   Value
		HashMap<Integer, String> map = new HashMap<Integer, String>(); // Direct Object
		
		//1. Add data in HashMap
		map.put(101, "John");
		map.put(234, "Jennie");
		map.put(215, "John");
		map.put(543, "Mike");
		map.put(333, "Fionna");
		map.put(765, "Sia");
		map.put(null, "Kim");
		map.put(111, null);
		
		map.put(215, "Bob"); // Updating the old value of key 215 to new value Bob
		
		//2. Print the Map
		System.out.println("==Map==");
		System.out.println(map);
		
		//3. Read Single Element
		String value = map.get(333);
		System.out.println("Value at 333 is: "+value);
		
		// 4. Remove Element
		map.remove(333);
		System.out.println("MAP Now: "+map);
		
		//5. Check for Key and Value
		if(map.containsKey(765)){
			System.out.println("765 key is in the map");
		}
		
		if(map.containsValue("Kim")){
			System.out.println("Kim is in the map");
		}
		
		//6. Size
		System.out.println("Size is: "+map.size());
		
		//.. more api's i.e. built in methods to explore
		
		// Iteration of Map
		// 1. Iterating over the keys
		Set<Integer> keys = map.keySet(); // keySet() method returns all the keys in the map
		System.out.println("==Keys in Map==");
		System.out.println(keys);
		
		System.out.println("===============");
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()){
			Integer key = itr.next();
			String val = map.get(key);
			System.out.println(key+"\t"+val);
		}
		System.out.println("===============");
		
		//2. Iterating over the Entry<> in the Map
		// Now, one Key Value Pair is stored as Entry<> Object in the Map
		Set<Entry<Integer, String>> set = map.entrySet(); // entrySet() method return all the key-value pairs as Entry Objects in the map
		Iterator<Entry<Integer, String>> itr1 = set.iterator();
		
		System.out.println("**************");
		while(itr1.hasNext()){
			Entry<Integer, String> entry = itr1.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		System.out.println("**************");
		
		// Thread-Safe i.e. Synchronized
		Hashtable<Integer, String> table = new Hashtable<Integer, String>(); // Direct Object
		
		//1. Add data in Hashtable
		table.put(101, "John");
		table.put(234, "Jennie");
		table.put(215, "John");
		table.put(543, "Mike");
		table.put(333, "Fionna");
		table.put(765, "Sia");
		//table.put(null, "Kim"); // no null key
		//table.put(111, null);   // no null values
		
		System.out.println("==table==");
		System.out.println(table);

	}

}
