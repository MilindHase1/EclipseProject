package PracticeSetPackage;

public class PalindormNumber {

	public static void main(String[] args) {
		int num=127;
		int rem=0;
		int sum=0;
		int temp=num;
		
		while(num>0)
		{
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
			
		}

		
		if(temp==sum)
		{
			System.out.println("Number is palindrom");
		}
		
		else
		{
			 System.out.println("Number is not palindrom");
		}
	}

}
