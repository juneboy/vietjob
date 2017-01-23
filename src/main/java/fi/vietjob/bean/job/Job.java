package fi.vietjob.bean.job;

import java.util.Date;

import fi.vietjob.bean.employer.Employer;
import fi.vietjob.bean.zipcode.Zipcode;

public interface Job {
	public int getJobID();
	public void setJobID(int jobID);
	public String getJobName();
	public void setJobName(String jobName);
	public Zipcode getZipcode();
	public void setZipcode(Zipcode zipcode);
	public String getJobDetails();
	public void setJobDetails(String jobDetails);
	public String getJobRequire();
	public void setJobRequire(String jobRequire);
	public Employer getEmployer();
	public void setEmployer(Employer employer);
	public String getPostDate();
	public void setPostDate(Date postDate);
	public String getExpDate();
	public void setExpDate(Date expDate);
}
