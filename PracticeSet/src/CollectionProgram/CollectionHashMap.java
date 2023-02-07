package CollectionProgram;

import java.util.*;

public class CollectionHashMap {

	public static void main(String[] args) {
	//  System.out.println("  ");   " "   ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	   <>
		
		HashMap <Integer, String> hm=new HashMap<>();
		hm.put(1, "Milind");
		hm.put(2, "Saurabh");
		hm.put(3, "Akash");
		hm.put(4, "Ajit");
		hm.put(5, "Mahesh");
		hm.put(6, "Mahesh");
		hm.put(null, null);
		
		System.out.println(hm);
		
		System.out.println(hm.containsValue("Ajit")); 
		
		System.out.println(hm.isEmpty());
		System.out.println(hm.get(3));
		System.out.println(hm.containsKey(6));
		
		hm.putAll(hm);
		
		System.out.println("\n To display value of the HashMap using by For Each Loop");
		
		/*  for(Object temp:hm)
		{
			System.out.println(temp);	
		}  */
		
		
		//Iterator itr=hm.i
		
		hm.remove(2);
		
		hm.replace(6, "Bharat");
		System.out.println(hm);
		
	//  System.out.println("  ");   " "   ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	   <>
		
		
	}

}
