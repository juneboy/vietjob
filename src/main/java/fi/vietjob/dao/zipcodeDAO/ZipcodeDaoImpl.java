package fi.vietjob.dao.zipcodeDAO;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import fi.vietjob.bean.zipcode.Zipcode;

@Repository
public class ZipcodeDaoImpl implements ZipcodeDao {
	@Inject
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insertZipcode(Zipcode zipcode) {
		int row = 0;
		String sql = "insert into Zipcode(zipcode,city,state) values (?,?,?)";
		String code = zipcode.getZipcode();
		String city = zipcode.getCity();
		String state = zipcode.getState();
		
		Object[] ob = new Object[]{code, city, state};
		row = jdbcTemplate.update(sql, ob);
		return row;
	}

	public List<Zipcode> getAllZipcode() {
		List<Zipcode> list = new ArrayList<Zipcode>();
		String sql = "select * from Zipcode";
		RowMapper<Zipcode> zipcodeRM = new ZipcodeRowMapper();
		list = jdbcTemplate.query(sql, zipcodeRM);
		return list;
	}

	public int editZipcode(Zipcode zipcode) {
		int row=0;
		String sql = "update Zipcode set city=?, state=? where zipcode=?";
		String code = zipcode.getZipcode();
		String city = zipcode.getCity();
		String state = zipcode.getState();
		
		Object[] ob = new Object[]{city, state, code};
		row = jdbcTemplate.update(sql, ob);
		return row;
	}

	public int insertListZipcode(List<Zipcode> list) {
		String sql = "insert into Zipcode(zipcode,city,state) values (?,?,?)";
		int row = 0;
		for(Zipcode item : list){
			row++;
			String code = item.getZipcode();
			String city = item.getCity();
			String state = item.getState();
			
			Object[] ob = new Object[]{code, city, state};
			jdbcTemplate.update(sql, ob);
		}
		return row;
	}

	public int deleteZipcode(int zipcode) {
		int row=0;
		String sql = "delete from Zipcode where zipcode=?";
		Object[] ob = new Object[]{zipcode};
		row = jdbcTemplate.update(sql, ob);
		return row;
	}
	
	

}
