package fi.vietjob.dao.authorityDAO;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import fi.vietjob.bean.authority.Authority;

@Repository
public class AuthorityDaoImpl implements AuthorityDao {
	@Inject
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Authority> getAllAuthority() {
		List<Authority> list = new ArrayList<Authority>();
		String sql = "select * from Authority";
		RowMapper<Authority> authorityRM = new AuthorityRowMapper();
		list = jdbcTemplate.query(sql, authorityRM);
		return list;
	}

	public int insertAuthority(Authority authority) {
		int row=0;
		String sql = "insert into Authority(roleID_FK, userID_FK) values (?,?)";
		int roleID = authority.getRole().getRoleID();
		int userID = authority.getUser().getUserID();
		Object[] ob = new Object[]{roleID, userID};
		row = jdbcTemplate.update(sql, ob);
		return row;
	}

	public int editAuthority(Authority authority) {
		int row=0;
		String sql = "update Authority set roleID_FK=?, userID_FK=?";
		int roleID = authority.getRole().getRoleID();
		int userID = authority.getUser().getUserID();
		Object[] ob = new Object[]{roleID, userID};
		row = jdbcTemplate.update(sql, ob);
		return row;
	}

	public int deleteAuthority(int authorityID) {
		int row=0;
		String sql = "delete from Authority where authorityID=?";
		Object[] ob = new Object[]{authorityID};
		row = jdbcTemplate.update(sql, ob);
		return row;
	}

	public int insertListAuthority(List<Authority> authorities) {
		int row = 0;
		String sql = "insert into Authority(userID_FK, roleID_FK) values (?,?,?)";
		for(Authority a : authorities){
			row++;
			int roleID = a.getRole().getRoleID();
			int userID = a.getUser().getUserID();
			Object[] ob = new Object[]{userID, roleID };
			jdbcTemplate.update(sql, ob);
		}
		return row;
	}
	
	

}
