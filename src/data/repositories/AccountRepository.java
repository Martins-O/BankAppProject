package data.repositories;

import data.model.Account;

import java.math.BigDecimal;

public interface AccountRepository {

	Account findByAccountNumber(String accountNumber);
	long count();
	void deleteAccount(String accountNumber);
	Account saveAccount(Account account);


	
}
