package CollectionProgram;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.DelayQueue;

public class QueuePriority {

	public static void main(String[] args) {
		
	//  System.out.println("  "); " "   ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	
	
		PriorityQueue qa=new PriorityQueue();
		
		qa.add(10);
		qa.add(10);
		qa.add(20);
		qa.add(20);
	//	qa.add(null);
	//	qa.add(null);
		qa.add(120);
		qa.add(120);
		
		
		
		System.out.println(qa);
		qa.remove(120);
		
		qa.element();
		
		System.out.println(qa);
		
		System.out.println(qa.element());
		
		System.out.println(qa.isEmpty());
		System.out.println(qa.contains(20));
		
	//  System.out.println("  "); " "   ()  ===>  {}  : : >=  <=   < >  ||     " "   >   <  %	
		

	}
	
	
	
	

}
