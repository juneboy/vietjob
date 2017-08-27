package fi.vietjob.bean.industry;

public class IndustryImpl implements Industry {
    private int industryID;
    private String industry;
    
    
	/**
	 * @param industryID
	 * @param industry
	 */
	public IndustryImpl(String industry) {
		super();
		this.industry = industry;
	}
	public int getIndustryID() {
		return industryID;
	}
	public void setIndustryID(int industryID) {
		this.industryID = industryID;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
    
    
}
