package Storage;

public class UserDoesNotExistException extends PersistenceException {

    public UserDoesNotExistException() {
        super("This username doesn't exist");
    }

    public UserDoesNotExistException(String message) {
        super(message);
    }
}
