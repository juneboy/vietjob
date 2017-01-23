package fi.vietjob.dao.authorityDAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fi.vietjob.bean.authority.Authority;
import fi.vietjob.bean.authority.AuthorityImpl;
import fi.vietjob.bean.role.Role;
import fi.vietjob.bean.role.RoleImpl;
import fi.vietjob.bean.user.User;
import fi.vietjob.bean.user.UserImpl;

public class AuthorityRowMapper implements RowMapper<Authority>{

	public Authority mapRow(ResultSet rs, int row) throws SQLException {
		Authority authority = new AuthorityImpl(null, null);
		Role role = new RoleImpl(row, null);
		User user = new UserImpl(0, null, null, null, null);
		
		role.setRoleID(rs.getInt("roleID_FK"));
		user.setUserID(rs.getInt("userID_FK"));
		
		authority.setAuthorityID(rs.getInt("authorityID"));
		authority.setRole(role);
		authority.setUser(user);
		return authority;
	}

}
