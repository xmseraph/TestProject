package org.mxu.practice.googleiq;

import java.util.Arrays;

import org.junit.Test;


public class AppTest1 {
	@Test
	public void testTripleSort()
    {
    	String[] testee = new String[]{"blue","red","blue","yellow","red","yellow","blue","yellow","red"};
        System.out.println( Arrays.toString(App.tripleSort(testee)));
    }
}
