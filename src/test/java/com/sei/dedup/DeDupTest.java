package com.sei.dedup;

import java.util.List;
import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import junit.framework.TestCase;

public class DeDupTest extends TestCase {

	private DeDup deDup;
	
	@Override
	protected void setUp() throws Exception {
		deDup = new DeDup();
	}
	
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

	public void testConvertIntegerListtoIntArray() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		
		int [] arr = deDup.convertIntegerListtoIntArray(l);
		int [] expected = {1,2};
		System.out.println(arr.getClass().getComponentType());
		assertArrayEquals(expected, arr);
	}

	public void testRemoveDuplicatesFromArrayUsingSet() {
		int [] arr = {1,1,1,1,1,1};
		int []output = deDup.removeDuplicatesFromArrayUsingSet(arr);
		assertEquals(1, output.length);
	}

}
