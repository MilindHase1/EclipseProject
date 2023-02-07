package PracticeSetPackage;

public class StringProgram {

	public static void main(String[] args) {
		
		int count=0;
		String s1="Milindee";
		int len=s1.length();
		
		for(int i=0;i<len;i++)
		{
			if(s1.charAt(i)=='a'|| s1.charAt(i)=='e'|| s1.charAt(i)=='i'|| s1.charAt(i)=='o'||s1.charAt(i)=='u'||
					s1.charAt(i)=='A'|| s1.charAt(i)=='E'|| s1.charAt(i)=='I'|| s1.charAt(i)=='O'||s1.charAt(i)=='U')
			{
				System.out.println(s1.charAt(i));
				count++;
			}		
			
		}
		System.out.println("Total count of vowel  "+count);
	}

}
