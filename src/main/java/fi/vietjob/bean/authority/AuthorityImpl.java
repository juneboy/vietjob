package fi.vietjob.bean.authority;

import fi.vietjob.bean.role.Role;
import fi.vietjob.bean.user.User;

public class AuthorityImpl implements Authority {
    private int authorityID;
    private Role role;
    private User user;
    
    
	/**
	 * @param authorityID
	 * @param role
	 * @param user
	 */
	public AuthorityImpl(Role role, User user) {
		super();
		this.role = role;
		this.user = user;
	}
	public int getAuthorityID() {
		return authorityID;
	}
	public void setAuthorityID(int authorityID) {
		this.authorityID = authorityID;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
    
    
}
