package fi.vietjob.dao.userDAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fi.vietjob.bean.user.User;
import fi.vietjob.bean.user.UserImpl;

public class UserRowMapper implements RowMapper<User> {

	public User mapRow(ResultSet rs, int row) throws SQLException {
        User user = new UserImpl(0, null, null, null, null);
        user.setUserID(rs.getInt("userID"));
        user.setEmail(rs.getString("email"));
        user.setEnabled(rs.getInt("enabled"));
        user.setPass(rs.getString("pass"));
        user.setSalt(rs.getString("salt"));
        user.setImage(rs.getString("image"));
		return user;
	}

}
