package data.repositories;

import data.model.Account;
import data.model.BankUserDetails;

public interface BankUserDetailsRepositories {
	long count();
	void deleteUser(String email);
	BankUserDetails save(BankUserDetails details);
	void updateUser(BankUserDetails email);
	BankUserDetails findByEmail(String email);

}
