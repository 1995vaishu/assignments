package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingElements {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		Arrays.sort(arr);

		List<Integer> intList = new ArrayList<Integer>();

		int size = intList.size();
		// System.out.println(size);

		for (int i = 0; i < size; i++) {
			if (intList.get(Integer.valueOf(i)) != i + 1)
				System.out.println("The missing Element is " + intList.get(Integer.valueOf(i-1)));
			

		}

	}

}
