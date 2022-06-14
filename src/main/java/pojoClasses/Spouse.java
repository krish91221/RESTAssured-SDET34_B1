package pojoClasses;

public class Spouse {
	String name;
	String eId;
	String organization;
	Long phone;
	public Spouse(String name, String eId, String organization, Long phone) {
		this.name = name;
		this.eId = eId;
		this.organization = organization;
		this.phone = phone;
	}
	public Spouse() {}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the organization
	 */
	public String getOrganization() {
		return organization;
	}
	/**
	 * @param organization the organization to set
	 */
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	/**
	 * @return the phone
	 */
	public Long getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	

}
