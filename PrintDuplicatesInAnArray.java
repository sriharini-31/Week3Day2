package week3day2Assignment;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Set<Integer> hashSet = new LinkedHashSet();


		for (int i=0;i<arr.length;i++) {
		hashSet.add(arr[i]);
		}

		System.out.println("Array after removed duplicates: "+hashSet);

		int[] arr2 = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer> dataList= new ArrayList<Integer>(); 
		for (int i=0;i<arr2.length;i++) {
		dataList.add(arr2[i]);
		}
		int len=dataList.size();
		System.out.println("Duplicate elements in given array: ");  
		//Searches for duplicate element  
		for(int i = 0; i < len; i++) {  
		  for(int j = i + 1; j < len; j++) {  
		      if(dataList.get(i) == dataList.get(j))  
		          System.out.println(dataList.get(j));  
		  }  
		}  
				

	}

}
