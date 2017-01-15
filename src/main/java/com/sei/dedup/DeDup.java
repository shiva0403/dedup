package com.sei.dedup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * @author shiva
 * 
 *         Description
 * 
 *         1. Given the following class, write 3 methods that can be used to
 *         return an array that has no duplicates. 2. You should define a method
 *         signature that you feel is appropriate to the problem. 3. We would
 *         prefer to see three implementations (one that should take into
 *         consideration #4 below) and an explanation of what use-cases are
 *         suitable to each implementation 4. What if we need to retain the
 *         original order? 5. What are the positives and negatives of your
 *         solution? a. Can you implement it another way so as to avoid the
 *         negatives? 6. Your solution should be testable and �production
 *         ready.� 7. Your solution should be posted to a public github repo
 *         that SEI can clone.
 *
 * 
 */
public class DeDup {

	public static int[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34, 86, 25, 43, 2, 1, 10000, 11, 16, 19, 1,
			18, 4, 9, 3, 20, 17, 8, 15, 6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17, 16, 3, 6,
			19, 13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17, 10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeDup dedup = new DeDup();
		String version = System.getProperty("java.version");
		System.out.println(version);
		dedup.removeDuplicatesFromArray(randomIntegers);
		System.out.println(System.currentTimeMillis());
		dedup.removeDuplicatesFromArrayUsingSet(randomIntegers);
		System.out.println(System.currentTimeMillis());		
		dedup.removeDuplicatesFromArrayUsingLinkedHashSet(randomIntegers);
		System.out.println(System.currentTimeMillis());
	}

	public int[] removeDuplicatesFromArray(int []inputArray) {

		List<Integer> l = new ArrayList<Integer>();
		for (int input : inputArray) {
			if (!l.contains(input)) {
				l.add(input);
			}
		}
		return convertIntegerListtoIntArray(l);
	}
	
	public int[] removeDuplicatesFromArrayUsingSet(int []inputArray) {
		Set<Integer> output = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for (int number : inputArray) {
			if (output.add(number) == true) {
				list.add(number);
			}
		}
		return convertIntegerListtoIntArray(list);
	}

	public int[] removeDuplicatesFromArrayUsingLinkedHashSet(int []inputArray){
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		for(int number: inputArray){
			set.add(number);
		}
		
		return set.stream().mapToInt(i -> i).toArray();
	}

	public int[] convertIntegerListtoIntArray(List<Integer> list){
		return list.stream().mapToInt(i -> i).toArray();
	}
}
