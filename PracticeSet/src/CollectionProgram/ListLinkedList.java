package CollectionProgram;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListLinkedList {

	public static void main(String[] args) {
	
	//  System.out.println("  "); " "   ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	
		
		List ll=new LinkedList();
		
		ll.add(10);
		ll.add(10);
		ll.add(20);
		ll.add(20);
		ll.add(30);
		ll.add(30);
		ll.add(null);
		ll.add(null);
		ll.add(50.60);
		ll.add(88.633);
		ll.add(5,5682);
		ll.add(15);
		
		
List ll1=new LinkedList();
		
        ll1.add(10);
        ll1.add(10);
     	ll1.add(20);
     	ll1.add(20);
     	ll1.add(30);
     	ll1.add(30);
     	ll1.add(null);
     	ll1.add(null);
     	ll1.add(50.60);
     	ll1.add(88.633);
		
     	ll1.addAll(ll);
     	
     	System.out.println(ll);
     	//System.out.println(ll1);
		
     	System.out.println(ll.get(5));
     	System.out.println(ll.isEmpty());
     	System.out.println(ll.indexOf(null));
     	System.out.println(ll.size());
     	
     	System.out.println("\n Display Element By using Iterator \n");
     	
     	Iterator itr=ll.iterator();
     	while(itr.hasNext())
     	 {
     		System.out.println(itr.next());
     		
     	 }
     	
     	System.out.println("\n Display Element By Using List Iterator  \n");
     	ListIterator itr1=ll.listIterator();
     	
     	while(itr1.hasNext())
     	{
     		System.out.println(itr1.next());
     	}	
     	
     	ll.clear();
     	System.out.println(ll);
     	
	//  System.out.println("  "); " "   ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
