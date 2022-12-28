package services;

import data.model.BankUserDetails;
import data.repositories.BankUserDetailsRepositories;
import data.repositories.BankUserDetailsRepositoriesImpl;
import dtos.request.RegisterRequest;
import dtos.request.UpdateUserRequest;
import dtos.response.BankUserDetailsDTO;
import exception.RegistrationException;

import java.security.SecureRandom;

public class BankUserDetailsServiceImpl implements BankUserDetailsService{

	private final BankUserDetailsRepositories bankUserDetailsRepositories = new BankUserDetailsRepositoriesImpl();
	@Override
	public BankUserDetailsDTO registerUser(RegisterRequest request) throws RegistrationException {
		BankUserDetails details = new BankUserDetails();
		details.setFirstName(request.getFirstName());
		details.setLastName(request.getLastName());
		details.setEmail(request.getEmail());
		details.setPhoneNumber(request.getPhoneNumber());
		details.setAge(request.getAge());
		if(bankUserDetailsRepositories.findByEmail(request.getEmail()) == null)
			throw new RegistrationException("Email cannot be empty");
		BankUserDetailsDTO detailsDTO = new BankUserDetailsDTO();
		detailsDTO.setEmail(request.getEmail());
		detailsDTO.setFirstName(request.getFirstName());
		detailsDTO.setLastName(request.getLastName());
		detailsDTO.setAge(request.getAge());
		detailsDTO.setPhoneNumber(request.getPhoneNumber());
		return detailsDTO;
	}

	@Override
	public BankUserDetailsDTO updateUser(UpdateUserRequest request) {
		BankUserDetails toBeDetails = new BankUserDetails();
		if(request.getFirstName() != null) {
			toBeDetails.setFirstName(request.getFirstName());
		}
		if(request.getLastName() != null) {
			toBeDetails.setLastName(request.getLastName());
		}
		if(request.getPhoneNumber() != null) {
			toBeDetails.setPhoneNumber(request.getPhoneNumber());
		}
		return new BankUserDetailsDTO("Updated successfully");
	}

	@Override
	public void deleteUser(String email) {
		bankUserDetailsRepositories.deleteUser(email);
	}
}
