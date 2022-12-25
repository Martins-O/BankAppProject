package services;

import data.model.BankUserDetails;

public interface AccountService {
	BankUserDetails deposit(String accountNumber);

	BankUserDetails Withdraw(String accountNumber);
}
