package ListConcept;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		
		//HashMap is a class which implements Map Interface
		//extends AbstractMap
		//no duplicate key
		//stores values like key -value pair
		//it may have one null key and multiple null values
		//it maintains no order
		//hashMap is non synchronized --> non thread safe --> HashMap object can be accecced by multiple objects.
		//concurrent modification exception --> fail - fast condition
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "TestComplete");
		hm.put(4, "RFT");
		
		//to fetch a value
		System.out.println(hm.get(1));
		System.out.println(hm.get(4));//---will give null
		
		//to print all the values of HashMap
		for(Entry m : hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		//to remove
		System.out.println(hm);
		hm.remove(3);
		System.out.println(hm);
		
		//can store java object
		HashMap<Integer,Employee> emp = new HashMap<Integer,Employee>();
		
		Employee e1 = new Employee("Tom",25,"admin");
		Employee e2 = new Employee("Peter",26,"QA");
		Employee e3 = new Employee("Steve",27,"Dev");
		
		emp.put(1, e1);
		emp.put(2,e2);
		emp.put(3, e3);
		
		//traverse the hashmap
		for(Entry<Integer, Employee> m : emp.entrySet()) {
			int key = m.getKey();
			Employee e = m.getValue();
			System.out.println(key+"Info");
			
			System.out.println(e.name+" "+e.age+" "+e.dept);
		}
		

	}

}
