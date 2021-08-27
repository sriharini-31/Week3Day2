package week3day2Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] value = { 3, 2, 11, 4, 6, 7 };

		List<Integer> data = new ArrayList<Integer>();
		for (int i = 0; i < value.length; i++) {
			data.add(value[i]);
		}
		Collections.sort(data);
		int len = data.size();
		System.out.println("Second Largest number is: " + data.get(len - 2));

	}

}
