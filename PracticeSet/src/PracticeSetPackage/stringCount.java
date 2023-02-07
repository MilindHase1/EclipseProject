package PracticeSetPackage;

public class stringCount {

	public static void main(String[] args) {
		//  System.out.println("  ");  "  "    "  " ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	 @   @	  
		
		String s1="Milind";
		int count=0;
		for(int i=s1.length()-1;i>=0;i--)
		{
			count++;
		} 
		
		System.out.println("Count Of your Name   == "+count); 

		
		System.out.println("Reverse String Will Be");
		
		for(int i=s1.length()-1;i>=0;i--)
		 {
			 System.out.println(s1.charAt(i));
		 } 
		
		String s2="eye";
		int temp=0;
		
		for(int i=0;i<=s2.length()-1;i++)
		{
			for(int j=s2.length()-1;j>=0;j--)
			{
				if(s2.charAt(i)==s2.charAt(j))
				{
					temp=0;
				}
				
				else
					
				{
					temp=1;
				}	
					
			}
		}	
		
		if(temp==0)
		{
			System.out.println(" String Is Palindrom ");
		}
		
		else
		{
			System.out.println(" String is not Palindrome ");
		}
		
		
		//  System.out.println("  ");  "  "    "  " ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	 @   @	  
		
		
	}

}
