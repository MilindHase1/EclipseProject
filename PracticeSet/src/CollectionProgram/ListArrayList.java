package CollectionProgram;

import java.util.ArrayList;
import java.util.Iterator;

public class ListArrayList {

	public static void main(String[] args) {
	
	//  System.out.println("  "); " "   ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	

		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(500);
		al.add(10);
		al.add(500);
		al.add(10);
		al.add(500);
		al.add(null);
		al.add(null);
		al.add("Milind");
		al.add("Milind");
		al.add(230.66);
		
		//System.out.println(al);
		
		ArrayList al1=new ArrayList();
		al1.add(10);
		al1.add(500);
		al1.add(10);
		al1.add(500);
		al1.add(10);
		al1.add(500);
		al1.add(null);
		al1.add(null);
		al1.add("Milind");
		al1.add("Milind");
		al1.add(230.66);
		
		al.addAll(al1);
		//System.out.println(al);
		//System.out.println(al1);
		
		//al.remove(6);	
		al.removeAll(al1);
	//	System.out.println(al);
		
		//System.out.println(al1);
		al1.set(1, 8955);
		System.out.println(al1);
		
		System.out.println(al1.isEmpty());
		
		System.out.println(al1.contains(10));
		
		System.out.println(al1.size());
		
		System.out.println(al1.get(1));
		
		
		System.out.println("\n Display Element using by For Each Loop \n");
		
		for(Object temp:al1)
		{
			System.out.println(temp);
		}	
		
		System.out.println(" \n Display Element using by Iterator Cursor \n");
		
		Iterator itr=al1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}	
		
		
	//  System.out.println("  "); " "   ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	

		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
