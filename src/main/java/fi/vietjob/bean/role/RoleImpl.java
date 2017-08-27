package fi.vietjob.bean.role;

public class RoleImpl implements Role {
    private int roleID;
    private String role;
    
    
	/**
	 * @param roleID
	 * @param role
	 */
	public RoleImpl(int roleID, String role) {
		super();
		this.roleID = roleID;
		this.role = role;
	}
	public int getRoleID() {
		return roleID;
	}
	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
    
    
}
