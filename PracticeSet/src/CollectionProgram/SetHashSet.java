package CollectionProgram;

import java.util.HashSet;
import java.util.Iterator;

public class SetHashSet {

	public static void main(String[] args) {
		
	//  System.out.println("  "); " "   ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	
		
		HashSet hs=new HashSet();
		
		hs.add(10);
		hs.add(30);
		hs.add(10);
		hs.add(null);
		hs.add(null);
		hs.add(50.60);
		hs.add(50.60);
		hs.add("Milind");
		hs.add("Milind");
		
		
     HashSet hs1=new HashSet();
		
		hs1.add(101);
		hs1.add(301);
		hs1.add(102);
		hs1.add(null);
		hs1.add(null);
		hs1.add(50.60);
		hs1.add(50.620);
		hs1.add("Milind");
		hs1.add("Milind");
		
		System.out.println(hs);
		
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains(50.6));
		
		System.out.println("\n Display Element of the  set  using  by Iterator \n");
		
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());	
		}
		
		
		System.out.println("\n  Display Element  by  using For Each Loop \n");
		
		for(Object temp:hs)
		{
			System.out.println(temp);
		}
		
		System.out.println(" \n\n ");
		
		hs.addAll(hs1);
		
		System.out.println(hs);
		
		System.out.println(hs.containsAll(hs1));
		
		System.out.println(hs);
		hs.remove(10);
		
		System.out.println(hs);
		
		hs.removeAll(hs1);
		
		System.out.println(hs);
		
		hs.clear();
		System.out.println(hs);
		
	//  System.out.println("  ");  " "   ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	
		

	}
	
	
	
	

}
