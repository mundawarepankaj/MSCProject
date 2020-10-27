package Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingString {

	public static void main(String[] args)
	{
		List<String> names = new ArrayList<String>();
		
		
		names.add("Pankaj");
		names.add("Aanand");
		names.add("Rajesh");
		names.add("Laxmikant");
		
		
		//Collections.sort(names);
		
		System.out.println("Original List: "+names);

		Collections.reverse(names);
		System.out.println("Reverse of List: "+names);
		
		
		Collections.sort(names);
		
		System.out.println("Sorting of List = "+names);
	
		System.out.println("-------------------------------------------------");
		
		//String s2 = new String("ancb");
		
		
		StringBuffer s = new StringBuffer("bdcaef");
		System.out.println("Original String = "+s);
		System.out.println("Reverse String  = "+s.reverse());
		
		StringBuilder s1 = new StringBuilder("bcdeafge");
		
		System.out.println("Original String = "+s1.reverse());
		System.out.println("Reverse String  = "+s1.reverse());
	
	    
		//int num[] = new int[] {10,20,30};
		
				
	}

}
