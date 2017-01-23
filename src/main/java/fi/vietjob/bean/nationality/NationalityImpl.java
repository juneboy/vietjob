package fi.vietjob.bean.nationality;

public class NationalityImpl implements Nationality{
    private int nationalityID;
    private String nationality;
    
    
	/**
	 * @param nationalityID
	 * @param nationality
	 */
	public NationalityImpl(String nationality) {
		super();
		this.nationality = nationality;
	}
	public int getNationalityID() {
		return nationalityID;
	}
	public void setNationalityID(int nationalityID) {
		this.nationalityID = nationalityID;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
    
    
}
