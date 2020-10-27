package StringPrograms;

import java.util.Scanner;

public class ReverseofString 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String str; 
		String reverse = "";
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter string of your choice");
		
		str = in.nextLine();
		
		for(int i = str.length()-1; i>=0; i--)
		{

			char c = str.charAt(i);
			System.out.println("Characters of Original string is "+c);
			
			reverse = reverse + str.charAt(i);
			
		}
		
	
		
		System.out.println("Reverse of String is = "+reverse);
		
		char chaArray[] = reverse.toCharArray();
		
		for(int i = 0; i<chaArray.length; i++)
		{
			System.out.print(" "+chaArray[i]);
		}
		System.out.println();
		
	   
		
		


	}

}
