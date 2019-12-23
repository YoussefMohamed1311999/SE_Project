package Storage;

public class UsernameAlreadyExists extends PersistenceException {

    public UsernameAlreadyExists() {
        super("This username already exists");
    }

    public UsernameAlreadyExists(String message) {
        super(message);
    }
}
