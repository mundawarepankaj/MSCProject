package Programs;

import java.util.Arrays;

public class ArraysClassDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int numbers[] = new int[] {10,20,30,5,1};
		
		Arrays.sort(numbers);
		
		for(int each: numbers)
		{
			System.out.println(each);
		}
		
		
		
	}

}
