package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingOfMechanism {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int numbers[] = {50, 10 ,20 ,60 , 25};
		
		
		Arrays.sort(numbers);
		for(int i = 0; i<numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}
		
		
		
		List <Integer> numbers1 = new ArrayList<Integer>();
		
		numbers1.add(30);
		numbers1.add(10);
		numbers1.add(40);
		numbers1.add(20);
		numbers1.add(10);
		numbers1.add(30);
		
		Collections.sort(numbers1);
		
		System.out.println(numbers1);
		
		
		String str = "dcbefgha";
		
		char charArray[] = str.toCharArray();
		
		
		Arrays.sort(charArray);
		
		for(int i = 0; i<charArray.length; i++)
		{
			System.out.println(charArray[i]);
		}
				
		
		
		Arrays.asList(charArray);
		
		System.out.println(charArray);

		
		
	}

}
