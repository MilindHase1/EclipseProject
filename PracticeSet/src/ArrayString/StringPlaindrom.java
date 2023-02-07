package ArrayString;

public class StringPlaindrom {

	public static void main(String[] args) {
		
	//  System.out.println("  ");  " "     " "  ()  ===>  {}  : : >=  <=   <   >  ||        >   <  %
		
		
		
		String s1="pnayanm";
		int temp=1;
		int len=s1.length();
		
		for(int i=0;i<len;i++)
		{
			for(int j=len-1;j>=0;j--)
			{
				if(s1.charAt(i)==s1.charAt(j))

                   {
					temp++;
                   }

			}		
		}
		
		if(temp>=1)
			
		{
			System.out.println("String Is  palindrom");
		}
		
		else
			
		{
			System.out.println("String Is not palindrom");	
		}
		
		
		
	}

}
