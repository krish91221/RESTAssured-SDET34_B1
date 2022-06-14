package pojoClasses;

public class Kid1 {
	String kid1Name;
	String Kid1Id;
	public Kid1(String kid1Name, String kid1Id) {
		super();
		this.kid1Name = kid1Name;
		Kid1Id = kid1Id;
	}
	public Kid1() {}
	/**
	 * @return the kid1Name
	 */
	public String getKid1Name() {
		return kid1Name;
	}
	/**
	 * @param kid1Name the kid1Name to set
	 */
	public void setKid1Name(String kid1Name) {
		this.kid1Name = kid1Name;
	}
	/**
	 * @return the kid1Id
	 */
	public String getKid1Id() {
		return Kid1Id;
	}
	/**
	 * @param kid1Id the kid1Id to set
	 */
	public void setKid1Id(String kid1Id) {
		Kid1Id = kid1Id;
	}
}
