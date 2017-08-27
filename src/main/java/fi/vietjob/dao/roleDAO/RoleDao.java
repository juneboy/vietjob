package fi.vietjob.dao.roleDAO;

import java.util.List;

import fi.vietjob.bean.role.Role;

public interface RoleDao {
    public List<Role> getAllRole();
    public int insertRole(Role role);
    public int editRole(Role role);
    public int deleteRole(int roleID);
    public int insertListRole(List<Role> roles);
}
