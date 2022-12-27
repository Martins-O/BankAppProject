package dtos.response;

import data.model.BankUserDetails;

import java.math.BigDecimal;

public class AccountDTO {
	private BankUserDetails ownersName;
	private BigDecimal AccountBalance;
	private String accountNumber;

	public AccountDTO(BigDecimal newBalance) {
		this.AccountBalance = newBalance;
	}
}
