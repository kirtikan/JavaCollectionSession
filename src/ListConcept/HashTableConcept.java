package ListConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		//it's similar to HashMap, but it's synchronized i.e. thread safe
		//stores values on the basis of key-value pair
		//it contain only unique value
		//no null key and null value
		//key --> Object --HashCode --> value
		//hashCode Number -- 32 bit integer  ---- Java Object Number :::: provided by JVM
		// if two object are same, then hashcode will be same.  For EX : cloning
		// if we compare two objects then we have to use two methods from Object class which are :  hashCode() & equals()
		//So Hashtable stores the value on the basis of HashCode value of the key.
		
		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
		h1.put(1, "Tom");
		h1.put(2, "Test");
		h1.put(3, "Java");
		
		//create a clone copy/shallow copy :
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
		 h2 =  (Hashtable) h1.clone();
		 
		 System.out.println("Contents from h1: "+h1);
		 System.out.println("Contents from h1: "+h2);
		 
		 h1.clear();
		 System.out.println("Contents from h1: "+h1);
		 System.out.println("Contents from h1: "+h2);
		 
		 //contains value method
		 Hashtable<String, String> st = new Hashtable<String, String>();
		 st.put("A", "Naveen");
		 st.put("B", "manager");
		 st.put("C", "Selenium");
		 
		 if(st.containsValue("Naveen")) 
			 System.out.println("value is found");
		 
		 //print all the values from Hashtable using --Enumeration -- elements() Method
		 Enumeration<String> e =st.elements();
		 System.out.println("print value sfrom st using enumeration");
		 
		 while(e.hasMoreElements()) {
			 System.out.println(e.nextElement());
		 }
		 
		 //get all the values from Hashtable  using --entrySet() -- set of Hashtable values
		  Set<?> s = st.entrySet();
		  System.out.println(s);
		  
		  Hashtable<String, String> st1 = new Hashtable<String, String>();
			 st1.put("A", "Naveen");
			 st1.put("B", "manager");
			 st1.put("C", "Selenium");
			 st1.put("C", "Selenium"); // it contain only unique values
			 
			 System.out.println("value from st1:" + st1);
			 
		//check both the Hashtable are equal are not 
			 
			 if(st.equals(st1)) 
				 System.out.println("Both are equal");

		 
			 //get the value from key
			 System.out.println(st1.get("A"));
			 
			 //get the HashCode of Hashtable object
			 System.out.println("Hash Code value of st1 :"+ st1.hashCode());
		 

	}

}
