package fi.vietjob.bean.job;

import java.util.Date;

public class JobImpl implements Job{
    private int jobID;
    private String jobName;
    private String zipcode;
    private String jobDetails;
    private String jobRequire;
    private int employerID;
    private Date postDate;
    private Date expDate;
	/**
	 * @param jobID
	 * @param jobName
	 * @param zipcode
	 * @param jobDetails
	 * @param jobRequire
	 * @param employerID
	 * @param postDate
	 * @param expDate
	 */
	public JobImpl(int jobID, String jobName, String zipcode,
			String jobDetails, String jobRequire, int employerID,
			Date postDate, Date expDate) {
		super();
		this.jobID = jobID;
		this.jobName = jobName;
		this.zipcode = zipcode;
		this.jobDetails = jobDetails;
		this.jobRequire = jobRequire;
		this.employerID = employerID;
		this.postDate = postDate;
		this.expDate = expDate;
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
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
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
	public int getEmployerID() {
		return employerID;
	}
	public void setEmployerID(int employerID) {
		this.employerID = employerID;
	}
	public Date getPostDate() {
		return postDate;
	}
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	public Date getExpDate() {
		return expDate;
	}
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
    
            
}
