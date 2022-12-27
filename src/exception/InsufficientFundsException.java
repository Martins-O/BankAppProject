package exception;

public class InsufficientFundsException extends BankApplicationException {

	public InsufficientFundsException(String message) {
		super(message);
	}
}
