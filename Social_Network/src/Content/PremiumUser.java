package Content;

import java.util.ArrayList;

public class PremiumUser extends User {

	private int adCount;
	private ArrayList<AD> adList;

	public PremiumUser(User user) {
		super(user);
		this.setPremium(true);
		adCount = 0;
		adList = new ArrayList<>();
	}

	public void postAD() {
		// TODO - implement PremiumUser.postAD
		throw new UnsupportedOperationException();
	}

	public int getAdCount() {
		return this.adCount;
	}

	/**
	 * 
	 * @param adCount
	 */
	public void setAdCount(int adCount) {
		this.adCount = adCount;
	}

	public ArrayList<AD> getAdList() {
		return this.adList;
	}

}