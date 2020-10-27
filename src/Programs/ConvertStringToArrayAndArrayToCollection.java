package Programs;

import java.util.Arrays;
import java.util.List;

public class ConvertStringToArrayAndArrayToCollection 
{

	public static void main(String[] args) 
	{
		String str = "I am an indian";
		
		char charArray[] = str.toCharArray();
		
		for(char each:charArray)
		{
			System.out.println(each);
		}
		
		
		
		char charArrayToConvert[] = {'z', 'x','a','b'};
		
		String convertedString = new String();
		convertedString = String.valueOf(charArrayToConvert);
		
		
		System.out.println(convertedString);
		
		
		
		int numArray[] = {10, 20 , 30 , 50};
		
		
		
		
		
		

	}

}
