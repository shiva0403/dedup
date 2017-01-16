package com.sei.dedup;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * 
 * @author Shiva
 * 
 * Test case for testing the methods of DeDup class
 *
 */

public class DeDupTest extends TestCase {

	private DeDup deDup;
	
	@Override
	protected void setUp() throws Exception {
		deDup = new DeDup();
	}
	
	@Test
	public void testRemoveDuplicatesFromArray() {
		int [] arr = {1,1,1,1,1,1};
		int []output = deDup.removeDuplicatesFromArray(arr);
		assertEquals(1, output.length);
		int [] expected = {1};
		assertArrayEquals(expected, output);
		
		int []arr1 = {1,2,3,1,2,3,1,1,4};
		int []outputArray = deDup.removeDuplicatesFromArray(arr1);
		int []expected1 = {1,2,3,4};
		assertArrayEquals(expected1, outputArray);
	}
	
	@Test
	public void testConvertIntegerListtoIntArray() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		
		int [] arr = deDup.convertIntegerListtoIntArray(l);
		int [] expected = {1,2};
		assertArrayEquals(expected, arr);
	}
	
	@Test
	public void testConvertIntegerSetToIntArray(){
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		
		int []arr = deDup.convertIntegerSetToIntArray(set);
		int []excpectedResult = {1,2};
		assertArrayEquals(excpectedResult, arr);
	}

	@Test
	public void testRemoveDuplicatesFromArrayUsingSet() {
		int [] arr = {1,1,1,1,1,1};
		int []output = deDup.removeDuplicatesFromArrayUsingSet(arr);
		assertEquals(1, output.length);
		
		int []testArr = {1,2,3,4,1,2,3,4,1,2,3,4};
		int []expectedOutput = {1,2,3,4};
		int []outputArr = deDup.removeDuplicatesFromArrayUsingSet(testArr);
		assertArrayEquals(expectedOutput, outputArr);
	}
	
	@Test
	public void testRemoveDuplicatesFromArrayUsingLinkedHashSet(){
		int [] arr = {1,1,1,1,1,1};
		int []output = deDup.removeDuplicatesFromArrayUsingLinkedHashSet(arr);
		int []expectedOutput = {1};
		assertEquals(1, output.length);
		assertArrayEquals(expectedOutput, output);
		
		int []testArr = {1,2,3,4,1,2,3,4,1,2,3,4};
		int []expectedOutput1 = {1,2,3,4};
		int []outputArr = deDup.removeDuplicatesFromArrayUsingSet(testArr);
		assertArrayEquals(expectedOutput1, outputArr);
	}
	
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		deDup = null;
	}

}
