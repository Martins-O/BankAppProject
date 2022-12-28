package dtos.response;

import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Setter
public class BankUserDetailsDTO {
	private String firstName;
	private String lastName;
	private String email;
	private int age;
	private String phoneNumber;



	public BankUserDetailsDTO(String message) {
	}
}
