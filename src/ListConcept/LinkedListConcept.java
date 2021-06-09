package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		//add
		ll.add("test");
		ll.add("qtp");
		ll.add("selenium");
		ll.add("RPA");
		ll.add("RFT");
		
		//print
		System.out.println("Content of LinkedList: "+ll);
		//addFirst()
		ll.addFirst("Naveen");
		ll.addLast("Automation");
		System.out.println("Content of LinkedList: "+ll);
		
		//get
		System.out.println(ll.get(0));
		System.out.println(ll.get(1));
		
		//set
		ll.set(0, "Tom");
		
		System.out.println("Content of LinkedList: "+ll);
		
		//remove first and last element
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println("Content of LinkedList: "+ll);
		
		ll.remove(2);
		System.out.println("Content of LinkedList: "+ll);
		
		//to print all the values of LinkedList:
		//1. using for Loop
		System.out.println("***********using for Loop**********");
		for(int n=0; n<ll.size();n++) {
			System.out.println(ll.get(n));
		}
		
		//2. advanced for Loop  OR for each Loop
		System.out.println("**************using advance for loop************");
		for(String str : ll) {
			System.out.println(str);
		}
		
		//3. iterator
		System.out.println("**************using iterator************");
		Iterator<String> it =ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
				
		//4. while
		System.out.println("**************using while loop************");
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
		
		
		
		

	}

}
