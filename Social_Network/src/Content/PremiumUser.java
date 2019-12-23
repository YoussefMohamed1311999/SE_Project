package Content;

public class PremiumUser extends User {

	private int adCount;
	private AD adList;

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

	public AD getAdList() {
		return this.adList;
	}

}