package fi.vietjob.dao.roleDAO;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import fi.vietjob.bean.role.Role;

@Repository
public class RoleDaoImpl implements RoleDao {
	@Inject
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Role> getAllRole() {
		List<Role> list = new ArrayList<Role>();
		String sql = "select * from Role";
		RowMapper<Role> roleRM = new RoleRowMapper();
		list = jdbcTemplate.query(sql, roleRM);
		return list;
	}

	public int insertRole(Role role) {
		int row = 0;
		String sql = "insert into Role(roleID, role) values (?,?)";
		String name = role.getRole();
		int id = role.getRoleID();
		Object[] ob = new Object[]{id, name};
	    row = jdbcTemplate.update(sql, ob);
		return row;
	}

	public int editRole(Role role) {
		int row = 0;
		String sql = "update Role set role=? where roleID=?";
		String name = role.getRole();
		int id = role.getRoleID();
		Object[] ob = new Object[]{name, id};
		row = jdbcTemplate.update(sql, ob);
		return row;
	}

	public int deleteRole(int roleID) {
		int row = 0;
		String sql = "delete from Role where roleID=?";
		Object[] ob = new Object[]{roleID};
		row = jdbcTemplate.update(sql, ob);
		return row;
	}

	public int insertListRole(List<Role> roles) {
		String sql = "insert into Role(roleID, role) values (?,?)";
		int row=0;
		for(Role item : roles) {
			row++;
			Object[] ob = new Object[]{item.getRoleID(), item.getRole()};
			jdbcTemplate.update(sql, ob);
		}
		return row;
	}
	
}
