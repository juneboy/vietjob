package fi.vietjob.bean.employee;

import java.util.Date;

public class EmployeeImpl implements Employee{
    private int employeeID;
    private String employeeName;
    private Date employeeBOD;
    private String employeeAddress;
    private String zipcode;
    private String employeePhone;
    private int nationalityID;
    private int industryID;
    private String languages;
    private String certificate;
    private int experience;
    private String employeeSSN;
    private int userID;
    private String moredetails;
	/**
	 * @param employeeID
	 * @param employeeName
	 * @param employeeBOD
	 * @param employeeAddress
	 * @param zipcode
	 * @param employeePhone
	 * @param nationalityID
	 * @param industryID
	 * @param languages
	 * @param certificate
	 * @param experience
	 * @param employeeSSN
	 * @param userID
	 * @param moredetails
	 */
	public EmployeeImpl(int employeeID, String employeeName, Date employeeBOD,
			String employeeAddress, String zipcode, String employeePhone,
			int nationalityID, int industryID, String languages,
			String certificate, int experience, String employeeSSN, int userID,
			String moredetails) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeBOD = employeeBOD;
		this.employeeAddress = employeeAddress;
		this.zipcode = zipcode;
		this.employeePhone = employeePhone;
		this.nationalityID = nationalityID;
		this.industryID = industryID;
		this.languages = languages;
		this.certificate = certificate;
		this.experience = experience;
		this.employeeSSN = employeeSSN;
		this.userID = userID;
		this.moredetails = moredetails;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Date getEmployeeBOD() {
		return employeeBOD;
	}
	public void setEmployeeBOD(Date employeeBOD) {
		this.employeeBOD = employeeBOD;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getEmployeePhone() {
		return employeePhone;
	}
	public void setEmployeePhone(String employeePhone) {
		this.employeePhone = employeePhone;
	}
	public int getNationalityID() {
		return nationalityID;
	}
	public void setNationalityID(int nationalityID) {
		this.nationalityID = nationalityID;
	}
	public int getIndustryID() {
		return industryID;
	}
	public void setIndustryID(int industryID) {
		this.industryID = industryID;
	}
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}
	public String getCertificate() {
		return certificate;
	}
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getEmployeeSSN() {
		return employeeSSN;
	}
	public void setEmployeeSSN(String employeeSSN) {
		this.employeeSSN = employeeSSN;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getMoredetails() {
		return moredetails;
	}
	public void setMoredetails(String moredetails) {
		this.moredetails = moredetails;
	}
    
}
