package dtos.request;

import data.model.BankUserDetails;
import data.repositories.BankUserDetailsRepositoriesImpl;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class UpdateUserRequest {
	private String firstName;
	private String lastName;
	private String email;
	private LocalDateTime age;
	private String phoneNumber;
	public UpdateUserRequest(String message) {
	}
}
