package fi.vietjob.dao.industryDAO;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import fi.vietjob.bean.industry.Industry;

@Repository
public class IndustryDaoImpl implements IndustryDao {
	@Inject
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Industry> getAllIndustry() {
		List<Industry> list = new ArrayList<Industry>();
		String sql = "select * from Industry";
		RowMapper<Industry> industryRM = new IndustryRowMapper();
		list = jdbcTemplate.query(sql, industryRM);
		return list;
	}

	public int insertIndustry(Industry industry) {
		int row=0;
		String sql = "insert into Industry(industry) values (?)";
		String name = industry.getIndustry();
		Object[] ob = new Object[]{name};
		row = jdbcTemplate.update(sql, ob);
		return row;
	}

	public int editIndustry(Industry industry) {
		int row=0;
		String sql = "update Industry set industry = ? where industryID=?";
		String name = industry.getIndustry();
		int id = industry.getIndustryID();
		Object[] ob = new Object[]{name, id};
		row = jdbcTemplate.update(sql, ob);
		return row;
	}

	public int insertListIndustry(List<Industry> industries) {
		String sql = "insert into Industry(industry) values (?)";
		int row=0;
		for(Industry i : industries){
			row++;
		    String name = i.getIndustry();
		    Object[] ob = new Object[]{name};
		    jdbcTemplate.update(sql, ob);
		}
		return row;
		
	}

	public int deleteIndustry(int id) {
		int row=0;
		String sql = "delete from Industry where industryID=?";
		Object[] ob = new Object[]{id};
	    row = jdbcTemplate.update(sql, ob);
		return row;
	}

	public Industry findIndustry(String industry) {
		Industry in = null;
		String sql = "select industry, industryID from Industry where industry = ?";
		Object[] ob = new Object[]{industry};
		RowMapper<Industry> rm = new IndustryRowMapper();
		
		try {
			in = jdbcTemplate.queryForObject(sql, ob, rm);
			return in;
		} catch (Exception e) {
			return null;
		}
	}
	
	

}
