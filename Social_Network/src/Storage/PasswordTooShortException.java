package Storage;

public class PasswordTooShortException extends PersistenceException {

    public PasswordTooShortException() {
        super("Password is too short");
    }

    public PasswordTooShortException(String message) {
        super(message);
    }
}
