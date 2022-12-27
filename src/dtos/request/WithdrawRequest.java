package dtos.request;

import data.model.BankUserDetails;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class WithdrawRequest {
	private String accountNumber;
	private BigDecimal amount;
	private BankUserDetails ownersName;

	private BigDecimal accountBalance;
}
