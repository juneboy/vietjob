package fi.vietjob.dao.nationalityDAO;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import fi.vietjob.bean.nationality.Nationality;

@Repository
public class NationalityDaoImpl implements NationalityDao {

	@Inject
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Nationality> getAllNationality() {
		List<Nationality> list = new ArrayList<Nationality>();
		String sql = "select * from Nationality";
		RowMapper<Nationality> naRM = new NationalityRowMapper();
		list = jdbcTemplate.query(sql, naRM);
		return list;
	}

	public int insertNationality(Nationality na) {
		int row = 0;
		String sql = "insert into Nationality(nationality) values (?)";
		String nationality = na.getNationality();
		Object[] ob = new Object[]{nationality};
		row = jdbcTemplate.update(sql, ob);
		return row;
	}

	public int insertListNationality(List<Nationality> nationalities) {
		int row = 0;
		String sql = "insert into Nationality(nationality) values (?)";
		for (Nationality item : nationalities) {
			row++;
			String nationality = item.getNationality();
			Object[] ob = new Object[] { nationality };
			jdbcTemplate.update(sql, ob);
		}
		return row;
	}

	public int editNationality(Nationality na) {
		int row=0;
		String sql = "update Nationality set nationality =? where nationalityID=?";
		String nation = na.getNationality();
		int id = na.getNationalityID();
		Object[] ob = new Object[]{nation, id};
		row = jdbcTemplate.update(sql, ob);
		return row;
	}

	public int deleteNationality(int id) {
		int row=0;
		String sql = "delete from Nationality where nationalityID=?";
		Object[] ob = new Object[]{id};
		row = jdbcTemplate.update(sql, ob);
		return row;
	}

}
