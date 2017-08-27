package fi.vietjob.bean.employee;

import java.util.Date;

public interface Employee {
	public int getEmployeeID() ;
	public void setEmployeeID(int employeeID) ;
	public String getEmployeeName();
	public void setEmployeeName(String employeeName);
	public Date getEmployeeBOD();
	public void setEmployeeBOD(Date employeeBOD);
	public String getEmployeeAddress();
	public void setEmployeeAddress(String employeeAddress);
	public String getZipcode();
	public void setZipcode(String zipcode);
	public String getEmployeePhone();
	public void setEmployeePhone(String employeePhone);
	public int getNationalityID();
	public void setNationalityID(int nationalityID);
	public int getIndustryID();
	public void setIndustryID(int industryID);
	public String getLanguages();
	public void setLanguages(String languages);
	public String getCertificate();
	public void setCertificate(String certificate);
	public int getExperience();
	public void setExperience(int experience);
	public String getEmployeeSSN();
	public void setEmployeeSSN(String employeeSSN);
	public int getUserID();
	public void setUserID(int userID);
	public String getMoredetails() ;
	public void setMoredetails(String moredetails);
    
    
}
