package CollectionProgram;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ListVectorList {

	public static void main(String[] args) {
	//  System.out.println("  "); " "   ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	

		List ve=new Vector();
		
		ve.add(10);
		ve.add(20);
		ve.add(10);
		ve.add(20);
		ve.add(10);
		ve.add(20);
		ve.add(null);
		ve.add(null);
		ve.add(null);
		ve.add("Milind");
		ve.add(50.63);
		ve.add("Milind");
		
   List ve2=new Vector();
		
   ve2.add(10);
   ve2.add(20);
   ve2.add(10);
   ve2.add(20);
   ve2.add(10);
   ve2.add(20);
   ve2.add(null);
   ve2.add(null);
   ve2.add(null);
   ve2.add("Milind");
   ve2.add(50.63);
   ve2.add("Milind");
   
	//ve.addAll(ve1) ;
   //System.out.println(ve);
   
  // System.out.println(ve1);
   
   //ve.clear();
   
   System.out.println(ve2);
   
   System.out.println("Before Size Of Ve  "+ve2.size());
   
   ve.remove(1);
   
   System.out.println("After Size Of Ve  "+ve2.size());
   
   System.out.println(ve2.isEmpty());
   
   System.out.println(ve2.contains(20));
   
   System.out.println(ve2.get(2));
   
   System.out.println("\n Display Element using By For Each Loop \n");
   
   for(Object temp:ve2)
   {
	   System.out.println(temp);  
   }
   
   System.out.println("\n Display Element using By Iterator Cursor \n");
   
   Iterator itr=ve2.iterator();
   while(itr.hasNext())
   {
	   System.out.println(itr.next());
   }
   
   System.out.println("\n Display Element using By List Iterator Cursor \n");
   ListIterator itr1=ve2.listIterator();
   while(itr1.hasNext())
   {
	   System.out.println(itr1.next()); 
   }
   
   System.out.println("\n\n");
   
   System.out.println(itr1.hasPrevious());
	   
	//  System.out.println("  "); " "   ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
