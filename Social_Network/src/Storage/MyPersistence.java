package Storage;

import Content.*;

public interface MyPersistence {

	void savePost();

	Post SelectPost();

	void saveUser();

	User selectUser();

	void saveGroup();

	Group selectGroup();

	void SQLpersistence();

	void createUser();

	void createGroup();

	void createPost();

	MyPersistence getInstance();

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