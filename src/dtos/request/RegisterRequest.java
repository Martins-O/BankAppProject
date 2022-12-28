package dtos.request;

import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class RegisterRequest {
	private String firstName;
	private String lastName;
	private String email;
	private int age;
	private String phoneNumber;
}
