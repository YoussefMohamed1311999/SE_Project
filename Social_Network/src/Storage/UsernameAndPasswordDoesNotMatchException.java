package Storage;

public class UsernameAndPasswordDoesNotMatchException extends PersistenceException {

    public UsernameAndPasswordDoesNotMatchException() {
        super("Username and password doesn't match");
    }

    public UsernameAndPasswordDoesNotMatchException(String message) {
        super(message);
    }
}
