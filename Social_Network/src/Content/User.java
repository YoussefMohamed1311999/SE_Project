package Content;



public class User implements MyUser {

	private String username;

	private String name;
	private String gender;
	private String password;
	private Integer telephoneNumber;
	private String email;
	private Boolean premium;
	private String profilePicture;
	private int postidList;
	
	public void signup() {
		// TODO - implement User.signup
		throw new UnsupportedOperationException();
	}

	public void login() {
		// TODO - implement User.login
		throw new UnsupportedOperationException();
	}

	public void logout() {
		// TODO - implement User.logout
		throw new UnsupportedOperationException();
	}

	public void viewprofilepage() {
		// TODO - implement User.viewprofilepage
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param userName
	 */
	public void findfriend(User userName) {
		// TODO - implement User.findfriend
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param newprofilepicture
	 */
	public void setProfilePicture(String newprofilepicture) {
		// TODO - implement User.setProfilePicture
		throw new UnsupportedOperationException();
	}

	public void postOnWall() {
		// TODO - implement User.postOnWall
		throw new UnsupportedOperationException();
	}

	public void createPage() {
		// TODO - implement User.createPage
		throw new UnsupportedOperationException();
	}

	public void createGroup() {
		// TODO - implement User.createGroup
		throw new UnsupportedOperationException();
	}

	public Group requestJoinGroup() {
		// TODO - implement User.requestJoinGroup
		throw new UnsupportedOperationException();
	}

	public void viewTimeLine() {
		// TODO - implement User.viewTimeLine
		throw new UnsupportedOperationException();
	}

	public void viewNotifications() {
		// TODO - implement User.viewNotifications
		throw new UnsupportedOperationException();
	}

	public Hashtag searchByHashtag() {
		// TODO - implement User.searchByHashtag
		throw new UnsupportedOperationException();
	}

	public Group searchByGroup() {
		// TODO - implement User.searchByGroup
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param userName
	 */
	public User sendMessage(User userName) {
		// TODO - implement User.sendMessage
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param userName
	 */
	public User recieveMessage(User userName) {
		// TODO - implement User.recieveMessage
		throw new UnsupportedOperationException();
	}

	public void upgradeRegistration() {
		// TODO - implement User.upgradeRegistration
		throw new UnsupportedOperationException();
	}

	public Notification nnotify() {
		// TODO - implement User.notify
		throw new UnsupportedOperationException();
	}

	public String getUserName() {
			return this.username;
	}

	public String getEmail() {
		return this.email;
	}
	
	public void setUserName(String usernm) {
		this.username = usernm;
	}

	public void setEmail(String userem) {
		this.email = userem;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(Integer telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public Boolean getPremium() {
		return premium;
	}

	public void setPremium(Boolean premium) {
		this.premium = premium;
	}

	public int getPostidList() {
		return postidList;
	}

	public void setPostidList(int postidList) {
		this.postidList = postidList;
	}

	public String getProfilePicture() {
		return profilePicture;
	}


}