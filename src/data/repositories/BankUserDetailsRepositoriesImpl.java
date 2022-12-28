package data.repositories;

import data.model.BankUserDetails;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class BankUserDetailsRepositoriesImpl implements BankUserDetailsRepositories{

	private SecureRandom random = new SecureRandom();

	private List<BankUserDetails> detailsDb = new ArrayList<>();
	@Override
	public long count() {
		return detailsDb.size();
	}

	@Override
	public void deleteUser(String email) {
		for(BankUserDetails details : detailsDb){
			if(details.getEmail().equals(email)){
				detailsDb.remove(details);
				break;
			}
		}

	}

	@Override
	public BankUserDetails save(BankUserDetails details) {
//		if(details.getEmail() != null){
//			updateUser(details);
//		}else {
//		detailsDb.add(details);
//		}
//		return details;
		if(findByEmail(details.getEmail()) == null){
			detailsDb.add(details);
		}
		return details;
	}

	@Override
	public void updateUser(BankUserDetails details) {
		BankUserDetails savedDetails = findByEmail(details.getEmail());
		if(savedDetails != null) {
			savedDetails.setFirstName(details.getFirstName());
		}
		if(savedDetails != null) {
			savedDetails.setLastName(details.getLastName());
		}
		if(savedDetails != null) {
			savedDetails.setAge(details.getAge());
		}
//		save(savedDetails);
	}

	@Override
	public BankUserDetails findByEmail(String email) {
		for(BankUserDetails details : detailsDb){
			if(details.getEmail().equals(email)){
				return details;
			}
		}
		return null;
	}
}
