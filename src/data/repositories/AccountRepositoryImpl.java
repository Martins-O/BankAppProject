package data.repositories;


import data.model.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountRepositoryImpl implements AccountRepository{

	private List<Account> accountsDb = new ArrayList<>();
	private String accountNumber;

	@Override
	public Account findByAccountNumber(String accountNumber) {
		for(Account account : accountsDb){
			if(account.getAccountNumber().equals(accountNumber)){
				return account;
			}
		}
		return null;
	}

	@Override
	public long count() {
		return accountsDb.size();
	}

	@Override
	public void deleteAccount(String accountNumber) {
		for(Account account : accountsDb){
			if(account.getAccountNumber().equals(accountNumber)){
				accountsDb.remove(account);
				break;
			}
		}
	}

	@Override
	public Account saveAccount(Account account) {
		accountsDb.add(account);
		return account;
	}
}
