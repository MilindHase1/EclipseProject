package PracticeSetPackage;

public class StringFunction {

	public static void main(String[] args) {
		String s1="mi lind";
		String s2="Milind";
		
		
		System.out.println(s1.toUpperCase()); // uppercase
		System.out.println(s2.toLowerCase()); // lowercase
		
		
	int len=s1.length();
	System.out.println("Length of String "+len);
	for(int i=0;i<len;i++)
	{
		System.out.println(s1.charAt(i));
	}
	
	String[] s3=s1.split(" ");
	int len1=s3.length;
	for(int i=0;i<len1;i++)
		
	{
		System.out.println(s3[i]);
	}
	
	
	if(s1.contains("pp"))
	{
		System.out.println("The text is avilable in current string");
	}
	else
	{
		System.out.println("The text is not avilable in current string");
	}

	if(s1.isEmpty())
	{
		System.out.println("String is empty");
	}
	
	else
	{
		System.out.println("String is not empty");
	}
	
	if(s1.equals(s2))
	{
		System.out.println("Both String are Same");
	}
	
	else
	{
		System.out.println("Both String are not same");
	}
	
	if(s1.equalsIgnoreCase(s2))
	{
		System.out.println("Both string are equal");
	}
	
	else {
		System.out.println("Both String Are  not equal");
	}
	
	String s4="I am ";
	String s5="Automation ";
	String s6=" Engineer";
	
	
	String s7=s4.concat(s5).concat(s6);
	
	System.out.println(s7);
	
	System.out.println(s6.lastIndexOf("r"));
	
	System.out.println(s5.substring(3));
	
	System.out.println(s6.replace("e", "k"));
	
	System.out.println(s4.startsWith("k"));
	
	System.out.println(s4.endsWith("j"));
	
	int len2=s5.length();
	for(int i=len-1;i>=0;i--)
	{
		System.out.print(s5.charAt(i));
	}
	
	System.out.println(" \n\n");
	
	for(char ch='A';ch<='Z';ch++)
	{
		System.out.print(ch);
	}
	
	System.out.println("\n");
	for(char ch='a';ch<='z';ch++)
	{
		System.out.print(ch);
	}
	
	System.out.println("\n");
	for(char ch='Z';ch>='A';ch--)
	{
		System.out.print(ch);
	}
	
	System.out.println("\n");
	for(char ch='z';ch>='a';ch--)
	{
		System.out.print(ch);
	}
	
	System.out.println("\n");
	int n=1;
	for(int i=1;i<5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			System.out.print(" " +n+ " ");
			n++;
		}
		System.out.println(" ");
	}
	
	
	char ch='A';
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" "+ch+ " ");
			ch++;
		}
		System.out.println(" ");
	}
	
	
	for(int i=1;i<=5;i++)
	{
	   for(int j=1;j<=i;j++)
	   {
		   System.out.print(" * ");
	   }
	   
	   System.out.println(" ");
	}
	
	int a=1;
	
	for(int i=1;i<=5;i++)
	{
		for(int j=5;j>=i;j--)
		{
			System.out.print(" "+a+" ");
			a++;
		}
		 
		a=1;
		System.out.println(" ");
	}
	
	
	
	int num=25;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(num%2==0)
			{
				System.out.print(" "+num+" ");	
			}
			
			num--;
		}
		
		System.out.println(" ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
