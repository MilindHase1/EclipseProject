package CollectionProgram;

import java.util.Iterator;
import java.util.TreeSet;

public class SetTreeSet {

	public static void main(String[] args) {
	//  System.out.println("  "); " "   ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	
	
		TreeSet ts=new TreeSet();
		TreeSet ts1=new TreeSet();
		try
		{
			ts.add(95);
			ts.add(80);
			ts.add(60);
			ts.add(85);
			ts.add(22);
			ts.add(22);		
			
			
			ts1.add(951);
			ts1.add(802);
			ts1.add(603);
			ts1.add(854);
			ts1.add(225);
			ts1.add(226);
							
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println(ts);
		
		System.out.println(ts.size());
		//System.out.println(ts.contains(60));
		System.out.println(ts.isEmpty());
		
		System.out.println(ts1);
		
		ts1.addAll(ts);
		System.out.println(ts1);
		
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
		
		ts1.remove(225);
		System.out.println(ts1);
		
		ts1.removeAll(ts);
		System.out.println(ts1);
		
		ts1.clear();
		System.out.println(ts1);
		
		 System.out.println("\n Display Tree Element Using by Iterator \n");
		 
		Iterator itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}	
		
		System.out.println(ts);
		
		 System.out.println("\n Display Tree Element Using by For Each Loop \n");
		
		for(Object temp:ts)
		{
			System.out.println(temp); 
		}
		 
	//  System.out.println("  "); " "   ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	
		

	}
	
 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


