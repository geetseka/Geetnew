package org.cap.bankapp.test;

import org.cap.dto.Customer;
import org.cap.exception.InvalidInitialAmountException;
import org.cap.service.AcccountService;
import org.cap.service.AccountServiceImpl;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TestRules {

	
	private AcccountService service;
	
	@Before
	public void initMethod(){
		service=new AccountServiceImpl();
	}
	
	
	@Rule
	public ExpectedException thrown=ExpectedException.none();
	
	@Test
	public void test_Exception_in_addAccount_method() throws InvalidInitialAmountException{
		
		Customer customer=null;
		
		
	}
	
	@Rule
	public Timeout timeout=new Timeout(20);
	@Test
	public void testTimeOut(){
		long sum=0;
		for(long i=0;i<237;i++)
			sum+=i;
	}
	
	
}
