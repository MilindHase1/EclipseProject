package ArrayString;

import java.util.Scanner;

public class StoreArrayElement {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	//  System.out.println("  ");   " "   " " ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	@@@@  @   @     @
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Give Size Of the Array");
		int size=sc.nextInt();
		
		int x=20;
		
		int marks[]=new int[size];
		
		System.out.println("Array Element for input"); 
		for(int i=0;i<size;i++)
		{
			marks[i]=sc.nextInt();
		}	
		
		System.out.println("Your Array Element are");
		for(int i=size-1;i>=0;i--)
		{
			if(marks[i]==x)
			{
				System.out.println(i); 
			}
			System.out.println(marks[i]);
			
			
		}	
		
		
		int siz=marks.length;
		
		System.out.println("Size Of The array  "+ siz);
		
	}

}
