package Storage;

import Content.*;

public abstract class DataBase implements MyPersistence {

	private Group groupList;
	private User userList;
	private Notification notificationList;
	private Hashtag hashtagList;
	private Post postList;
	private AD AdList;

	public Group getGroupList() {
		return this.groupList;
		
	}

	public User getUserList() {
		// TODO - implement DataBase.getUserList
		throw new UnsupportedOperationException();
	}

	public Notification getNotificationList() {
		return this.notificationList;
	}

	public Hashtag getHashtagList() {
		return this.hashtagList;
	}

	public Post getPostList() {
		return this.postList;
	}

	public AD getAdList() {
		// TODO - implement DataBase.getAdList
		throw new UnsupportedOperationException();
	}

}