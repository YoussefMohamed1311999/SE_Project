package Storage;

import Content.Group;
import Content.Post;
import Content.User;

public interface MyPersistence {

	void savePost();

	Post SelectPost();

	void saveUser();

	User selectUser(String username, String password) throws PersistenceException;

	void saveGroup();

	Group selectGroup();

	void SQLpersistence();

	void createUser(String username, String password) throws PersistenceException;

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