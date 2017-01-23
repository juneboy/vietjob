package fi.vietjob.bean.employee;

import java.text.SimpleDateFormat;
import java.util.Date;

import fi.vietjob.bean.industry.Industry;
import fi.vietjob.bean.nationality.Nationality;
import fi.vietjob.bean.user.User;
import fi.vietjob.bean.zipcode.Zipcode;

public class EmployeeImpl implements Employee{
    private int employeeID;
    private String employeeName;
    private Date employeeBOD;
    private String employeeAddress;
    private Zipcode zipcode;
    private String employeePhone;
    private Nationality nationality;
    private Industry industry;
    private String languages;
    private String certificate;
    private int experience;
    private String employeeSSN;
    private User user;
    private String moredetails;
    
    
    
    /**
	 * @param employeeID
	 * @param employeeName
	 * @param employeeBOD
	 * @param employeeAddress
	 * @param zipcode
	 * @param employeePhone
	 * @param nationality
	 * @param industry
	 * @param languages
	 * @param certificate
	 * @param experience
	 * @param employeeSSN
	 * @param user
	 * @param moredetails
	 * @param fm
	 */
	public EmployeeImpl(String employeeName, Date employeeBOD,
			String employeeAddress, Zipcode zipcode, String employeePhone,
			Nationality nationality, Industry industry, String languages,
			String certificate, int experience, String employeeSSN, User user,
			String moredetails, SimpleDateFormat fm) {
		super();
		this.employeeName = employeeName;
		this.employeeBOD = employeeBOD;
		this.employeeAddress = employeeAddress;
		this.zipcode = zipcode;
		this.employeePhone = employeePhone;
		this.nationality = nationality;
		this.industry = industry;
		this.languages = languages;
		this.certificate = certificate;
		this.experience = experience;
		this.employeeSSN = employeeSSN;
		this.user = user;
		this.moredetails = moredetails;
		this.fm = fm;
	}
	SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd");
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String name) {
		this.employeeName = name;
	}
	public String getEmployeeBOD() {
		return fm.format(employeeBOD);
	}
	public void setEmployeeBOD(Date bod) {
		this.employeeBOD = bod;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String address) {
		this.employeeAddress = address;
	}
	public Zipcode getZipcode() {
		return zipcode;
	}
	public void setZipcode(Zipcode zipcode) {
		this.zipcode = zipcode;
	}
	public String getEmployeePhone() {
		return employeePhone;
	}
	public void setEmployeePhone(String phone) {
		this.employeePhone = phone;
	}
	public Nationality getNationality() {
		return nationality;
	}
	public void setNationality(Nationality nationality) {
		this.nationality = nationality;
	}
	public Industry getIndustry() {
		return industry;
	}
	public void setIndustry(Industry industry) {
		this.industry = industry;
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
	public void setEmployeeSSN(String ssn) {
		this.employeeSSN = ssn;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getMoredetails() {
		return moredetails;
	}
	public void setMoredetails(String moredetails) {
		this.moredetails = moredetails;
	}
    
    
    
}
