package Storage;

import Content.Group;
import Content.Post;
import Content.User;

import java.util.ArrayList;

public interface MyPersistence {

    void addFriendRequest(String username, User requestingUser);

    ArrayList<User> getFriendRequests(String username);

    ArrayList<User> getFriendRequests(User user);

    void acceptFriendRequest(User username, int requestNumber) throws IndexOutOfBoundsException;

	void savePost();

	Post SelectPost();

	void saveUser();

    User selectUser(User user) throws PersistenceException;

	void saveGroup();

	Group selectGroup();

	void SQLpersistence();

    void createUser(User user) throws PersistenceException;

	void createGroup();

	void createPost();

	void saveHashtag();

	void removeHashtag();

	void saveNotification();

	void removeNotification();

	void removeUser();

	void removeGroup();

	void removePage();

	void removePost();

	void saveAD();

	void selectAD();

	void removeAD();

}