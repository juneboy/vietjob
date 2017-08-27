package fi.vietjob.dao.employerDAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fi.vietjob.bean.employer.Employer;
import fi.vietjob.bean.employer.EmployerImpl;

public class EmployerRowMapper implements RowMapper<Employer>{

	public Employer mapRow(ResultSet rs, int row) throws SQLException {
		Employer em = new EmployerImpl(0, null, null, null, null, null, 0, 0);
		
		em.setEmployerAddress(rs.getString("employerAddress"));
		em.setEmployerID(rs.getInt("employerID"));
		em.setEmployerName(rs.getString("employerName"));
		em.setEmployerPhone(rs.getString("employerPhone"));
		em.setEmployerPresent(rs.getString("employerPresent"));
		em.setIndustryID(rs.getInt("industryID_FK"));
		em.setUserID(rs.getInt("userID_FK"));
		em.setZipcode(rs.getString("zipcode_FK"));
		
		return em;
	}

}
