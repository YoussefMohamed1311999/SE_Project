package Content;

public interface MyPost {

	User like();

	User comment();

	User share();

	/**
	 * 
	 * @param aGroup
	 */
	User shareToGroup(Group aGroup);

}