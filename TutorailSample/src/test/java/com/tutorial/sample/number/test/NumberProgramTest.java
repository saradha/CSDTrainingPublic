package com.tutorial.sample.number.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.tutorial.sample.number.example.NumberProgram;

/**
 * 
 */

/**
 * @author 1021948
 *
 */
public class NumberProgramTest {
	  
	
	
	@Test
	public void summationTest(){
		 NumberProgram n1 = new NumberProgram();
		Assert.assertEquals(7, n1.sumTwoNumber(2,5));
		
	}
	
	@Test
	public void testGreatestNumber() throws Exception{
		 NumberProgram n1 = new NumberProgram();
		Assert.assertEquals(8, n1.getGreaterNumber(7,8));
	
		
	}
	

	@Test(expected = Exception.class)
	public void testGreatestNumberWithEqualNumbers() throws Exception{
		 NumberProgram n1 = new NumberProgram();
		 n1.getGreaterNumber(8,8);
			 
		
	
		
	}


}
