package Content;

import java.util.ArrayList;

public interface MyUser {

	/**
	 * 
	 * @param newprofilepicture
	 */
	void setProfilePicture(String newprofilepicture);

	void viewNotifications();

	/**
	 * 
	 * @param userName
	 */
	User sendMessage(User userName);

    void sendFriendRequest(String username);

    void acceptFriendRequest(int requestNumber);

    ArrayList<User> showFriendRequests();

    void findfriend(User userName);
	
	/**
	 * 
	 * @param userName
	 */
	User recieveMessage(User userName);

	void createPage();

	void createGroup();

	Group requestJoinGroup();

}