package fi.vietjob.dao.zipcodeDAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fi.vietjob.bean.zipcode.Zipcode;
import fi.vietjob.bean.zipcode.ZipcodeImpl;

public class ZipcodeRowMapper implements RowMapper<Zipcode>{

	public Zipcode mapRow(ResultSet rs, int row) throws SQLException {
		Zipcode zipcode = new ZipcodeImpl(null, null, null);
		zipcode.setZipcode(rs.getString("zipcode"));
		zipcode.setCity(rs.getString("city"));
		zipcode.setState(rs.getString("state"));
		return zipcode;
	}
     
}
