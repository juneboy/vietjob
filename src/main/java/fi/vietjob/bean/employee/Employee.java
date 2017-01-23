package fi.vietjob.bean.employee;

import java.util.Date;

import fi.vietjob.bean.industry.Industry;
import fi.vietjob.bean.nationality.Nationality;
import fi.vietjob.bean.user.User;
import fi.vietjob.bean.zipcode.Zipcode;

public interface Employee {
	public int getEmployeeID();
	public void setEmployeeID(int employeeID);
	public String getEmployeeName();
	public void setEmployeeName(String name);
	public String getEmployeeBOD();
	public void setEmployeeBOD(Date bod);
	public String getEmployeeAddress();
	public void setEmployeeAddress(String address);
	public Zipcode getZipcode();
	public void setZipcode(Zipcode zipcode);
	public String getEmployeePhone();
	public void setEmployeePhone(String phone);
	public Nationality getNationality();
	public void setNationality(Nationality nationality);
	public Industry getIndustry();
	public void setIndustry(Industry industry);
	public String getLanguages();
	public void setLanguages(String languages);
	public String getCertificate();
	public void setCertificate(String certificate);
	public int getExperience();
	public void setExperience(int experience);
	public String getEmployeeSSN();
	public void setEmployeeSSN(String ssn);
	public User getUser();
	public void setUser(User user);
	public String getMoredetails();
	public void setMoredetails(String moredetails);
    
    
}
