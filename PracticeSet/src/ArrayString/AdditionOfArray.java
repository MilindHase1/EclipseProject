package ArrayString;

import java.util.Scanner;

public class AdditionOfArray {

	public static void main(String[] args) {
	//  System.out.println("  ");   " "   " " ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	@@@@  @   @     @
		
		// Enter Your character in array and print it
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How Many Character you want to Enter Here");
		int size=sc.nextInt();
		
		char data[]=new char[size];
		
		System.out.println("Enter Your Character");
		for(int i=0;i<size;i++)
		{
			data[i]=sc.next().charAt(0);
		}
		
		System.out.println("Your Character Array are");
		
		for(int i=0;i<size;i++)
		{
			System.out.println(data[i]);	
		}	
		
		System.out.println("Repeat Character in Array");
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(data[i]==data[j])
				{
					System.out.println(data[i]);	
				}	
			}
			
		}
		
		
		
	}

}
