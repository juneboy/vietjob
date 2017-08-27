package fi.vietjob.bean.job;

import java.util.Date;

public interface Job {
	public int getJobID();
	public void setJobID(int jobID);
	public String getJobName();
	public void setJobName(String jobName);
	public String getZipcode();
	public void setZipcode(String zipcode) ;
	public String getJobDetails();
	public void setJobDetails(String jobDetails);
	public String getJobRequire();
	public void setJobRequire(String jobRequire);
	public int getEmployerID();
	public void setEmployerID(int employerID);
	public Date getPostDate();
	public void setPostDate(Date postDate);
	public Date getExpDate();
	public void setExpDate(Date expDate);
    
}
