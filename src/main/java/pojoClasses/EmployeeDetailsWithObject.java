package pojoClasses;

public class EmployeeDetailsWithObject {
	//Step :1 Create variables Globally
	String eName;
	String eId;
	long[] phone;
	Spouse spouse;
	
	//Step :2 Create a Constructor
	public EmployeeDetailsWithObject(String eName, String eId, long[] phone, Spouse spouse) {
		this.eName = eName;
		this.eId = eId;
		this.phone = phone;
		this.spouse = spouse;
	}
	public EmployeeDetailsWithObject() {}
	//Step :3 Generate Getters and Setters
	/**
	 * @return the eName
	 */
	public String geteName() {
		return eName;
	}
	/**
	 * @param eName the eName to set
	 */
	public void seteName(String eName) {
		this.eName = eName;
	}
	/**
	 * @return the eId
	 */
	public String geteId() {
		return eId;
	}
	/**
	 * @param eId the eId to set
	 */
	public void seteId(String eId) {
		this.eId = eId;
	}
	/**
	 * @return the phone
	 */
	public long[] getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(long[] phone) {
		this.phone = phone;
	}
	/**
	 * @return the spouse
	 */
	public Spouse getSpouse() {
		return spouse;
	}
	/**
	 * @param spouse the spouse to set
	 */
	public void setSpouse(Spouse spouse) {
		this.spouse = spouse;
	}
}
