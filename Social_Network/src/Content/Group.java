package Content;

public class Group implements MyGroup {

	private String picture;
	private User adminList;
	private User memberList;
	private int postidList;
	private User joinRequestList;
	private String groupName;
	private String groupDescription;

	/**
	 * 
	 * @param aPost
	 */
	public User post(Post aPost) {
		// TODO - implement Group.post
		throw new UnsupportedOperationException();
	}

	public User getPicture() {
		// TODO - implement Group.getPicture
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param aPicture
	 */
	public User setPicture(String aPicture) {
		// TODO - implement Group.setPicture
		throw new UnsupportedOperationException();
	}

	public User view() {
		// TODO - implement Group.view
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param adminToAdd
	 */
	public User addAdmin(User adminToAdd) {
		// TODO - implement Group.addAdmin
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param userToAdd
	 */
	public User addUser(User userToAdd) {
		// TODO - implement Group.addUser
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param userToRemove
	 */
	public User removeUser(User userToRemove) {
		// TODO - implement Group.removeUser
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param requestingUser
	 */
	public User acceptJoinRequest(User requestingUser) {
		// TODO - implement Group.acceptJoinRequest
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param requestingUser
	 */
	public User rejectJoinRequest(User requestingUser) {
		// TODO - implement Group.rejectJoinRequest
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param userToBePromoted
	 */
	public User promoteUser(User userToBePromoted) {
		// TODO - implement Group.promoteUser
		throw new UnsupportedOperationException();
	}

	public User requestLeave() {
		// TODO - implement Group.requestLeave
		throw new UnsupportedOperationException();
	}

	public void changeSettings() {

	}

	public Notification nnotify() {
		// TODO - implement Group.notify
		throw new UnsupportedOperationException();
	}

	public String getGroupName() {
		return this.groupName;
	}
	
	public String getGroupDescription() {
		return groupDescription;
	}

	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

}