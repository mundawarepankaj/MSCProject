package Programs;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int number[] = new int[5];
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter array items");
		for(int i =0; i<number.length;i++)
		{
			number[i] = in.nextInt();
			
		}
		
		
		System.out.println("Array items are");
		for(int j =0; j<number.length; j++)
		{
			System.out.println(number[j]);
		}
	}

}
