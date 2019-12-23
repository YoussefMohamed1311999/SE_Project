package Storage;

import Content.Group;
import Content.Post;
import Content.User;

import javax.activation.DataSource;
import java.util.HashMap;

//Singleton Persistence Layer Class
public class Persistence implements MyPersistence {

	private DataSource connection;

    //Singleton Instance
    private static Persistence instance;
    private HashMap<String, String> userPasswordMap = new HashMap<>();
    private HashMap<String, User> usersList = new HashMap<>();

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

	public void savePost() {
		// TODO - implement Persistence.savePost
		throw new UnsupportedOperationException();
	}

	public Post SelectPost() {
		// TODO - implement Persistence.SelectPost
		throw new UnsupportedOperationException();
	}

	public void saveUser() {
		// TODO - implement Persistence.saveUser
		throw new UnsupportedOperationException();
	}

    public User selectUser(String username, String password) throws PersistanceException {
        if (!userPasswordMap.containsKey(username)) throw new UserDoesNotExistException();
        if (!userPasswordMap.get(username).equals(password)) throw new UsernameAndPasswordDoesNotMatchException();
        return usersList.get(username);
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

    public void createUser(String username, String password) throws PersistanceException {
        try {
            selectUser(username, password);
        } catch (UserDoesNotExistException e) {
            userPasswordMap.put(username, password);
            usersList.put(username, new User());
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