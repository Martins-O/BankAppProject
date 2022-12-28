package services;

import dtos.request.RegisterRequest;
import dtos.request.UpdateUserRequest;
import dtos.response.BankUserDetailsDTO;
import exception.DeleteUserException;
import exception.RegistrationException;

import java.security.SecureRandom;

public interface BankUserDetailsService {

	BankUserDetailsDTO registerUser(RegisterRequest request) throws RegistrationException;
	BankUserDetailsDTO updateUser(UpdateUserRequest request);
	void deleteUser(String email) throws DeleteUserException;
}
