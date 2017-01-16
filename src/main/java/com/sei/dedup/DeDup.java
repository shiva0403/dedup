package com.sei.dedup;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * @author shiva
 * 
 * Description- Removing duplicates from a integer array
 * 
 */
public class DeDup {

	public static int[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34, 86, 25, 43, 2, 1, 10000, 11, 16, 19, 1,
			18, 4, 9, 3, 20, 17, 8, 15, 6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17, 16, 3, 6,
			19, 13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17, 10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeDup dedup = new DeDup();
		dedup.removeDuplicatesFromArray(randomIntegers);
		dedup.removeDuplicatesFromArrayUsingSet(randomIntegers);
		dedup.removeDuplicatesFromArrayUsingLinkedHashSet(randomIntegers);
	}
	
	
	/**
	 * removeDuplicatesFromArray
	 * Description: Remove duplicates from Array using ArrayList, retaining input order
	 * @param inputArray
	 * @return int[]
	 */
	public int[] removeDuplicatesFromArray(int []inputArray) {

		List<Integer> list = new ArrayList<Integer>();
		if(inputArray != null && inputArray.length > 0){
			//if input is only single number 
			if(inputArray.length == 1){
				return inputArray;
			}
			for (int input : inputArray) {
				if (!list.contains(input)) {
					list.add(input);
				}
			}
		}
		
		return convertIntegerListtoIntArray(list);
	}
	
	/**
	 * removeDuplicatesFromArrayUsingSet
	 * Remove duplicates from Array using Set and List, retaining input order
	 * @param inputArray
	 * @return int[]
	 */
	public int[] removeDuplicatesFromArrayUsingSet(int []inputArray) {
		Set<Integer> output = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		if(inputArray != null && inputArray.length > 0){
			if(inputArray.length == 1){
				return inputArray;
			}
			for (int number : inputArray) {
				if (output.add(number) == true) {
					list.add(number);
				}
			}
		}
		
		return convertIntegerListtoIntArray(list);
	}

	/**
	 * removeDuplicatesFromArrayUsingLinkedHashSet
	 * Removing duplicates from Array using LinkedHashSet, retaining input order
	 * @param inputArray
	 * @return int[]
	 */
	public int[] removeDuplicatesFromArrayUsingLinkedHashSet(int []inputArray){
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		if(inputArray != null && inputArray.length > 0){
			if(inputArray.length == 1){
				return inputArray;
			}
			for(int number: inputArray){
				set.add(number);
			}
		}
		
		return convertIntegerSetToIntArray(set);
	}

	/**
	 * convertIntegerListtoIntArray
	 * converting integer list to int array
	 * @param list
	 * @return int[]
	 */
	public int[] convertIntegerListtoIntArray(List<Integer> list){
		int []output = null;
		if(list != null){
			output = list.stream().mapToInt(i -> i).toArray();
		}
		return output;
	}
	
	/**
	 * convertIntegerSetToIntArray
	 * @param set
	 * @return int[]
	 */
	public int[] convertIntegerSetToIntArray(Set<Integer> set){
		int []output = null;
		if(set != null){
			output = set.stream().mapToInt(i -> i).toArray();
		}
		return output;
	}
}
