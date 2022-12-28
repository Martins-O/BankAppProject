package services;

import dtos.request.DepositRequest;
import dtos.request.WithdrawRequest;
import dtos.response.AccountDTO;
import exception.DepositException;
import exception.InsufficientFundsException;

public interface AccountService {
	AccountDTO deposit(DepositRequest request) throws DepositException;

	AccountDTO Withdraw(WithdrawRequest request) throws InsufficientFundsException;
}
