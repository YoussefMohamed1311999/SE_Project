package Storage;

import Content.Group;
import Content.Post;
import Content.User;

import javax.activation.DataSource;
import java.util.ArrayList;
import java.util.HashMap;

//Singleton Persistence Layer Class
public class Persistence implements MyPersistence {

	private DataSource connection;

    //Singleton Instance
    private static Persistence instance;
    private HashMap<String, String> userPasswordMap = new HashMap<>();
    private HashMap<String, User> usersList = new HashMap<>();
    private HashMap<String, ArrayList<User>> userFriends = new HashMap<>();
    private HashMap<String, ArrayList<User>> userFriendRequests = new HashMap<>();

    private Persistence() {
    }

    //Thread-Safe singleton instance getter
    public static Persistence getInstance() {
        if (instance == null) {
            synchronized (Persistence.class) {
                if (instance == null) {
                    instance = new Persistence();
                }
            }
        }
        return instance;
    }

    @Override
    public void addFriendRequest(String username, User requestingUser) {
        ArrayList<User> newList = userFriendRequests.get(username);
        if (!newList.contains(requestingUser)) newList.add(requestingUser);
        userFriendRequests.replace(username, newList);
    }

    @Override
    public ArrayList<User> getFriendRequests(String username) {
        return userFriendRequests.get(username);
    }

    @Override
    public ArrayList<User> getFriendRequests(User user) {
        return getFriendRequests(user.getUserName());
    }

    @Override
    public void acceptFriendRequest(User user, int requestNumber) throws IndexOutOfBoundsException {
        ArrayList<User> newList = userFriendRequests.get(user.getUserName());
        User newFriend = newList.get(requestNumber);
        newList.remove(requestNumber);
        userFriendRequests.replace(user.getUserName(), newList);
        ArrayList<User> friends = userFriends.get(user.getUserName());
        friends.add(newFriend);
        userFriends.put(user.getUserName(), friends);
    }

    public void savePost() {
		// TODO - implement Persistence.savePost
		throw new UnsupportedOperationException();
	}

	public Post SelectPost() {
		// TODO - implement Persistence.SelectPost
		throw new UnsupportedOperationException();
	}

	public void saveUser(User user) {
		if (!userPasswordMap.containsKey(user.getUserName())) createUser(user);
		else {
			usersList.replace(user.getUsername, user);
		}
		throw new UnsupportedOperationException();
	}

    public User selectUser(User user) throws PersistenceException {
        if (!userPasswordMap.containsKey(user.getUserName())) throw new UserDoesNotExistException();
        if (!userPasswordMap.get(user.getUserName()).equals(user.getPassword()))
            throw new UsernameAndPasswordDoesNotMatchException();
        return usersList.get(user.getUserName());
	}


	public void saveGroup() {
		// TODO - implement Persistence.saveGroup
		throw new UnsupportedOperationException();
	}

	public Group selectGroup() {
		// TODO - implement Persistence.selectGroup
		throw new UnsupportedOperationException();
	}

	public void SQLpersistence() {
		// TODO - implement Persistence.SQLpersistence
		throw new UnsupportedOperationException();
	}

    public void createUser(User user) throws PersistenceException {
        try {
            selectUser(user);
        } catch (UserDoesNotExistException e) {
            if (user.getPassword().length() < 8) throw new PasswordTooShortException();
            userPasswordMap.put(user.getUserName(), user.getPassword());
            usersList.put(user.getUserName(), user);
            return;
        } catch (UsernameAndPasswordDoesNotMatchException e) {
            throw new UsernameAlreadyExists();
        }

        throw new UsernameAlreadyExists();
	}

	public void createGroup() {
		// TODO - implement Persistence.createGroup
		throw new UnsupportedOperationException();
	}


	public void createPost() {
		// TODO - implement Persistence.createPost
		throw new UnsupportedOperationException();
	}

	public void saveHashtag() {
		// TODO - implement Persistence.saveHashtag
		throw new UnsupportedOperationException();
	}

	public void removeHashtag() {
		// TODO - implement Persistence.removeHashtag
		throw new UnsupportedOperationException();
	}

	public void saveNotification() {
		// TODO - implement Persistence.saveNotification
		throw new UnsupportedOperationException();
	}

	public void removeNotification() {
		// TODO - implement Persistence.removeNotification
		throw new UnsupportedOperationException();
	}

	public void removeUser() {
		// TODO - implement Persistence.removeUser
		throw new UnsupportedOperationException();
	}

	public void removeGroup() {
		// TODO - implement Persistence.removeGroup
		throw new UnsupportedOperationException();
	}

	public void removePage() {
		// TODO - implement Persistence.removePage
		throw new UnsupportedOperationException();
	}

	public void removePost() {
		// TODO - implement Persistence.removePost
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param tyoe
	 */
	public void LoadDB(String tyoe) {
		// TODO - implement Persistence.LoadDB
		throw new UnsupportedOperationException();
	}

	public void saveAD() {
		// TODO - implement Persistence.saveAD
		throw new UnsupportedOperationException();
	}

	public void selectAD() {
		// TODO - implement Persistence.selectAD
		throw new UnsupportedOperationException();
	}

	public void removeAD() {
		// TODO - implement Persistence.removeAD
		throw new UnsupportedOperationException();
	}

}