package data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.security.SecureRandom;
import java.util.concurrent.ThreadLocalRandom;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankUserDetails {
	@NonNull
	private String firstName;
	@NonNull
	private String lastName;
	@NonNull
	private String email;
	@NonNull
	private int age;
	@NonNull
	private String phoneNumber;
	private String accountNumber;


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public static void main(String[] args) {
		BankUserDetails details = new BankUserDetails();
		System.out.println(details.getAccountNumber());
	}
}
