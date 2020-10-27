package Programs;

public class StringComparisonOperations {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		

		   String str1 = "indian";
		   String str2 = "indian";

		   String str3 = new String("india");
		   String str4 = new String("india");

		   
		   String str5 = new String("indian");
		   
		   System.out.println(str1==str5);
		   System.out.println(str1.equals(str5));
		   System.out.println(str1==str2);
		   
		   
		  /*The String equals() method compares the original content of the string. 
		   It compares values of string for equality. String class provides two methods:

			public boolean equals(Object another) compares this string to the specified object.
			public boolean equalsIgnoreCase(String another) compares this String to another string, ignoring case.*/
		   
		  System.out.println(str1.equals(str2));   //true 
		  System.out.println(str3.equals(str4));   //true
		  
		  //Checking literals "indian" with string object "indian"
		   System.out.println(str1.equals(str3)); //false
		   
		   //The = = operator compares references not values.
		   System.out.println(str3==str4);//false
	
		   System.out.println(str1==str2); //true
		   
		   
		   
		   String str7 = "human";
		   String str8 = "Human";
		   
		   System.out.println(str7.equals(str8)); //false
		   System.out.println(str7.equalsIgnoreCase(str8)); //true
		   
		   
		   String str9 = "heaven";
		   String str10 = "heaven";
		   
		   String str11 = new String("java");
		   String str12 = new String("java");
		   
		   
		   System.out.println(str9.compareTo(str10)); //0

		   System.out.println(str11.compareTo(str12)); //
		   
		   System.out.println("-----------------------------------");
		   
		   System.out.println(str11==str12);
		   
		   
		   
		   
		   
		   
		   
	
	}

}
