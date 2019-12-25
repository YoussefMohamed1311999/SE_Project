import Content.User;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class UserTest {

    private User user1, user2, user3;

    @BeforeTest
    void setup() {
        user1 = new User("username1", "12345678");
        user2 = new User("username2", "12345678");
        user3 = new User("username3", "12345678");
    }

    @Test
    public void testSendFriendRequest() {
        int numOfFriendRequests = user2.showFriendRequests().size();
        user1.sendFriendRequest(user2.getUserName());
        Assert.assertEquals(user2.showFriendRequests().size(), numOfFriendRequests + 1);
    }

    @Test
    public void testSendMultipleFriendRequest() {
        int numOfFriendRequests = user2.showFriendRequests().size();
        user3.sendFriendRequest(user2.getUserName());
        user3.sendFriendRequest(user2.getUserName());
        Assert.assertEquals(user2.showFriendRequests().size(), numOfFriendRequests + 1);
    }

    @Test
    public void testAcceptFriendRequest() {
        user1.sendFriendRequest(user2.getUserName());
        int numOfFriendRequests = user2.showFriendRequests().size();
        user2.acceptFriendRequest(0);
        Assert.assertEquals(user2.showFriendRequests().size(), numOfFriendRequests - 1);
    }
}
