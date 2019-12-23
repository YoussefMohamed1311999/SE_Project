package Content;

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

	public void findfriend(User userName);
	
	/**
	 * 
	 * @param userName
	 */
	User recieveMessage(User userName);

	void createPage();

	void createGroup();

	Group requestJoinGroup();

}