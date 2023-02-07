package ArrayString;

import java.util.Scanner;

public class ArrayAddition {

	public static void main(String[] args) {
	//  System.out.println("  ");   " "   " " ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	@@@@  @   @     @
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Your 1st Array Row");
		int row=sc.nextInt();
		
		System.out.println("Enter Your 1st Cloumn");
		int col=sc.nextInt();
		
		int array1[][]=new int[row][col];
		
		System.out.println("Enter Your Row And Cloumn Value in the Matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				array1[i][j]=sc.nextInt();
			}
				
		}	
		
		
		System.out.println("Your Array Vlaues Are");
		for(int i=0;i<row;i++)
			{
			    for(int j=0;j<col;j++)
			    	
				{
			    	System.out.print(" "+array1[i][j]);
				}

			    System.out.println();
			}
		
		
		System.out.println("Enter 2nd Array");
		
		System.out.println("2nd Array Element Row");
		int row1=sc.nextInt();
		
		System.out.println("2nd Array Element Column");
		int col1=sc.nextInt();
		
		int array2[][]=new int[row1][col1];
		
		System.out.println("2nd Array Element Are");
		
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<col1;j++)
			{
				array2[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Display Second Array Element Are");
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<col1;j++)
			{
				System.out.print(" "+array2[i][j]);
			}	
			System.out.println(" ");
		}
		
		
		int[][] sum = new int[2][3];
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				sum[i][j]=array1[i][j]+array2[i][j];
			}	
		}	
		
		System.out.println("************* Final Array Element *******************");	
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("  "+sum[i][j]);
			}
			
			System.out.println("  ");
		}	
		
		
		
		 }
		 	
	//  System.out.println("  ");   " "   " " ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	@@@@  @   @     @	
		
		
		
	}


