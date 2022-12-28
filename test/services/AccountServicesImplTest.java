package services;

import data.model.Account;
import dtos.request.DepositRequest;
import exception.DepositException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AccountServicesImplTest {

	private AccountService accountService;

	@BeforeEach
	public void setUp() {
		accountService = new AccountServicesImpl();
	}

	@Test
	public void depositTest() throws DepositException {
		DepositRequest depositRequest = new DepositRequest();
		Account account = new Account();
		depositRequest.setAccountNumber(depositRequest.getAccountNumber());
		account.setAccountBalance(BigDecimal.valueOf(234.00));
		accountService.deposit(depositRequest);
		assertEquals(234.00 ,account.getAccountBalance());
	}

}