package Content;

import Storage.PersistenceException;

public interface SCNClient {

    void signup(String username, String password);

    void login(String username, String password) throws PersistenceException;

	void logout();

	/**
	 * 
	 * @param userName
	 */
	void findfriend(User userName);

	void postOnWall();

	void createPage();

	void createGroup();

	void viewTimeLine();

	void viewNotifications();

	Hashtag searchByHashtag();

	Group searchByGroup();

	/**
	 * 
	 * @param userName
	 */
	User sendMessage(User userName);

	void upgradeRegistration();

	Notification nnotify();

	User like();

	User comment();

	/**
	 * 
	 * @param aGroup
	 */
	User shareToGroup(Group aGroup);

	void addToHashTag();

	Group requestJoinGroup();

	/**
	 * 
	 * @param adminToAdd
	 */
	User addAdmin(User adminToAdd);

	/**
	 * 
	 * @param userToAdd
	 */
	User addUser(User userToAdd);

	/**
	 * 
	 * @param userToRemove
	 */
	User removeUser(User userToRemove);

	/**
	 * 
	 * @param requestingUser
	 */
	User acceptJoinRequest(User requestingUser);

	/**
	 * 
	 * @param requestingUser
	 */
	User rejectJoinRequest(User requestingUser);

	/**
	 * 
	 * @param userToBePromoted
	 */
	User promoteUser(User userToBePromoted);

	User requestLeave();

	User changeSettings();

}