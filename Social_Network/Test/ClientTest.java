import Content.Client;
import Content.User;
import Storage.PasswordTooShortException;
import Storage.PersistenceException;
import Storage.UsernameAlreadyExists;
import org.testng.annotations.Test;

@Test
public class ClientTest {

    private Client client = Client.getInstance();

    @Test(expectedExceptions = PasswordTooShortException.class)
    public void testSignupShortPassword() throws PersistenceException {
        client.signup(new User("username1", "1234"));
    }

    @Test(expectedExceptions = UsernameAlreadyExists.class)
    public void testSignupUserExists() throws PersistenceException {
        client.signup(new User("username1", "12345678"));
        client.signup(new User("username1", "123456789"));
    }

}
