package org.cap.bankapp.test;

import static org.junit.Assert.*;

import org.cap.dao.AccountDao;
import org.cap.dto.Account;
import org.cap.dto.Address;
import org.cap.dto.Customer;
import org.cap.service.AcccountService;
import org.cap.service.AccountServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;




public class BankAppTestCase {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	} */

	public void test_addNumbers(){
		
		AccountServiceImpl accountService = new AccountServiceImpl();
		assertEquals(100, accountService.addNumbers(50, 50));
	}
	

@Mock
private AccountDao accountDao;

private AcccountService accountService;

	@Test
	public void find_Account_By_Id_withDao(){
		Account account=new Account();
		Customer customer=new Customer();
		
		customer.setCustName("ram");
		customer.setCustAddress(new Address());
		account.setCustomer(customer);
		account.setAccountNo(100);
		account.setAmount(2000);
		}
	
	
	// initialisation
	
@Before
public void init_method(){
	MockitoAnnotations.initMocks(this);
	accountService=new AccountServiceImpl(accountDao);
	
}

	
	//declaration

@Test
public void check_withdrawal(){
	Account account=new Account();

	Customer customer=new Customer();
	
	customer.setCustName("ram");
	customer.setCustAddress(new Address());
	account.setCustomer(customer);
	account.setAccountNo(100);
	account.setAmount(2000);

	//declaration
	Mockito.when(accountDao.findAccountById(100)).thenReturn(account);
		
	//actual logic
	
}
	
}
