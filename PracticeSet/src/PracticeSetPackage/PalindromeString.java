package PracticeSetPackage;

public class PalindromeString {

	public static void main(String[] args) {
		
		int temp=1;
		String s1="nayan";
		int len=s1.length();
		
		for(int i=0;i<len;i++)
		{
			for(int j=len-1;j>=0;j--)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					temp=1;
				}
				else
				{
					temp=0;
				}
				
			}
		}
		
		if(temp==1)
		{
			System.out.println("String is palindrom");
		}
		else
		{
			System.out.println("String is not palindrom");
		}

	}

}
