package Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLArgestArrayItem {

	public static void main(String[] args) 
	{
		
		Integer numbers[] = {20, 30 ,50, 10, 40};
		
		List<Integer> al = Arrays.asList(numbers);
		
				 Collections.sort(al);
				
				 int SecondSmallest = al.get(1);
				 
				 
				 System.out.println("Second ssmallest number = "+SecondSmallest);
				
	
	}
	}