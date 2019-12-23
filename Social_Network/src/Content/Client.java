package Content;

import Storage.Persistence;
import Storage.PersistenceException;

//Singleton Control Class
public class Client implements SCNClient {

    Persistence persistence = Persistence.getInstance();

    //Singleton Class Instance
    private static Client singletonInstance = null;

    private Client() {
    }

    //Thread-Safe singleton instance getter
    public static Client getInstance() {
        if (singletonInstance == null) {
            synchronized (Client.class) {
                if (singletonInstance == null) singletonInstance = new Client();
            }
        }
        return singletonInstance;
    }

    @Override
    public void signup(User user) throws PersistenceException {
        persistence.createUser(user);
    }

    @Override
    public Boolean login(User user) throws PersistenceException {
        persistence.selectUser(user);
        return true;
    }

    @Override
    public void logout() {

    }

    @Override
    public void findfriend(User userName) {

    }

    @Override
    public void postOnWall() {

    }

    @Override
    public void createPage() {

    }

    @Override
    public void createGroup() {

    }

    @Override
    public void viewTimeLine() {

    }

    @Override
    public void viewNotifications() {

    }

    @Override
    public Hashtag searchByHashtag() {
        return null;
    }

    @Override
    public Group searchByGroup() {
        return null;
    }

    @Override
    public User sendMessage(User userName) {
        return null;
    }

    @Override
    public void upgradeRegistration() {

    }

    @Override
    public Notification nnotify() {
        return null;
    }

    @Override
    public User like() {
        return null;
    }

    @Override
    public User comment() {
        return null;
    }

    @Override
    public User shareToGroup(Group aGroup) {
        return null;
    }

    @Override
    public void addToHashTag() {

    }

    @Override
    public Group requestJoinGroup() {
        return null;
    }

    @Override
    public User addAdmin(User adminToAdd) {
        return null;
    }

    @Override
    public User addUser(User userToAdd) {
        return null;
    }

    @Override
    public User removeUser(User userToRemove) {
        return null;
    }

    @Override
    public User acceptJoinRequest(User requestingUser) {
        return null;
    }

    @Override
    public User rejectJoinRequest(User requestingUser) {
        return null;
    }

    @Override
    public User promoteUser(User userToBePromoted) {
        return null;
    }

    @Override
    public User requestLeave() {
        return null;
    }

    @Override
    public User changeSettings() {
        return null;
    }
}
