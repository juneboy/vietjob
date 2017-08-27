package fi.vietjob.bean.zipcode;

public class ZipcodeImpl implements Zipcode{
    private String zipcode;
    private String city;
    private String state;
    
    
    /**
	 * @param zipcode
	 * @param city
	 * @param state
	 */
	public ZipcodeImpl(String zipcode, String city, String state) {
		super();
		this.zipcode = zipcode;
		this.city = city;
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
    
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
    
    
}
