package exceptions;

public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(Long id) {
		super("cannot find employee: "+id);
	}
	
}
