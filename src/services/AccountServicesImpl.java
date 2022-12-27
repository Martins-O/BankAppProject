package services;

import data.model.Account;
import data.model.BankUserDetails;
import data.repositories.AccountRepositoryImpl;
import dtos.request.DepositRequest;
import dtos.request.WithdrawRequest;
import dtos.response.AccountDTO;
import exception.BankApplicationException;
import exception.InsufficientFundsException;

import java.math.BigDecimal;

public class AccountServicesImpl implements AccountService{

	private AccountRepositoryImpl accountRep = new AccountRepositoryImpl();
	@Override
	public AccountDTO deposit(DepositRequest request) {
		Account account = new Account();
		account.setAccountNumber(request.getAccountNumber());
		account.setOwnersName(request.getOwnersName());
		BigDecimal newBalance = account.getAccountBalance().add(request.getAmount());
		account.setAccountBalance(newBalance);
		return new AccountDTO(newBalance);
	}

	@Override
	public AccountDTO Withdraw(WithdrawRequest request) throws InsufficientFundsException {
		Account account = new Account();
		if(request.getAmount().compareTo(account.getAccountBalance()) < 0) {
			throw new InsufficientFundsException
				("Insufficient funds to complete withdrawal");
		}
		account.setAccountBalance(request.getAccountBalance());
		BigDecimal newBalance = account.getAccountBalance().subtract(request.getAmount());
		account.setAccountBalance(newBalance);
		return new AccountDTO(newBalance);
	}
}

