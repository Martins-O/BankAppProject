package services;

import data.model.Account;
import data.model.BankUserDetails;
import dtos.request.DepositRequest;
import dtos.request.WithdrawRequest;
import dtos.response.AccountDTO;
import exception.InsufficientFundsException;

public interface AccountService {
	AccountDTO deposit(DepositRequest request);

	AccountDTO Withdraw(WithdrawRequest request) throws InsufficientFundsException;
}
