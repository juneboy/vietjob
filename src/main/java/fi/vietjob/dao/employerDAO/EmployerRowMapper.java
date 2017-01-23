package fi.vietjob.dao.employerDAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fi.vietjob.bean.employer.Employer;
import fi.vietjob.bean.employer.EmployerImpl;
import fi.vietjob.bean.industry.Industry;
import fi.vietjob.bean.industry.IndustryImpl;
import fi.vietjob.bean.user.User;
import fi.vietjob.bean.user.UserImpl;
import fi.vietjob.bean.zipcode.Zipcode;
import fi.vietjob.bean.zipcode.ZipcodeImpl;

public class EmployerRowMapper implements RowMapper<Employer>{

	public Employer mapRow(ResultSet rs, int row) throws SQLException {
		Employer em = new EmployerImpl(null, null, null, null, null, null, null);
		User user = new UserImpl(0, null, null, null, null);
		Industry in = new IndustryImpl(null);
		Zipcode zip = new ZipcodeImpl(null, null, null);
		
		in.setIndustryID(rs.getInt("industryID"));
		user.setUserID(rs.getInt("userID"));
		zip.setZipcode(rs.getString("zipcode"));
		
		em.setEmployerAddress(rs.getString("employerAddress"));
		em.setEmployerID(rs.getInt("employerID"));
		em.setEmployerName(rs.getString("employerName"));
		em.setEmployerPhone(rs.getString("employerPhone"));
		em.setEmployerPresent(rs.getString("employerPresent"));
		em.setIndustry(in);
		em.setUser(user);
		em.setZipcode(zip);
		
		return em;
	}

}
