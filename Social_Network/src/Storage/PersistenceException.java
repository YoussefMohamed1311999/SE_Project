package Storage;

public class PersistenceException extends Throwable {
    private String message;

    public PersistenceException() {
    }

    public PersistenceException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
