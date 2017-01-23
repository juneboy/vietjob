package fi.vietjob.dao.nationalityDAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fi.vietjob.bean.nationality.Nationality;
import fi.vietjob.bean.nationality.NationalityImpl;

public class NationalityRowMapper implements RowMapper<Nationality> {

	public Nationality mapRow(ResultSet rs, int row) throws SQLException {
		Nationality na = new NationalityImpl(null);
		na.setNationalityID(rs.getInt("nationalityID"));
		na.setNationality(rs.getString("nationality"));
		return na;
	}

}
