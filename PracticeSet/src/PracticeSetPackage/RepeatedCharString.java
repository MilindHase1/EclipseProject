package PracticeSetPackage;

public class RepeatedCharString {

	public static void main(String[] args) {
		String s1="SuShmitta";
		int len=s1.length();
		
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					System.out.println(s1.charAt(i));
					
				}
			}
		}

	}

}
