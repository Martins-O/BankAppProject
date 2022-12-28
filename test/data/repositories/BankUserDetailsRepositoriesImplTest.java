package data.repositories;

import data.model.BankUserDetails;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BankUserDetailsRepositoriesImplTest {

	private BankUserDetailsRepositories repository = new BankUserDetailsRepositoriesImpl();

	@BeforeEach
	public void setUp() {
		repository = new BankUserDetailsRepositoriesImpl();
	}

	@Test
	public void saveUserDetailsTest(){
		BankUserDetails details = new BankUserDetails();
		details.setFirstName("Martins");
		details.setLastName("Jojolola");
		details.setEmail("Jojolola@gmail.com");
		details.setPhoneNumber("O8146587069");
		details.setAge(34);
		repository.save(details);
		assertEquals(1l, repository.count());
	}

	@Test
	public void updateUserTest(){
		BankUserDetails details = new BankUserDetails();
		details.setFirstName("Martins");
		details.setLastName("Jojolola");
		details.setEmail("Jojolola@gmail.com");
		details.setPhoneNumber("O8146587069");
		details.setAge(34);
		repository.save(details);

		BankUserDetails updateDetails = new BankUserDetails();
		updateDetails.setFirstName("Martin");
		updateDetails.setLastName("Jojjolol");
		details.setAge(35);
		repository.updateUser(updateDetails);
		assertEquals(1L, repository.count());
	}

	@Test
	public void deleteUserTest(){
		BankUserDetails details = new BankUserDetails();
		details.setEmail("Jojolola@gmail.com");
		BankUserDetails details1 = new BankUserDetails();
		details1.setEmail("Jojolola1@gmail.com");
		BankUserDetails details2 = new BankUserDetails();
		details2.setEmail("Jojolola2@gmail.com");
		BankUserDetails details3 = new BankUserDetails();
		details3.setEmail("Jojolola3@gmail.com");
		repository.save(details);
		repository.save(details1);
		repository.save(details2);
		repository.save(details3);
//		assertEquals(4L, repository.count());
		repository.deleteUser("Jojolola@gmail.com");
		assertEquals(3L, repository.count());
	}

}