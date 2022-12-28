package dtos.response;

import data.model.BankUserDetails;
import data.repositories.BankUserDetailsRepositoriesImpl;

import java.math.BigDecimal;

public class AccountDTO {
	private BankUserDetails ownersName;
	private BigDecimal AccountBalance;
	private BankUserDetailsRepositoriesImpl accountNumber;

	public AccountDTO(BigDecimal newBalance) {
		this.AccountBalance = newBalance;
	}
}
