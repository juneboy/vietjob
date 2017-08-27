package fi.vietjob.bean.authority;


public class AuthorityImpl implements Authority {
    private int authorityID;
    private int roleID;
    private int userID;
	/**
	 * @param authorityID
	 * @param roleID
	 * @param userID
	 */
	public AuthorityImpl(int authorityID, int roleID, int userID) {
		super();
		this.authorityID = authorityID;
		this.roleID = roleID;
		this.userID = userID;
	}
	public int getAuthorityID() {
		return authorityID;
	}
	public void setAuthorityID(int authorityID) {
		this.authorityID = authorityID;
	}
	public int getRoleID() {
		return roleID;
	}
	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
    

    
}
