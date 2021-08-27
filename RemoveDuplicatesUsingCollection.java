package week3day2Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] splitString = text.split(" ");
		
		List<String> str1=new ArrayList<String>(Arrays.asList(splitString));
		
		int len=str1.size();
		System.out.println("Split string length is: "+len);
		
		 Set<String> hashSet = new LinkedHashSet(str1);
	        ArrayList<String> removedDuplicates = new ArrayList(hashSet);

        System.out.println(removedDuplicates);
        
        for(int i=0;i<removedDuplicates.size();i++) {
        	System.out.print( removedDuplicates.get(i)+ " ");
        }
		

	}

}
