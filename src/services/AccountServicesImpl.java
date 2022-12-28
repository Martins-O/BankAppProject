package services;

import data.model.Account;
import data.repositories.AccountRepositoryImpl;
import data.repositories.BankUserDetailsRepositories;
import data.repositories.BankUserDetailsRepositoriesImpl;
import dtos.request.DepositRequest;
import dtos.request.WithdrawRequest;
import dtos.response.AccountDTO;
import exception.DepositException;
import exception.InsufficientFundsException;

import java.math.BigDecimal;

public class AccountServicesImpl implements AccountService{

	private AccountRepositoryImpl accountRep = new AccountRepositoryImpl();
	private BankUserDetailsRepositories detailsRep = new BankUserDetailsRepositoriesImpl();
	@Override
	public AccountDTO deposit(DepositRequest request) throws DepositException {
		Account account = new Account();
		BigDecimal DEFAULT_VALUE = new BigDecimal(0);
		if(request.getAmount().compareTo(DEFAULT_VALUE) < 0){
			throw new DepositException("Cannot deposit the amount");
		}
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

