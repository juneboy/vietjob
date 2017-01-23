package fi.vietjob.bean.authority;

import fi.vietjob.bean.role.Role;
import fi.vietjob.bean.user.User;

public interface Authority {
	
	public int getAuthorityID();
	public void setAuthorityID(int authorityID);
	public Role getRole();
	public void setRole(Role role);
	public User getUser();
	public void setUser(User user);
}
