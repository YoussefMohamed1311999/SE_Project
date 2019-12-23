package Content;

public class Post implements MyPost {


	private Integer postID;
	private String text;

	public void addToHashTag() {
		// TODO - implement Post.addToHashTag
		throw new UnsupportedOperationException();
	}

	public User like() {
		// TODO - implement Post.like
		throw new UnsupportedOperationException();
	}

	public User comment() {
		// TODO - implement Post.comment
		throw new UnsupportedOperationException();
	}

	public User share() {
		// TODO - implement Post.share
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param aGroup
	 */
	public User shareToGroup(Group aGroup) {
		// TODO - implement Post.shareToGroup
		throw new UnsupportedOperationException();
	}

	public Notification nnotify() {
		// TODO - implement Post.notify
		throw new UnsupportedOperationException();
	}

	public int getPostID() {
		// TODO - implement Post.getPostID
		throw new UnsupportedOperationException();
	}
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setPostID(Integer postID) {
		this.postID = postID;
	}


}