package dtos.request;

import data.model.BankUserDetails;
import lombok.Getter;

import java.math.BigDecimal;
import java.security.SecureRandom;

@Getter
public class WithdrawRequest {
//	private String accountNumber;
	private BigDecimal amount;
	private BankUserDetails ownersName;

	private BigDecimal accountBalance;
	public String getAccountNumber() {
		SecureRandom random = new SecureRandom();
		long accountNumber = random.nextLong();
		accountNumber = Math.abs(accountNumber % 100000000000L);
		return String.format("%011d", accountNumber);

	}
}
