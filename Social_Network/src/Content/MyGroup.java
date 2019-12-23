package Content;

public interface MyGroup {

	/**
	 * 
	 * @param aPost
	 */
	User post(Post aPost);

	User view();

	void changeSettings();

	User getPicture();

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

	User requestLeave();

	/**
	 * 
	 * @param userToRemove
	 */
	User removeUser(User userToRemove);

}