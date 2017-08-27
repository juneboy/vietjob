package fi.vietjob.bean.user;

public interface User {
    public void setUserID(int userID);
    public int getUserID();
    public int getEnabled();
	public void setEnabled(int enabled);
    public void setEmail(String email);
    public String getEmail();
    public void setPass(String pass);
    public String getPass();
    public String getSalt();
	public void setSalt(String salt);
	public String getImage();
	public void setImage(String image);
}
