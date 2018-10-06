package co.edureka.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

// Every class is child or grandchild of Object class
class Employee { // extends Object{
	
	int eid;
	String name;
	
	Employee(){
		
	}
	
	Employee(int eid, String name){
		this.eid = eid;
		this.name = name;
	}
	
	// toString is the method of Object class which is overrided in Employee class
	public String toString(){
		return eid+" belongs to "+name;
	}
}

public class ListDemo {

	public static void main(String[] args) {
		
		// Polymorphic Statement : List is an interface implemented by ArrayList class
		//List list = new ArrayList();
		
		// We have no type specified. Any Object can be added in this list
		// Hetrogeneous
		ArrayList list1 = new ArrayList();
		
		// Homogeneous
		// We have type specified. String Object can be added in this list -> Generics in Java
		ArrayList<String> list2 = new ArrayList<String>();
		
		// Homogeneous
		// We have type specified. Employee Object can be added in this list -> Generics in Java
		ArrayList<Employee> list3 = new ArrayList<Employee>();
			
		Employee e1 = new Employee(101, "George");
		Employee e2 = new Employee(201, "Harry");
		
		//1. Add data in the list
		list1.add("John"); //0
		list1.add(10); //-> list1.add(new Integer(10)); -> AutoBoxing
		list1.add(2.2);
		list1.add('A');
		list1.add("Jennie");
		list1.add("John");
		list1.add(e1);	   //6
		
		
		//list2.add(0,"John");  // we can mention indexes and hence, we need to manage them	
		list2.add("John");		//0
		list2.add("Jennie");
		list2.add("Jim");
		list2.add("John");
		list2.add("Jennie");
		list2.add("Jack");
		list2.add("Joe");		//n-1
		//list2.add(e1); // error
		//list2.add(2.2);// error
		
		list3.add(e1);		//0
		list3.add(e2);
		
		Employee e3 = new Employee(301,"Fionna");
		
		list3.add(e3);		//2
		//list3.add(2.2);// error
		
		//2.fetching sizes
		System.out.println("list1 size is: "+list1.size());
		System.out.println("list2 size is: "+list2.size());
		System.out.println("list3 size is: "+list3.size());
		
		//3. Print all elements 
		System.out.println("==list1 elements==");
		System.out.println(list1);
		System.out.println();
		
		System.out.println("==list2 elements==");
		System.out.println(list2);
		System.out.println();
		
		System.out.println("==list3 elements==");
		System.out.println(list3);
		System.out.println();
		
		//4. Read Single Element from list
		Object obj = list1.get(0);	// Object is the parent to every class and as per RTP ref var of Object can point to any one
		String name = list2.get(2);
		Employee e = list3.get(1);
		System.out.println("obj is: "+obj);
		System.out.println("name is: "+name);
		System.out.println(e);
		
		//5. Check for element in list
		if(list2.contains("Jack")){
			System.out.println("Jack is in the list");
		}
		
		if(list3.contains(e2)){
			System.out.println(e2.name+" is in the list");
		}

		System.out.println(list1);
		
		//6. Obtaining index of element
		int idx = list1.indexOf("John");
		idx = list1.lastIndexOf("John");
		System.out.println("idx is: "+idx);
		
		//7. Remove element from list
		System.out.println("BEFORE:"+list2);
		list2.remove("Jack"); // element
		//list2.remove(0); // index
		System.out.println("AFTER:"+list2);
		
		//8. Update in list
		list2.set(1, "John Watson");
		System.out.println("NOW:"+list2);
		
		//9. clear is to Remove All elements from list
		//list2.clear();
		//System.out.println("Lastly:"+list2);
		
		//10. Adding all the elements of list2 in names
		ArrayList<String> names = new ArrayList<String>();
		names.add("Mike");
		names.add("Leo");
		names.add("Sia");
		names.add("Fionna");
		
		names.addAll(list2);
		System.out.println(names);
		
		// Iteration in the List
		//1. For Loop
		System.out.println("==For Loop==");
		for(int i=0;i<list1.size();i++){
			Object o = list1.get(i);
			System.out.println(o);
		}
		System.out.println();
		for(int i=0;i<list2.size();i++){
			String str = list2.get(i);
			System.out.println(str);
			
			if(str.equals("John")){
				//...
			}
		}
		System.out.println();
		for(int i=0;i<list3.size();i++){
			Employee emp = list3.get(i);
			System.out.println(emp);
		}
		
		//2. Enhanced For Loop
		System.out.println("==Enhanced For Loop==");
		for(Object o : list1){
			System.out.println(o);
		}
		
		System.out.println();
		for(String str : list2){
			System.out.println(str);
		}
		
		System.out.println();
		for(Employee emp : list3){
			System.out.println(emp);
		}
		
		//3. API : Iterator
		System.out.println("==Iterator==");
		Iterator<Object> itr1 = list1.iterator();
		//System.out.println(itr1.next());
		//System.out.println(itr1.next());
		
		while(itr1.hasNext()){
			Object o = itr1.next();
			System.out.println(o);
		}
		
		System.out.println();
		
		Iterator<String> itr2 = list2.iterator();
		while(itr2.hasNext()){
			String str = itr2.next();
			System.out.println(str);
			if(str.equals("John")){
				itr2.remove();
			}
		}
		
		System.out.println();
		
		Iterator<Employee> itr3 = list3.iterator();
		while(itr3.hasNext()){
			Employee emp = itr3.next();
			System.out.println(emp);
		}
		
		System.out.println();
		System.out.println("LIST2"+list2);

		//4. API : ListIterator : Traverse in both directions i.e. forward and backward both
		System.out.println("==ListIterator==");
		ListIterator<String> listItr = list2.listIterator();
		while(listItr.hasNext()){
			String str = listItr.next();
			System.out.println(str);
		}
		System.out.println("-----"); // this previous iteration is possible only when we have iterated in forward direction
		while(listItr.hasPrevious()){
			String str = listItr.previous();
			System.out.println(str);
		}
		
		//5. Enumeration
		System.out.println("==Enumeration==");
		Enumeration<String> enm = Collections.enumeration(list2);
		while(enm.hasMoreElements()){
			String str = enm.nextElement();
			System.out.println(str);
		}
		
		// THREAD-SAFE i.e. SYNCHRONIZED
		Vector<String> vector = new Vector<String>();
		vector.add("Mike");
		vector.add("Leo");
		vector.add("Sia");
		vector.add("Fionna");
		
		System.out.println(vector);
		System.out.println(vector.size());
		System.out.println(vector.get(1));
		
	}

}
