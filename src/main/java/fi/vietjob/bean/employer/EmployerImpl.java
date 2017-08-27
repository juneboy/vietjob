package fi.vietjob.bean.employer;


public class EmployerImpl implements Employer{
    private int employerID;
    private String employerName;
    private String employerPresent;
    private String employerAddress;
    private String zipcode;
    private String employerPhone;
    private int userID;
    private int industryID;
	/**
	 * @param employerID
	 * @param employerName
	 * @param employerPresent
	 * @param employerAddress
	 * @param zipcode
	 * @param employerPhone
	 * @param userID
	 * @param industry
	 */
	public EmployerImpl(int employerID, String employerName,
			String employerPresent, String employerAddress, String zipcode,
			String employerPhone, int userID, int industry) {
		super();
		this.employerID = employerID;
		this.employerName = employerName;
		this.employerPresent = employerPresent;
		this.employerAddress = employerAddress;
		this.zipcode = zipcode;
		this.employerPhone = employerPhone;
		this.userID = userID;
		this.industryID = industry;
	}
	public int getEmployerID() {
		return employerID;
	}
	public void setEmployerID(int employerID) {
		this.employerID = employerID;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public String getEmployerPresent() {
		return employerPresent;
	}
	public void setEmployerPresent(String employerPresent) {
		this.employerPresent = employerPresent;
	}
	public String getEmployerAddress() {
		return employerAddress;
	}
	public void setEmployerAddress(String employerAddress) {
		this.employerAddress = employerAddress;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getEmployerPhone() {
		return employerPhone;
	}
	public void setEmployerPhone(String employerPhone) {
		this.employerPhone = employerPhone;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getIndustryID() {
		return industryID;
	}
	public void setIndustryID(int industryID) {
		this.industryID = industryID;
	}


	    
}
