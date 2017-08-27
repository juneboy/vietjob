package fi.vietjob.dao.userDAO;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.stereotype.Repository;

import fi.vietjob.bean.user.User;

@Repository
public class UserDaoImpl implements UserDao {
	@Inject
	@Qualifier("jdbcTemplate")
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
    

	public List<User> getAllUser() {
		List<User> list = new ArrayList<User>();
		String sql = "select * from User";
		RowMapper<User> userRM = new UserRowMapper();
		list = jdbcTemplate.query(sql, userRM);
		return list;
	}
	
	public int insertUser(User user, StandardPasswordEncoder encoder){
		int row=0;
		String sql = "insert into User(email, pass, salt, enabled, image) values (?,?,?,?,?)";
		String email = user.getEmail().toLowerCase();
		String pass = user.getPass();
		String hassedPassword = encoder.encode(pass);
		String salt = user.getSalt();
		int enabled = user.getEnabled();
		String image = user.getImage();
		Object[] ob = new Object[]{email, hassedPassword, salt, enabled, image};
		row= jdbcTemplate.update(sql, ob);
		return row;
	}

	public int editUser(User user) {
		int row=0;
		String sql = "update User set email=?,pass=? where userID=?";
		String email = user.getEmail();
		String pass = user.getPass();
		int userID = user.getUserID();
		Object[] ob = new Object[]{email, pass, userID};
		row = jdbcTemplate.update(sql, ob);
		return row;
	}

	public int deleteUser(int id) {
		int row=0;
		String sql = "delete from User where userID=?";
		Object[] ob = new Object[]{id};
		row = jdbcTemplate.update(sql, ob);
		return row;
	}

}
