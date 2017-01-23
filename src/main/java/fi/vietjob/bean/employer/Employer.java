package fi.vietjob.bean.employer;

import fi.vietjob.bean.industry.Industry;
import fi.vietjob.bean.user.User;
import fi.vietjob.bean.zipcode.Zipcode;

public interface Employer {
	public int getEmployerID();
	public void setEmployerID(int employerID);
	public String getEmployerName();
	public void setEmployerName(String employerName);
	public String getEmployerPresent();
	public void setEmployerPresent(String employerPresent);
	public String getEmployerAddress();
	public void setEmployerAddress(String employerAddress);
	public Zipcode getZipcode();
	public void setZipcode(Zipcode zipcode);
	public String getEmployerPhone();
	public void setEmployerPhone(String employerPhone);
	public User getUser();
	public void setUser(User user);
	public Industry getIndustry();
	public void setIndustry(Industry industry);
    
}
