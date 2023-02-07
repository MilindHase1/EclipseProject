package PracticeSetPackage;

public class SplitSting {

	public static void main(String[] args) {
		String s1= "I am an automaton engineer";
		String s2[]=s1.split(" ");
		int count=0;
		int len=s2.length;
		
		for(int i=0;i<len;i++)
		{
			count++;
		  System.out.println(s2[i]);	
		}
		
		System.out.println("Count of String "+count);
	}
}
