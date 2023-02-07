package CollectionProgram;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetLinkedHashSet {

	public static void main(String[] args) {
	//  System.out.println("  "); " "   ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	
		
		LinkedHashSet ls=new LinkedHashSet();
		
		ls.add(10);
		ls.add(10);
		ls.add(20);
		ls.add(20);
		ls.add(null);
		ls.add(null);
		ls.add(50.325);
		ls.add(0);	
		
		
      LinkedHashSet ls1=new LinkedHashSet();
		
		ls1.add(101);
		ls1.add(104);
		ls1.add(202);
		ls1.add(220);
		ls1.add(null);
		ls1.add(null);
		ls1.add(50.35);
		ls1.add(022);
		
		
		System.out.println(ls);
		
		System.out.println(ls.size());	
		System.out.println(ls.isEmpty());
		System.out.println(ls.contains(20));
		
		
		
		ls1.addAll(ls);
		System.out.println(ls1);
		
		System.out.println("\n Display  LinkedHasSet Element using by Iterator \n");
		
		Iterator itr=ls.iterator();
		while(itr.hasNext())
			
		{
			System.out.println(itr.next());
		}
		
		System.out.println("\n Display  LinkedHasSet Element using by For Each loop \n");
		
		for(Object temp:ls)
		{
			System.out.println(temp); 
			
		}	
		
		ls.remove(20);
		System.out.println(ls);
		
		
		
		System.out.println(ls1);
		
		ls1.removeAll(ls);
		System.out.println(ls1);
		
		ls1.clear();
		System.out.println(ls1);
		
	//  System.out.println("  "); " "   ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
