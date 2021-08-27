package week3day2Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortUsingCollection {

	public static void main(String[] args) {
	

			//1.Declare a String array and add the Strings values as (Google,Microsoft,TestLeaf,Maverick)		
	         String arr1[]= {"Aspire systems", "Cts", "Wipro", "Hcl"};
	         
	         List<String> str1=new ArrayList<String>(Arrays.asList(arr1));
			//2.Get the length of the array		
	         int strLength=str1.size();
	         System.out.println("The length of the str1 is:"+strLength);

			//3. sort the array	
	         Collections.sort(str1);
	         System.out.println("The sorted list is: "+str1);

			//4. Iterate it in the reverse order
	        Collections.reverse(str1);
			//5. print the array
	        System.out.println("The reversed  list is: "+str1);	
	

	}

}
