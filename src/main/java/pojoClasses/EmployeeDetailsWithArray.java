package pojoClasses;

public class EmployeeDetailsWithArray {
	String eName;
	String eId;
	long [] phone;
	String [] email;
	public EmployeeDetailsWithArray(String eName, String eId, long[] phone, String[] email) {
		super();
		this.eName = eName;
		this.eId = eId;
		this.phone = phone;
		this.email = email;
	}
	
	public EmployeeDetailsWithArray()
	{}
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
	 * @return the email
	 */
	public String[] getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String[] email) {
		this.email = email;
	}
}
