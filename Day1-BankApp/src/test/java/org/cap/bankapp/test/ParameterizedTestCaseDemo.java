package org.cap.bankapp.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.cap.service.AccountServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class ParameterizedTestCaseDemo {

	private int input;
	private int expected;
	
	AccountServiceImpl acccountService = new AccountServiceImpl();
	
	
		
	public ParameterizedTestCaseDemo(int input, int expected) {
		super();
		this.input = input;
		this.expected = expected;
	}



	@Parameters
	public static List<Object[]> myParameters(){
		return Arrays.asList(new Object[][]{
			{1,2}	
		});
		
	}

	
	@Test
	public void testAddnumbers(){
		assertEquals(expected, acccountService.addNumbers(input,input));
		//assertEquals(expected, acccountService.addNumbers(input,input));
	}
}
