package ArrayString;

public class RevNumber {

	public static void main(String[] args) {
		
	//  System.out.println("  ");   " "   " " ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	@@@@  @   @     @
	
		// Reverse Number
		
		int num=3256;
		int r,rev=0,n=0,sum=0;
		
		int temp=num;
		
		while(num>0)
		{
			r=num%10;
			sum=sum+r;
			//rev=rev*10+r;
			num=num/10;
		}
		
		
		if(temp==rev)
		{
			System.out.println("Number Is Palindrom");	
			
		}
		else
		{
			System.out.println("Numner is not palindrome");	
		}
		
		System.out.println(" Reverse Number "+ sum);
	}

}
