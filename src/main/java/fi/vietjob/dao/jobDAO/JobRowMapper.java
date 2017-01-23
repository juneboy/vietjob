package fi.vietjob.dao.jobDAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fi.vietjob.bean.employer.Employer;
import fi.vietjob.bean.employer.EmployerImpl;

import fi.vietjob.bean.job.Job;
import fi.vietjob.bean.job.JobImpl;

import fi.vietjob.bean.zipcode.Zipcode;
import fi.vietjob.bean.zipcode.ZipcodeImpl;

public class JobRowMapper implements RowMapper<Job> {

	public Job mapRow(ResultSet rs, int row) throws SQLException {
		Zipcode zipcode = new ZipcodeImpl(null, null, null);
		Employer employer = new EmployerImpl( null, null, null, null, null, null, null);
		Job job = new JobImpl(0, null, null, null, null, null, null, null);
		
		/*zipcode*/
		zipcode.setZipcode(rs.getString("zipcode_FK"));
		
		/*employer*/
		employer.setEmployerID(rs.getInt("employerID_FK"));
		
		/*job*/
		job.setJobID(rs.getInt("jobID"));
		job.setPostDate(rs.getDate("postDate"));
		job.setExpDate(rs.getDate("expDate"));
		job.setJobName(rs.getString("jobName"));
		job.setZipcode(zipcode);
		job.setJobDetails(rs.getString("jobDetails"));
		job.setJobRequire(rs.getString("jobRequire"));
		job.setEmployer(employer);
		
		return job;
	}


}
