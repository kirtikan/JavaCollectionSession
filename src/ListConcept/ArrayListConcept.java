package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		
		//int a[] = new int[3];    //static array  ---size is fixed
		
		//dynamic   array  -- ArrayList
		//1. It can contain duplicate values.
		//2. It maintains insertion order.
		//3. It's not synchronized. that's why ArrayList is slow wrt other collectION
		//4. it allows random access to fetch the elements because it stores the values on the basis of indexes
			
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(10);  //0
		ar.add(20);  //1
		ar.add(30);  //2
		
		System.out.println(ar.size());  
		
		ar.add(40); //3
		ar.add(50); //4
		ar.add(50); //5
		ar.add("Hello");
		ar.add('C');
		ar.add(true);
		
		System.out.println(ar.get(4));  // to get the value from an index
		
		System.out.println(ar.size());  //size of ArrayList
		
		//to print all the values from an ArrayList: for Loop
		//1. for Loop
		//2. using iterator
		
		for(int i=0; i<ar.size(); i++)
		{
			System.out.println(ar.get(i));
		}
		
		//non genrics vs genrics  --- Before Java 1.5 generics was not available
		//in generics we can define primitive, non-primitive or some user defind class objects
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add("selenium");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		
		ArrayList<E> ar3 = new ArrayList<E>();
		
		Employee e1 = new Employee("Naveen",27,"QA");
		Employee e2 = new Employee("Peter",28,"Dev");
		Employee e3 = new Employee("Tom",27,"Admin");
		
		//create ArrayList
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//iterator to traverse the values:
		Iterator<Employee> it =ar4.iterator();
		while(it.hasNext())
		{
			Employee emp =it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		//******************************
		//addAll()  :  to merger two ArrayList
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("test");
		ar5.add("selenium");
		ar5.add("QTP");
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("dev");
		ar6.add("Java");
		ar6.add("JavaScript");
		
		ar5.addAll(ar6);
		
		for(int j=0;j<ar5.size();j++)
		{
			System.out.println(ar5.get(j));
		}
		
		System.out.println("****************");
		
		//removeAll
		ar5.removeAll(ar6);
		for(int j=0;j<ar5.size();j++)
		{
			System.out.println(ar5.get(j));
		}
		
		System.out.println("*************");
		
		//retainAll() : to check only common part
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("test");
		ar7.add("selenium");
		ar7.add("QTP");
		
		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("test");
		ar8.add("Java");
		
		ar7.retainAll(ar8);
		for(int j=0;j<ar7.size();j++)
		{
			System.out.println(ar7.get(j));
		}		
	}

}
