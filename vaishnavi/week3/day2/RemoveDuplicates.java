package week3.day2.assignments;


import java.util.LinkedHashSet;

import java.util.Set;


public class RemoveDuplicates {
	public static void main(String[] args) {
		

	String str = "Paypalindia";
	char[] ch = str.toCharArray();
	Set<Character> charset = new LinkedHashSet<Character>();
	for (char c : ch) {
		charset.add(c);
	}
	StringBuilder sb = new StringBuilder();
	for(Character character : charset) {
		sb.append(character);
}
System.out.println("String after removing duplicates    :" + sb.toString());
	
}
}
