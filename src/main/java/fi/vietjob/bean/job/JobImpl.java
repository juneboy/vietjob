package fi.vietjob.bean.job;

import java.text.SimpleDateFormat;
import java.util.Date;

import fi.vietjob.bean.employer.Employer;
import fi.vietjob.bean.zipcode.Zipcode;

public class JobImpl implements Job{
    private int jobID;
    private String jobName;
    private Zipcode zipcode;
    private String jobDetails;
    private String jobRequire;
    private Employer employer;
    private Date postDate;
    private Date expDate;
    
    
    /**
	 * @param jobID
	 * @param jobName
	 * @param zipcode
	 * @param jobDetails
	 * @param jobRequire
	 * @param employer
	 * @param postDate
	 * @param expDate
	 * @param fm
	 */
	public JobImpl(int jobID, String jobName, Zipcode zipcode,
			String jobDetails, String jobRequire, Employer employer,
			Date postDate, Date expDate) {
		super();
		this.jobID = jobID;
		this.jobName = jobName;
		this.zipcode = zipcode;
		this.jobDetails = jobDetails;
		this.jobRequire = jobRequire;
		this.employer = employer;
		this.postDate = postDate;
		this.expDate = expDate;
	}
	SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd");
	public String getPostDate() {
		return fm.format(postDate);
	}
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	public String getExpDate() {
		return fm.format(expDate);
	}
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
	public Employer getEmployer() {
		return employer;
	}
	public void setEmployer(Employer employer) {
		this.employer = employer;
	}
	public int getJobID() {
		return jobID;
	}
	public void setJobID(int jobID) {
		this.jobID = jobID;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public Zipcode getZipcode() {
		return zipcode;
	}
	public void setZipcode(Zipcode zipcode) {
		this.zipcode = zipcode;
	}
	public String getJobDetails() {
		return jobDetails;
	}
	public void setJobDetails(String jobDetails) {
		this.jobDetails = jobDetails;
	}
	public String getJobRequire() {
		return jobRequire;
	}
	public void setJobRequire(String jobRequire) {
		this.jobRequire = jobRequire;
	}
    
    
}
