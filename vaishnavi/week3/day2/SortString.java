package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortString {
	public static void main(String[] args) {
		String str[] = { "Aspiresystems", "cts", " wipro", "Hcl" };
		List<String> strList = new ArrayList<String>(Arrays.asList(str));
		System.out.println(" before sorting :  " +strList);

		int listsize = strList.size();
		System.out.println("listSize :" + listsize);

		Collections.sort(strList);
		System.out.println(" Sorted  list is  "  +strList);
	

		Collections.reverse(strList);
		System.out.println(" reversed list is "   + strList);
		

	}

}
