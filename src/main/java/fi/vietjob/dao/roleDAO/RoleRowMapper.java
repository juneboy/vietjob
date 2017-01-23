package fi.vietjob.dao.roleDAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fi.vietjob.bean.role.Role;
import fi.vietjob.bean.role.RoleImpl;

public class RoleRowMapper implements RowMapper<Role>{

	public Role mapRow(ResultSet rs, int row) throws SQLException {
		Role role = new RoleImpl(0, null);
		role.setRoleID(rs.getInt("roleID"));
		role.setRole(rs.getString("role"));
		return role;
	}

}
