package fi.vietjob.dao.employerDAO;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import fi.vietjob.bean.employer.Employer;
import fi.vietjob.feature.RandomNumber;

@Repository
public class EmployerDaoImpl implements EmployerDao {
	@Inject
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Employer> getAllEmployer() {
		List<Employer> list = new ArrayList<Employer>();
		String sql = "select * from Employer";
		RowMapper<Employer> employerRM = new EmployerRowMapper();
		list = jdbcTemplate.query(sql, employerRM);
		return list;
	}

	public List<Employer> getAllEmployerByKeyword(String column, String keyword) {
		List<Employer> list = new ArrayList<Employer>();
		String sql = "select * from Employer where "+column+"=?";
		Object[] ob = new Object[]{keyword};
		RowMapper<Employer> employerRM = new EmployerRowMapper();
		list = jdbcTemplate.query(sql, ob, employerRM);
		return list;
	}

	public int insertEmployer(Employer e) {
		int row=0;
		String sql = "insert into Employer(employerID, employerName, employerPresent, employerAddress, zipcode_FK, employerPhone, userID_FK, industryID_FK) values (?,?,?,?,?,?,?,?)";
		int id = RandomNumber.getEmployerId();
		String name = e.getEmployerName();
		String present = e.getEmployerPresent();
		String add = e.getEmployerAddress();
		String zipcode = e.getZipcode().getZipcode();
		String phone = e.getEmployerPhone();
		int userID = e.getUser().getUserID();
		int industryID = e.getIndustry().getIndustryID();
		Object[] ob = new Object[]{id, name, present, add, zipcode, phone, userID, industryID};
		row = jdbcTemplate.update(sql, ob);
		return row;
	}

	public int insertListEmployer(List<Employer> employers) {
		int row = 0;
		String sql = "insert into Employer(employerID, employerName, employerPresent, employerAddress, zipcode_FK, employerPhone, userID_FK, industryID_FK) values (?,?,?,?,?,?,?,?)";
		for (Employer e : employers) {
			row++;
			int id = RandomNumber.getEmployerId();
			String name = e.getEmployerName();
			String present = e.getEmployerPresent();
			String add = e.getEmployerAddress();
			String zipcode = e.getZipcode().getZipcode();
			String phone = e.getEmployerPhone();
			int userID = e.getUser().getUserID();
			int industryID = e.getIndustry().getIndustryID();
			Object[] ob = new Object[] { id, name, present, add, zipcode, phone,
					userID, industryID };
			jdbcTemplate.update(sql, ob);
		}
		return row;
	}

	public int editEmployer(Employer e) {
		int row=0;
		String sql = "update Employer set employerName=?, employerPresent=?, employerAddress=?, zipcode_FK=?, employerPhone=?, userID_FK=?, industryID_FK=? where employerID =?";
		String name = e.getEmployerName();
		String present = e.getEmployerPresent();
		String add = e.getEmployerAddress();
		String zipcode = e.getZipcode().getZipcode();
		String phone = e.getEmployerPhone();
		int userID = e.getUser().getUserID();
		int industryID = e.getIndustry().getIndustryID();
		int id = e.getEmployerID();
		Object[] ob = new Object[]{name, present, add, zipcode, phone, userID, industryID, id};
		row = jdbcTemplate.update(sql, ob);
		return row;	
		}

	public int deleteEmployer(int id) {
		int row=0;
		String sql = "delete from Employer where employerID=?";
		Object[] ob = new Object[]{id};
		row = jdbcTemplate.update(sql, ob);
		return row;
	}

}
