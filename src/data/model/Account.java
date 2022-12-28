package data.model;

import data.repositories.BankUserDetailsRepositoriesImpl;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
	private BankUserDetails ownersName;
	private BigDecimal AccountBalance;
	private String accountNumber;
}
