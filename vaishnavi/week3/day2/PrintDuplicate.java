package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class PrintDuplicate {

	public static void main(String[] args) {

		List<Integer> number = new ArrayList<Integer>(
				Arrays.asList(14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20));
		Set<Integer> value = new LinkedHashSet<Integer>();

		for (Integer name : number) {
			if (value.add(name) == false) {
				System.out.println("Duplicate is" + name);
			}
		}

	}
}