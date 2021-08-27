package week3day2Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersectionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = { 3, 4, 5, 2, 2 };
		Integer arr1[] = { 4, 2, 1, 4 };

		List<Integer> intList = new ArrayList<Integer>();
		intList.addAll(Arrays.asList(arr));

		List<Integer> intList1 = new ArrayList<Integer>(Arrays.asList(arr1));

		intList1.retainAll(intList);
		System.out.println("Duplicate elements in arr1[] : " + intList1);

}

}
