package pojoClasses;

public class EmployeeObject {
	String eName;
	String eId;
	String email[];
	long phone[];
	Object spouse;
	Object[] kids;
	public EmployeeObject(String eName, String eId, String[] email, long[] phone, Object spouse, Object[] kids) {
		this.eName = eName;
		this.eId = eId;
		this.email = email;
		this.phone = phone;
		this.spouse = spouse;
		this.kids = kids;
	}
	public EmployeeObject() {}
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
	public Object getSpouse() {
		return spouse;
	}
	/**
	 * @param spouse the spouse to set
	 */
	public void setSpouse(Object spouse) {
		this.spouse = spouse;
	}
	/**
	 * @return the kids
	 */
	public Object[] getKids() {
		return kids;
	}
	/**
	 * @param kids the kids to set
	 */
	public void setKids(Object[] kids) {
		this.kids = kids;
	}
}
