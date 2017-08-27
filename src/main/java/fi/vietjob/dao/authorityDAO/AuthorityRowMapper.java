package fi.vietjob.dao.authorityDAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fi.vietjob.bean.authority.Authority;
import fi.vietjob.bean.authority.AuthorityImpl;

public class AuthorityRowMapper implements RowMapper<Authority>{

	public Authority mapRow(ResultSet rs, int row) throws SQLException {
		Authority a = new AuthorityImpl(0, 0, 0);
		a.setAuthorityID(rs.getInt("authorityID"));
	    a.setRoleID(rs.getInt("roleID_FK"));
		a.setUserID(rs.getInt("userID_FK"));
		return a;
	}

}
