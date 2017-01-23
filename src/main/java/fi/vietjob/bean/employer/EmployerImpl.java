package fi.vietjob.bean.employer;

import fi.vietjob.bean.industry.Industry;
import fi.vietjob.bean.user.User;
import fi.vietjob.bean.zipcode.Zipcode;

public class EmployerImpl implements Employer{
    private int employerID;
    private String employerName;
    private String employerPresent;
    private String employerAddress;
    private Zipcode zipcode;
    private String employerPhone;
    private User user;
    private Industry industry;
    
    
    
	/**
	 * @param employerID
	 * @param employerName
	 * @param employerPresent
	 * @param employerAddress
	 * @param zipcode
	 * @param employerPhone
	 * @param user
	 * @param industry
	 */
	public EmployerImpl(String employerName,
			String employerPresent, String employerAddress,
			String employerPhone, User user,Zipcode zipcode, Industry industry) {
		super();
		this.employerName = employerName;
		this.employerPresent = employerPresent;
		this.employerAddress = employerAddress;
		this.zipcode = zipcode;
		this.employerPhone = employerPhone;
		this.user = user;
		this.industry = industry;
	}
	public Industry getIndustry() {
		return industry;
	}
	public void setIndustry(Industry industry) {
		this.industry = industry;
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
	public Zipcode getZipcode() {
		return zipcode;
	}
	public void setZipcode(Zipcode zipcode) {
		this.zipcode = zipcode;
	}
	public String getEmployerPhone() {
		return employerPhone;
	}
	public void setEmployerPhone(String employerPhone) {
		this.employerPhone = employerPhone;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
    
    
}
