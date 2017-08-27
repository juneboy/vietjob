package fi.vietjob.dao.industryDAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fi.vietjob.bean.industry.Industry;
import fi.vietjob.bean.industry.IndustryImpl;

public class IndustryRowMapper implements RowMapper<Industry> {

	public Industry mapRow(ResultSet rs, int row) throws SQLException {
		Industry industry = new IndustryImpl(null);
		industry.setIndustryID(rs.getInt("industryID"));
		industry.setIndustry(rs.getString("industry"));
		return industry;
	}

}
